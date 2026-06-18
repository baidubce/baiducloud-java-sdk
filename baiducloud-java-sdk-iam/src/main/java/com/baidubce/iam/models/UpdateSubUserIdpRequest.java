package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateSubUserIdpRequest extends BaseBceRequest {

    /**
    * 文件名称，必须为xml格式文件
    */
    private String fileName;

    /**
    * Base64编码后的IdP元数据
    */
    private String encodeMetadata;

    /**
    * 辅助域名
    */
    private String auxiliaryDomain;

    public String getFileName() {
        return fileName;
    }

    public UpdateSubUserIdpRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getEncodeMetadata() {
        return encodeMetadata;
    }

    public UpdateSubUserIdpRequest setEncodeMetadata(String encodeMetadata) {
        this.encodeMetadata = encodeMetadata;
        return this;
    }

    public String getAuxiliaryDomain() {
        return auxiliaryDomain;
    }

    public UpdateSubUserIdpRequest setAuxiliaryDomain(String auxiliaryDomain) {
        this.auxiliaryDomain = auxiliaryDomain;
        return this;
    }

}
