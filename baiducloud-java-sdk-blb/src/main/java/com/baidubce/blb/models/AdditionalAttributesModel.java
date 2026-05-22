package com.baidubce.blb.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdditionalAttributesModel {
    /**
     * 是否启用gzipJSON压缩,字符串类型,取值 "on" 或 "off"
     */
    private String gzipJson;

    public AdditionalAttributesModel setGzipJson(String gzipJson) {
        this.gzipJson = gzipJson;
        return this;
    }

    public String getGzipJson() {
        return this.gzipJson;
    }

    @Override
    public String toString() {
        return "AdditionalAttributesModel{" + "gzipJson=" + gzipJson + "\n" + "}";
    }

}