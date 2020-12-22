package com.ycl;

import ch.qos.logback.core.util.FileUtil;
import org.jsoup.helper.StringUtil;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * @ClassName Command
 * @Description
 * @Author chenxi
 * @Date 2019/9/5
 * @Version 1.0
 */
public class Command {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Command.signerApk(null,"F:\\文档\\打包系统android新签名\\a.apk","D:\\company\\test\\taskPack\\taskPack\\jks\\youlong_123456.jks","youlong","123456");
        Command.signApkV3(null,"F:\\文档\\打包系统android新签名\\d.apk","D:\\company\\test\\taskPack\\taskPack\\jks\\youlong_123456.jks","youlong","123456");
        }
    }

    /**
     * 需要安装JDK 不带时间错的apk签名
     *
     * @param apkFilePath      被签名apk文件路径
     * @param keystoreFilePath 签名文件路径
     * @param alias            签名文件的alias名称
     * @param password         签名文件密码
     */
    public static boolean signerApk(Packing pack, String apkFilePath, String keystoreFilePath, String alias, String password) {
        long start = System.currentTimeMillis();
        boolean a = executeCommand(pack, "jarsigner", "-verbose", "-sigalg", "SHA1withRSA", "-digestalg", "SHA1", "-keystore",
                keystoreFilePath, apkFilePath, alias, "-storepass", password);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return a;
    }

    public static boolean signApkV3(Packing pack, String apkPath, String keystoreFilePath, String alias, String password) {
        long start = System.currentTimeMillis();
       boolean a = executeCommand(pack, "java", "-jar", "D:\\company\\test\\taskPack\\taskPack\\android-sign\\apksigner_v2.jar",
                "sign", "--ks", keystoreFilePath,
                "--ks-key-alias", alias,
                "--ks-pass", "pass:" + password,
                "--key-pass", "pass:" + password,
                "--out", apkPath, apkPath);
        long end = System.currentTimeMillis();
        System.out.println("v3  "+(end - start));
        return a;
    }

    /**
     * 执行命令
     *
     * @param command 命令
     */
    private static boolean executeCommand(Packing pack, String... command) {

        String tempStr = "";
        for (String string : command) {
            tempStr += (string + " ");
        }

        Process process = null;
        BufferedReader reader = null;
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            ProcessBuilder builder = new ProcessBuilder();
            builder.command(command);
            builder.redirectErrorStream(true);
            process = builder.start();

            inputStream = process.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream, Charset.forName("GBK"));
            reader = new BufferedReader(inputStreamReader);
            String line;
            boolean existsException = false;
            while ((line = reader.readLine()) != null) {
                //LogUtil.info(Command.class, line);
                if ((line.contains("Exception") && line.contains("java.lang"))
                        || line.contains("Unable to open")
                        || line.contains("brut.common.BrutException")
                        || line.contains("brut.androlib.AndrolibException")
                        || line.contains("Error:")) {

                    System.out.println(line);
                    //将错误信息 写在服务器ExceptionFile文件里
                   /* BufferedWriter out = new BufferedWriter(
                            new OutputStreamWriter(new FileOutputStream(new File(Resource.ROOT_Exception+pack.getPlatformNo()+pack.getCuserId()+pack.getGamePid()+".txt"),true)));
                    out.write(line);
                    out.close();
                    pack.setExceptionUrl(Resource.ROOT_Exception+pack.getPlatformNo()+pack.getCuserId()+pack.getGamePid()+".txt");*/
                    existsException = true;
                }
            }
            if (existsException) {
                return false;
            }

            inputStream.close();
            inputStream = null;
            inputStreamReader.close();
            inputStreamReader = null;
            reader.close();
            reader = null;
            return true;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (process != null) {
                process.destroy();
            }
        }
        return false;
    }
}
