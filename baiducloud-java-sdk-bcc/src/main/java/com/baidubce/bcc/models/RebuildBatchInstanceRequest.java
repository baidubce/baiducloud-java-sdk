package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RebuildBatchInstanceRequest extends BaseBceRequest {

    /**
    * 待指定的镜像ID
    */
    private String imageId;

    /**
    * 是否使用镜像预设的密码，默认取值：false。true：表示使用镜像中预设的密码; false：表示不使用镜像中预设的密码。 1. 若取值为“true”，则password、keypairId需为空。 2. 仅支持镜像为自定义镜像或共享镜像。
    */
    private Boolean keepImageLogin;

    /**
    * 仅对ebc实例本地盘生效。是否保留数据重装。当值为true时，raidId和sysRootSize字段不生效
    */
    private Boolean isPreserveData;

    /**
    * 机器密码，密码需要加密传输，详见密码加密传输规范 ，必须传递adminPass、keypairId其中一个参数
    */
    private String adminPass;

    /**
    * 是否开启主机安全，默认true
    */
    private Boolean isOpenHostEye;

    /**
    * 仅对ebc实例生效。系统盘大小
    */
    private Integer sysRootSize;

    /**
    * 待重装实例所要绑定的密钥对ID，必须传递adminPass、keypairId其中一个参数
    */
    private String keypairId;

    /**
    * 仅对ebc实例生效。数据盘分区格式
    */
    private String dataPartitionType;

    /**
    * 仅对ebc实例生效。系统盘分区格式
    */
    private String rootPartitionType;

    /**
    * 仅对ebc实例生效。raid配置Id，此参数在isPreserveData为false时为必填，在isPreserveData为true时不生效
    */
    private String raidId;

    /**
    * 待重装的自定义脚本，不传默认使用当前自定义脚本（包括gpu驱动和CFS文件系统）
    */
    private String userData;

    /**
    * 在重装实例时是否使用上一次的 userData
    */
    private Boolean useLastUserData;

    /**
    * 是否清空当前自定义脚本（包括gpu驱动和CFS文件系统），默认false
    */
    private Boolean cleanLastUserData;

    /**
    * 指定的实例ID列表，最多100个
    */
    private List<String> instanceIds;

    public String getImageId() {
        return imageId;
    }

    public RebuildBatchInstanceRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public Boolean getKeepImageLogin() {
        return keepImageLogin;
    }

    public RebuildBatchInstanceRequest setKeepImageLogin(Boolean keepImageLogin) {
        this.keepImageLogin = keepImageLogin;
        return this;
    }

    public Boolean getIsPreserveData() {
        return isPreserveData;
    }

    public RebuildBatchInstanceRequest setIsPreserveData(Boolean isPreserveData) {
        this.isPreserveData = isPreserveData;
        return this;
    }

    public String getAdminPass() {
        return adminPass;
    }

    public RebuildBatchInstanceRequest setAdminPass(String adminPass) {
        this.adminPass = adminPass;
        return this;
    }

    public Boolean getIsOpenHostEye() {
        return isOpenHostEye;
    }

    public RebuildBatchInstanceRequest setIsOpenHostEye(Boolean isOpenHostEye) {
        this.isOpenHostEye = isOpenHostEye;
        return this;
    }

    public Integer getSysRootSize() {
        return sysRootSize;
    }

    public RebuildBatchInstanceRequest setSysRootSize(Integer sysRootSize) {
        this.sysRootSize = sysRootSize;
        return this;
    }

    public String getKeypairId() {
        return keypairId;
    }

    public RebuildBatchInstanceRequest setKeypairId(String keypairId) {
        this.keypairId = keypairId;
        return this;
    }

    public String getDataPartitionType() {
        return dataPartitionType;
    }

    public RebuildBatchInstanceRequest setDataPartitionType(String dataPartitionType) {
        this.dataPartitionType = dataPartitionType;
        return this;
    }

    public String getRootPartitionType() {
        return rootPartitionType;
    }

    public RebuildBatchInstanceRequest setRootPartitionType(String rootPartitionType) {
        this.rootPartitionType = rootPartitionType;
        return this;
    }

    public String getRaidId() {
        return raidId;
    }

    public RebuildBatchInstanceRequest setRaidId(String raidId) {
        this.raidId = raidId;
        return this;
    }

    public String getUserData() {
        return userData;
    }

    public RebuildBatchInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public Boolean getUseLastUserData() {
        return useLastUserData;
    }

    public RebuildBatchInstanceRequest setUseLastUserData(Boolean useLastUserData) {
        this.useLastUserData = useLastUserData;
        return this;
    }

    public Boolean getCleanLastUserData() {
        return cleanLastUserData;
    }

    public RebuildBatchInstanceRequest setCleanLastUserData(Boolean cleanLastUserData) {
        this.cleanLastUserData = cleanLastUserData;
        return this;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public RebuildBatchInstanceRequest setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }

}
