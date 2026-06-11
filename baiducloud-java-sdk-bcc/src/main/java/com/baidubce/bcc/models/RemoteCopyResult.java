package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoteCopyResult {
    /**
     * 目标地域
     */
    private String region;

    /**
     * 目标地域生成的镜像ID
     */
    private String imageId;

    /**
     * 结果状态，success/failed
     */
    private String code;

    /**
     * 结果消息，成功为"success"，失败为错误信息
     */
    private String errMsg;

    public RemoteCopyResult setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public RemoteCopyResult setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    public String getImageId() {
        return this.imageId;
    }

    public RemoteCopyResult setCode(String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public RemoteCopyResult setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public String toString() {
        return "RemoteCopyResult{" + "region=" + region + "\n" + "imageId=" + imageId + "\n" + "code=" + code + "\n" + "errMsg=" + errMsg + "\n" + "}";
    }

}