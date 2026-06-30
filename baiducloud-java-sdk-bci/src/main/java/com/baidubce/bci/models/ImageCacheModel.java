package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageCacheModel {
    /**
     * 镜像缓存id，全局唯一
     */
    private String imageCacheId;

    /**
     * 用户原始镜像地址
     */
    private List<String> originImages;

    /**
     * 制作状态：创建成功、创建失败、创建中
     */
    private String status;

    /**
     * 制作进度，范围[0,100]
     */
    private Integer progress;

    /**
     * 超时回收时间
     */
    private String expiredTime;

    /**
     * 创建时间
     */
    private String createdTime;

    /**
     * 最近一次使用时间
     */
    private String lastestMatchedTime;

    public ImageCacheModel setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }

    public String getImageCacheId() {
        return this.imageCacheId;
    }

    public ImageCacheModel setOriginImages(List<String> originImages) {
        this.originImages = originImages;
        return this;
    }

    public List<String> getOriginImages() {
        return this.originImages;
    }

    public ImageCacheModel setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public ImageCacheModel setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    public Integer getProgress() {
        return this.progress;
    }

    public ImageCacheModel setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    public String getExpiredTime() {
        return this.expiredTime;
    }

    public ImageCacheModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public ImageCacheModel setLastestMatchedTime(String lastestMatchedTime) {
        this.lastestMatchedTime = lastestMatchedTime;
        return this;
    }

    public String getLastestMatchedTime() {
        return this.lastestMatchedTime;
    }

    @Override
    public String toString() {
        return "ImageCacheModel{" + "imageCacheId=" + imageCacheId + "\n" + "originImages=" + originImages + "\n" + "status=" + status + "\n" + "progress=" + progress + "\n"
                + "expiredTime=" + expiredTime + "\n" + "createdTime=" + createdTime + "\n" + "lastestMatchedTime=" + lastestMatchedTime + "\n" + "}";
    }

}