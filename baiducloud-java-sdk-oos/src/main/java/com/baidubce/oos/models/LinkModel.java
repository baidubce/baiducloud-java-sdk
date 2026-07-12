package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkModel {
    /**
     * 上游 operator 的 name
     */
    private String src;

    /**
     * 下游 operator 的 name
     */
    private String dst;

    public LinkModel setSrc(String src) {
        this.src = src;
        return this;
    }

    public String getSrc() {
        return this.src;
    }

    public LinkModel setDst(String dst) {
        this.dst = dst;
        return this;
    }

    public String getDst() {
        return this.dst;
    }

    @Override
    public String toString() {
        return "LinkModel{" + "src=" + src + "\n" + "dst=" + dst + "\n" + "}";
    }

}