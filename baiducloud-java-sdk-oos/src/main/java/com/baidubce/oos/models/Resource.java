package com.baidubce.oos.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource {
    /**
     * 资源类型
     */
    private String type;

    /**
     * 资源标识，结构由资源类型决定
     */
    private Object id;

    public Resource setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Resource setId(Object id) {
        this.id = id;
        return this;
    }

    public Object getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Resource{" + "type=" + type + "\n" + "id=" + id + "\n" + "}";
    }

}