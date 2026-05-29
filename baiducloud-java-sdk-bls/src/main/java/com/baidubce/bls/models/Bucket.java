package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Bucket {
    /**
     * 
     */
    private Long key;

    /**
     * 时间区间内的文档数量
     */
    private Long docCount;

    public Bucket setKey(Long key) {
        this.key = key;
        return this;
    }

    public Long getKey() {
        return this.key;
    }

    public Bucket setDocCount(Long docCount) {
        this.docCount = docCount;
        return this;
    }

    public Long getDocCount() {
        return this.docCount;
    }

    @Override
    public String toString() {
        return "Bucket{" + "key=" + key + "\n" + "docCount=" + docCount + "\n" + "}";
    }

}