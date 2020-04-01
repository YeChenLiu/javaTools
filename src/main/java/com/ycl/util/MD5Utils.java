package com.ycl.util;


import org.apache.commons.codec.digest.DigestUtils;

import java.io.FileInputStream;
import java.io.IOException;

public class MD5Utils {
    public static String md5ForFilePath(String path) throws IOException {
        return DigestUtils.md5Hex(new FileInputStream(path));
    }
}
