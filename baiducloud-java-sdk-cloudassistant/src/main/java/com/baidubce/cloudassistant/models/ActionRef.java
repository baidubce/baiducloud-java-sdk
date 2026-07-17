package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionRef {
    /**
     * 命令ID，创建执行时必须指定引用的那个命令
     */
    private String ref;

    public ActionRef setRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getRef() {
        return this.ref;
    }

    @Override
    public String toString() {
        return "ActionRef{" + "ref=" + ref + "\n" + "}";
    }

}