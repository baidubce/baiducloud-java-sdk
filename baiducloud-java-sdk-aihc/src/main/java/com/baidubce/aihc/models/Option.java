package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Option {
    /**
     * 是否以只读模式挂载到容器中
     */
    private Boolean readOnly;

    public Option setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    @Override
    public String toString() {
        return "Option{" + "readOnly=" + readOnly + "\n" + "}";
    }

}