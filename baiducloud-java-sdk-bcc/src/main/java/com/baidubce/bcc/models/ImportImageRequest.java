package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportImageRequest extends BaseBceRequest {

    /**
    * 操作系统名称
    */
    private String osName;

    /**
    * 操作系统位数
    */
    private String osArch;

    /**
    * 操作系统类型
    */
    private String osType;

    /**
    * 操作系统版本
    */
    private String osVersion;

    /**
    * 镜像名称,支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65。
    */
    private String name;

    /**
    * bos镜像地址
    */
    private String bosUrl;

    /**
    * 镜像检测，不配置此参数时不触发检测。如果为true，镜像导入后自动执行镜像检测。 如果为false，镜像导入后不执行镜像检测。默认取值：false。
    */
    private Boolean detection;

    /**
    * 导入的镜像适用于BCC还是EBC，枚举值：BCC、EBC，默认BCC
    */
    private String generationType;

    public String getOsName() {
        return osName;
    }

    public ImportImageRequest setOsName(String osName) {
        this.osName = osName;
        return this;
    }

    public String getOsArch() {
        return osArch;
    }

    public ImportImageRequest setOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    public String getOsType() {
        return osType;
    }

    public ImportImageRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public ImportImageRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    public String getName() {
        return name;
    }

    public ImportImageRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getBosUrl() {
        return bosUrl;
    }

    public ImportImageRequest setBosUrl(String bosUrl) {
        this.bosUrl = bosUrl;
        return this;
    }

    public Boolean getDetection() {
        return detection;
    }

    public ImportImageRequest setDetection(Boolean detection) {
        this.detection = detection;
        return this;
    }

    public String getGenerationType() {
        return generationType;
    }

    public ImportImageRequest setGenerationType(String generationType) {
        this.generationType = generationType;
        return this;
    }

}
