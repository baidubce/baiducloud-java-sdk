package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownloadLinkResult {
    /**
     * 下载文件目录
     */
    private String fileDir;

    /**
     * 下载文件名称
     */
    private String fileName;

    /**
     * 下载文件的下载链接
     */
    private String link;

    public DownloadLinkResult setFileDir(String fileDir) {
        this.fileDir = fileDir;
        return this;
    }

    public String getFileDir() {
        return this.fileDir;
    }

    public DownloadLinkResult setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getFileName() {
        return this.fileName;
    }

    public DownloadLinkResult setLink(String link) {
        this.link = link;
        return this;
    }

    public String getLink() {
        return this.link;
    }

    @Override
    public String toString() {
        return "DownloadLinkResult{" + "fileDir=" + fileDir + "\n" + "fileName=" + fileName + "\n" + "link=" + link + "\n" + "}";
    }

}