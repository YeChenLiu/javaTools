package com.ycl;

import java.util.Date;

/**
 * @ClassName Packing
 * @Description
 * @Author chenxi
 * @Date 2019/9/17
 * @Version 1.0
 */
public class Packing {

    private Integer id;

    private String platformNo;

    private String cuserId;

    private String gamePid;

    private String packType;

    private String packageSuffix;

    private String feedbackUrl;

    private String parentPackagePath;

    private String childPackagePath;

    private String priority;

    private String platId;

    private String other;

    private String sourceId;

    private String attachData;

    private String plistJson;

    private String iosExtendJson;

    private String qpGameJson;

    private String cuserAccount;

    private String buserId;

    private String buserAccount;

    private String ychId;

    private String ychAccount;

    private String ychName;

    private String gameName;

    private String plistUrl;

    private Long packageFileSize;

    private Long packageUpdateTime;

    private String packageMd5;

    private String packStatus;

    private String isCountTask;

    private String packServerUrl;

    private String isSend;

    private Date sendTime;

    private Date finishTime;

    private Integer quartzNum;

    private Date createTime;

    private String remark;

    //版本号
    private String sdkVersion;

    //队列状态 1-正常 2-优先
    private String queueStatue;

    //上传服务器类型 1=阿里云，2=腾讯云
    private String ossType;

    //上传后文件名称, 可以带有OSS空间目录
    private String ossObjectName;

    //上传的OSS服务器名称：阿里云，腾讯云
    private String ossServerName;

    //推送oss打包队列的queue地址
    private String ossServerUrl;

    //选择APKtool的类型
    private String apkTool;

    //本地文件绝对路径
    private String buildOutPath;

    //本地文件ipa存储路径
    private String buildOutIpaPath;

    //推送cdn刷新队列的queue地址
    private String cdnServerUrl;

    //删除外部全部文件夹的绝对路径
    private String deleteUrl;

    //apk或者ipa打包失败的报错文本记录
    private String exceptionUrl;

    //query
    private String  channelId;

    //打包重试次数
    private Integer packAgainNumber;

    //上传重试次数
    private Integer uploadAgainNumber;

    //刷新重试次数
    private Integer cdnAgainNumber;

    //APK打包根据平台对应的jks
    private String keyStorePath;

    //APK签名文件的账号
    private String keyAlias;

    //APK签名文件的密码
    private String keyPasswd;

    //母包下载地址
    private String downLoadUrl;

    //是否更新表示 0-表示未更新 1-表示已更新过的数据
    private Integer updateFlag;

    //记录打包中产生的异常日志
    private String exceptionMessage;

    //记录打包中产生的异常发生的时间
    private Date exceptionTime;

    private String bundleId;

    private String gamePackageSize;

    public String getGamePackageSize() {
        return gamePackageSize;
    }

