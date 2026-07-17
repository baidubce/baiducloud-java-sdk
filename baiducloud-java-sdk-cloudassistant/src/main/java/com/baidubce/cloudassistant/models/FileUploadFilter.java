package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileUploadFilter {
    /**
     * 上传的文件名称
     */
    private String filename;

    public FileUploadFilter setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public String getFilename() {
        return this.filename;
    }

    @Override
    public String toString() {
        return "FileUploadFilter{" + "filename=" + filename + "\n" + "}";
    }

}