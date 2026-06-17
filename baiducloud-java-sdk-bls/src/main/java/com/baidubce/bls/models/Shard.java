package com.baidubce.bls.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shard {
    /**
     * 总共查询的分片数，目前固定为1
     */
    private Integer total;

    /**
     * 成功的分片数
     */
    private Integer successful;

    /**
     * 跳过的分片数
     */
    private Integer skipped;

    /**
     * 失败的分片数
     */
    private Integer failed;

    public Shard setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getTotal() {
        return this.total;
    }

    public Shard setSuccessful(Integer successful) {
        this.successful = successful;
        return this;
    }

    public Integer getSuccessful() {
        return this.successful;
    }

    public Shard setSkipped(Integer skipped) {
        this.skipped = skipped;
        return this;
    }

    public Integer getSkipped() {
        return this.skipped;
    }

    public Shard setFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    public Integer getFailed() {
        return this.failed;
    }

    @Override
    public String toString() {
        return "Shard{" + "total=" + total + "\n" + "successful=" + successful + "\n" + "skipped=" + skipped + "\n" + "failed=" + failed + "\n" + "}";
    }

}