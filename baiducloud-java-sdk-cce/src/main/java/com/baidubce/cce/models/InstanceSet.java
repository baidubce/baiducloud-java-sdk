package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class InstanceSet {
    /**
     * 节点规格配置
     */
    private Object instanceSpec;

    /**
     * 节点数量
     */
    private Integer count;

    public InstanceSet setInstanceSpec(Object instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }

    public Object getInstanceSpec() {
        return this.instanceSpec;
    }

    public InstanceSet setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "InstanceSet{" + "instanceSpec=" + instanceSpec + "\n" + "count=" + count + "\n" + "}";
    }

}