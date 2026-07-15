package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileUpload {
    /**
     * 操作系统。枚举值：LINUX，WINDOWS
     */
    private String os;

    /**
     * 文件内容
     */
    private String content;

    /**
     * 文件名称
     */
    private String filename;

    /**
     * 目标路径
     */
    private String filepath;

    /**
     * bos桶名称
     */
    private String bosBucketName;

    /**
     * bos文件路径
     */
    private String bosFilePath;

    /**
     * 文件唯一标识符
     */
    private String bosEtag;

    /**
     * 用户，仅Linux文件上传需要
     */
    private String user;

    /**
     * 用户组，仅Linux文件上传需要
     */
    private String group;

    /**
     * 文件权限，仅Linux文件上传需要
     */
    private String mode;

    /**
     * 是否覆盖目标路径下的同名文件
     */
    private Boolean overwrite;

    public FileUpload setOs(String os) {
        this.os = os;
        return this;
    }

    public String getOs() {
        return this.os;
    }

    public FileUpload setContent(String content) {
        this.content = content;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public FileUpload setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    public String getFilename() {
        return this.filename;
    }

    public FileUpload setFilepath(String filepath) {
        this.filepath = filepath;
        return this;
    }

    public String getFilepath() {
        return this.filepath;
    }

    public FileUpload setBosBucketName(String bosBucketName) {
        this.bosBucketName = bosBucketName;
        return this;
    }

    public String getBosBucketName() {
        return this.bosBucketName;
    }

    public FileUpload setBosFilePath(String bosFilePath) {
        this.bosFilePath = bosFilePath;
        return this;
    }

    public String getBosFilePath() {
        return this.bosFilePath;
    }

    public FileUpload setBosEtag(String bosEtag) {
        this.bosEtag = bosEtag;
        return this;
    }

    public String getBosEtag() {
        return this.bosEtag;
    }

    public FileUpload setUser(String user) {
        this.user = user;
        return this;
    }

    public String getUser() {
        return this.user;
    }

    public FileUpload setGroup(String group) {
        this.group = group;
        return this;
    }

    public String getGroup() {
        return this.group;
    }

    public FileUpload setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public String getMode() {
        return this.mode;
    }

    public FileUpload setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    public Boolean getOverwrite() {
        return this.overwrite;
    }

    @Override
    public String toString() {
        return "FileUpload{" + "os=" + os + "\n" + "content=" + content + "\n" + "filename=" + filename + "\n" + "filepath=" + filepath + "\n" + "bosBucketName=" + bosBucketName
                + "\n" + "bosFilePath=" + bosFilePath + "\n" + "bosEtag=" + bosEtag + "\n" + "user=" + user + "\n" + "group=" + group + "\n" + "mode=" + mode + "\n" + "overwrite="
                + overwrite + "\n" + "}";
    }

}