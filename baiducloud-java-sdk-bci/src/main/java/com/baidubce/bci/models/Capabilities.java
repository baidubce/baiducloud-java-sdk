package com.baidubce.bci.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Capabilities {
    /**
     * 启用安全能力项列表
     */
    private List<String> add;

    /**
     * 禁用安全能力项列表
     */
    private List<String> drop;

    public Capabilities setAdd(List<String> add) {
        this.add = add;
        return this;
    }

    public List<String> getAdd() {
        return this.add;
    }

    public Capabilities setDrop(List<String> drop) {
        this.drop = drop;
        return this;
    }

    public List<String> getDrop() {
        return this.drop;
    }

    @Override
    public String toString() {
        return "Capabilities{" + "add=" + add + "\n" + "drop=" + drop + "\n" + "}";
    }

}