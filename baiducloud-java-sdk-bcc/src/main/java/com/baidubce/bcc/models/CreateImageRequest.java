package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateImageRequest extends BaseBceRequest {

    /**
    * 待创建的自定义镜像名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String imageName;

    /**
    * 当从实例创建镜像时，此参数是指用于创建镜像的实例ID。与snapshotId不同时存在，同时存在时只取instanceId
    */
    private String instanceId;

    /**
    * 当从快照创建镜像时，此参数是指用于创建镜像的快照ID。与instanceId不同时存在，同时存在时只取instanceId
    */
    private String snapshotId;

    /**
    * 加密密钥
    */
    private String encryptKey;

    /**
    * 是否创建包含了所有cds盘的大镜像，如果为true，镜像不能加密，且必须在白名单内，默认为false
    */
    private Boolean relateCds;

    /**
    * 镜像检测，不配置此参数时不触发检测。如果为true，镜像创建完成后自动执行镜像检测。如果为false，不执行镜像检测。默认为false
    */
    private Boolean detection;

    public String getImageName() {
        return imageName;
    }

    public CreateImageRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public CreateImageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getSnapshotId() {
        return snapshotId;
    }

    public CreateImageRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public CreateImageRequest setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
        return this;
    }

    public Boolean getRelateCds() {
        return relateCds;
    }

    public CreateImageRequest setRelateCds(Boolean relateCds) {
        this.relateCds = relateCds;
        return this;
    }

    public Boolean getDetection() {
        return detection;
    }

    public CreateImageRequest setDetection(Boolean detection) {
        this.detection = detection;
        return this;
    }

}
