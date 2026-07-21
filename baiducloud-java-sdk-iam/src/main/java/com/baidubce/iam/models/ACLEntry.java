package com.baidubce.iam.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ACLEntry {
    /**
     * 目前支持的产品千帆Model Builder "bce:wenxinfactory", 千帆AppBuidler "bce:ai_apaas", 通用人工智能 "bce:console_ai"
     */
    private String service;

    /**
     * 固定值， "global"
     */
    private String region;

    /**
     * 资源，具体格式看产品线
     */
    private List<String> resource;

    /**
     * 权限,具体格式看产品线
     */
    private List<String> permission;

    /**
     * 固定值，"Allow"
     */
    private String effect;

    public ACLEntry setService(String service) {
        this.service = service;
        return this;
    }

    public String getService() {
        return this.service;
    }

    public ACLEntry setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return this.region;
    }

    public ACLEntry setResource(List<String> resource) {
        this.resource = resource;
        return this;
    }

    public List<String> getResource() {
        return this.resource;
    }

    public ACLEntry setPermission(List<String> permission) {
        this.permission = permission;
        return this;
    }

    public List<String> getPermission() {
        return this.permission;
    }

    public ACLEntry setEffect(String effect) {
        this.effect = effect;
        return this;
    }

    public String getEffect() {
        return this.effect;
    }

    @Override
    public String toString() {
        return "ACLEntry{" + "service=" + service + "\n" + "region=" + region + "\n" + "resource=" + resource + "\n" + "permission=" + permission + "\n" + "effect=" + effect
                + "\n" + "}";
    }

}