    public void setGamePackageSize(String gamePackageSize) {
        this.gamePackageSize = gamePackageSize;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    public String getExceptionMessage() {
        return exceptionMessage;
    }

    public String getExceptionUrl() {
        return exceptionUrl;
    }

    public void setExceptionUrl(String exceptionUrl) {
        this.exceptionUrl = exceptionUrl;
    }

    public void setExceptionMessage(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public Date getExceptionTime() {
        return exceptionTime;
    }

    public void setExceptionTime(Date exceptionTime) {
        this.exceptionTime = exceptionTime;
    }

    public Integer getUpdateFlag() {
        return updateFlag;
    }

    public void setUpdateFlag(Integer updateFlag) {
        this.updateFlag = updateFlag;
    }

    public String getDownLoadUrl() {
        return downLoadUrl;
    }

    public void setDownLoadUrl(String downLoadUrl) {
        this.downLoadUrl = downLoadUrl;
    }


    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String getBuildOutIpaPath() {
        return buildOutIpaPath;
    }

    public void setBuildOutIpaPath(String buildOutIpaPath) {
        this.buildOutIpaPath = buildOutIpaPath;
    }

    public Integer getCdnAgainNumber() {
        return cdnAgainNumber;
    }

    public void setCdnAgainNumber(Integer cdnAgainNumber) {
        this.cdnAgainNumber = cdnAgainNumber;
    }

    public String getQueueStatue() {
        return queueStatue;
    }

    public void setQueueStatue(String queueStatue) {
        this.queueStatue = queueStatue;
    }

    public String getOssType() {
        return ossType;
    }

    public void setOssType(String ossType) {
        this.ossType = ossType;
    }

    public String getOssObjectName() {
        return ossObjectName;
    }

    public void setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
    }

    public String getOssServerName() {
        return ossServerName;
    }

    public void setOssServerName(String ossServerName) {
        this.ossServerName = ossServerName;
    }

    public String getOssServerUrl() {
        return ossServerUrl;
    }

    public void setOssServerUrl(String ossServerUrl) {
        this.ossServerUrl = ossServerUrl;
    }

    public String getApkTool() {
        return apkTool;
    }

    public void setApkTool(String apkTool) {
        this.apkTool = apkTool;
    }

    public String getBuildOutPath() {
        return buildOutPath;
    }

    public void setBuildOutPath(String buildOutPath) {
        this.buildOutPath = buildOutPath;
    }

    public String getCdnServerUrl() {
        return cdnServerUrl;
    }

    public void setCdnServerUrl(String cdnServerUrl) {
        this.cdnServerUrl = cdnServerUrl;
    }

    public String getDeleteUrl() {
        return deleteUrl;
    }

    public void setDeleteUrl(String deleteUrl) {
        this.deleteUrl = deleteUrl;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public Integer getPackAgainNumber() {
        return packAgainNumber;
    }

    public void setPackAgainNumber(Integer packAgainNumber) {
        this.packAgainNumber = packAgainNumber;
    }

    public Integer getUploadAgainNumber() {
        return uploadAgainNumber;
    }

    public void setUploadAgainNumber(Integer uploadAgainNumber) {
        this.uploadAgainNumber = uploadAgainNumber;
    }

    public String getKeyStorePath() {
        return keyStorePath;
    }

    public void setKeyStorePath(String keyStorePath) {
        this.keyStorePath = keyStorePath;
    }

    public String getKeyAlias() {
        return keyAlias;
    }

    public void setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
    }

    public String getKeyPasswd() {
        return keyPasswd;
    }

    public void setKeyPasswd(String keyPasswd) {
        this.keyPasswd = keyPasswd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(String platformNo) {
        this.platformNo = platformNo == null ? null : platformNo.trim();
    }

    public String getCuserId() {
        return cuserId;
    }

    public void setCuserId(String cuserId) {
        this.cuserId = cuserId == null ? null : cuserId.trim();
    }

    public String getGamePid() {
        return gamePid;
    }

    public void setGamePid(String gamePid) {
        this.gamePid = gamePid == null ? null : gamePid.trim();
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType == null ? null : packType.trim();
    }

    public String getPackageSuffix() {
        return packageSuffix;
    }

    public void setPackageSuffix(String packageSuffix) {
        this.packageSuffix = packageSuffix == null ? null : packageSuffix.trim();
    }

    public String getFeedbackUrl() {
        return feedbackUrl;
    }

    public void setFeedbackUrl(String feedbackUrl) {
        this.feedbackUrl = feedbackUrl == null ? null : feedbackUrl.trim();
    }

    public String getParentPackagePath() {
        return parentPackagePath;
    }

    public void setParentPackagePath(String parentPackagePath) {
        this.parentPackagePath = parentPackagePath == null ? null : parentPackagePath.trim();
    }

    public String getChildPackagePath() {
        return childPackagePath;
    }

    public void setChildPackagePath(String childPackagePath) {
        this.childPackagePath = childPackagePath == null ? null : childPackagePath.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    public String getPlatId() {
        return platId;
    }

    public void setPlatId(String platId) {
        this.platId = platId == null ? null : platId.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getAttachData() {
        return attachData;
    }

    public void setAttachData(String attachData) {
        this.attachData = attachData == null ? null : attachData.trim();
    }

    public String getPlistJson() {
        return plistJson;
    }

    public void setPlistJson(String plistJson) {
        this.plistJson = plistJson == null ? null : plistJson.trim();
    }

    public String getIosExtendJson() {
        return iosExtendJson;
    }

    public void setIosExtendJson(String iosExtendJson) {
        this.iosExtendJson = iosExtendJson == null ? null : iosExtendJson.trim();
    }

    public String getQpGameJson() {
        return qpGameJson;
    }

    public void setQpGameJson(String qpGameJson) {
        this.qpGameJson = qpGameJson == null ? null : qpGameJson.trim();
    }

    public String getCuserAccount() {
        return cuserAccount;
    }

    public void setCuserAccount(String cuserAccount) {
        this.cuserAccount = cuserAccount == null ? null : cuserAccount.trim();
    }

    public String getBuserId() {
        return buserId;
    }

    public void setBuserId(String buserId) {
        this.buserId = buserId == null ? null : buserId.trim();
    }

    public String getBuserAccount() {
        return buserAccount;
    }

    public void setBuserAccount(String buserAccount) {
        this.buserAccount = buserAccount == null ? null : buserAccount.trim();
    }

    public String getYchId() {
        return ychId;
    }

    public void setYchId(String ychId) {
        this.ychId = ychId == null ? null : ychId.trim();
    }

    public String getYchAccount() {
        return ychAccount;
    }

    public void setYchAccount(String ychAccount) {
        this.ychAccount = ychAccount == null ? null : ychAccount.trim();
    }

    public String getYchName() {
        return ychName;
    }

    public void setYchName(String ychName) {
        this.ychName = ychName == null ? null : ychName.trim();
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName == null ? null : gameName.trim();
    }

    public String getPlistUrl() {
        return plistUrl;
    }

    public void setPlistUrl(String plistUrl) {
        this.plistUrl = plistUrl == null ? null : plistUrl.trim();
    }

    public Long getPackageFileSize() {
        return packageFileSize;
    }

    public void setPackageFileSize(Long packageFileSize) {
        this.packageFileSize = packageFileSize;
    }

    public Long getPackageUpdateTime() {
        return packageUpdateTime;
    }

    public void setPackageUpdateTime(Long packageUpdateTime) {
        this.packageUpdateTime = packageUpdateTime;
    }

    public String getPackageMd5() {
        return packageMd5;
    }

    public void setPackageMd5(String packageMd5) {
        this.packageMd5 = packageMd5 == null ? null : packageMd5.trim();
    }

    public String getPackStatus() {
        return packStatus;
    }

    public void setPackStatus(String packStatus) {
        this.packStatus = packStatus == null ? null : packStatus.trim();
    }


    public String getIsCountTask() {
        return isCountTask;
    }

    public void setIsCountTask(String isCountTask) {
        this.isCountTask = isCountTask == null ? null : isCountTask.trim();
    }

    public String getPackServerUrl() {
        return packServerUrl;
    }

    public void setPackServerUrl(String packServerUrl) {
        this.packServerUrl = packServerUrl == null ? null : packServerUrl.trim();
    }

    public String getIsSend() {
        return isSend;
    }

    public void setIsSend(String isSend) {
        this.isSend = isSend == null ? null : isSend.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getQuartzNum() {
        return quartzNum;
    }

    public void setQuartzNum(Integer quartzNum) {
        this.quartzNum = quartzNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}