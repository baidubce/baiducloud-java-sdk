package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupConfig {
    /**
     * 最小节点数量
     */
    private Integer minNodeNum;

    /**
     * 最大节点数量
     */
    private Integer maxNodeNum;

    /**
     * 冷却时间
     */
    private Integer cooldownInSec;

    /**
     * 期望节点数，默认为-1，开启期望节点数后，健康检查任务会自动巡检，如果当前节点数和期望不一致会自动扩缩容保持一致
     */
    private Integer expectNum;

    /**
     * 初始节点数，默认为-1
     */
    private Integer initNum;

    public GroupConfig setMinNodeNum(Integer minNodeNum) {
        this.minNodeNum = minNodeNum;
        return this;
    }

    public Integer getMinNodeNum() {
        return this.minNodeNum;
    }

    public GroupConfig setMaxNodeNum(Integer maxNodeNum) {
        this.maxNodeNum = maxNodeNum;
        return this;
    }

    public Integer getMaxNodeNum() {
        return this.maxNodeNum;
    }

    public GroupConfig setCooldownInSec(Integer cooldownInSec) {
        this.cooldownInSec = cooldownInSec;
        return this;
    }

    public Integer getCooldownInSec() {
        return this.cooldownInSec;
    }

    public GroupConfig setExpectNum(Integer expectNum) {
        this.expectNum = expectNum;
        return this;
    }

    public Integer getExpectNum() {
        return this.expectNum;
    }

    public GroupConfig setInitNum(Integer initNum) {
        this.initNum = initNum;
        return this;
    }

    public Integer getInitNum() {
        return this.initNum;
    }

    @Override
    public String toString() {
        return "GroupConfig{" + "minNodeNum=" + minNodeNum + "\n" + "maxNodeNum=" + maxNodeNum + "\n" + "cooldownInSec=" + cooldownInSec + "\n" + "expectNum=" + expectNum + "\n"
                + "initNum=" + initNum + "\n" + "}";
    }

}