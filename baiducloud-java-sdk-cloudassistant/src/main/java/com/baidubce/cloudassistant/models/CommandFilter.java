package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommandFilter {
    /**
     * 按命令可见范围筛选。枚举值：INDIVIDUAL（我的命令），GLOBAL（公共命令）
     */
    private String scope;

    /**
     * 按命令名称筛选
     */
    private String name;

    /**
     * 按命令类型筛选。枚举值：SHELL，POWERSHELL
     */
    private String type;

    public CommandFilter setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return this.scope;
    }

    public CommandFilter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CommandFilter setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "CommandFilter{" + "scope=" + scope + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "}";
    }

}