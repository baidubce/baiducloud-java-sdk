package com.baidubce.cprom.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectMeta {
    /**
     * 资源名称
     */
    private String name;

    /**
     * 命名空间
     */
    private String namespace;

    public ObjectMeta setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ObjectMeta setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    @Override
    public String toString() {
        return "ObjectMeta{" + "name=" + name + "\n" + "namespace=" + namespace + "\n" + "}";
    }

}