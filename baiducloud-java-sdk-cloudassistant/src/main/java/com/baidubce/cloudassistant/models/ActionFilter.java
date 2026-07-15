package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionFilter {
    /**
     * 类型，可选值：COMMAND，FILE_UPLOAD
     */
    private String type;

    /**
     * command
     */
    private CommandFilter command;

    /**
     * 实例类型
     */
    private String instanceType;

    /**
     * 命令 ID，仅被保存的命令拥有
     */
    private String id;

    /**
     * 命令名称，仅被保存的命令拥有
     */
    private String name;

    /**
     * 文件上传详情
     */
    private Object fileUpload;

    public ActionFilter setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public ActionFilter setCommand(CommandFilter command) {
        this.command = command;
        return this;
    }

    public CommandFilter getCommand() {
        return this.command;
    }

    public ActionFilter setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public String getInstanceType() {
        return this.instanceType;
    }

    public ActionFilter setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public ActionFilter setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ActionFilter setFileUpload(Object fileUpload) {
        this.fileUpload = fileUpload;
        return this;
    }

    public Object getFileUpload() {
        return this.fileUpload;
    }

    @Override
    public String toString() {
        return "ActionFilter{" + "type=" + type + "\n" + "command=" + command + "\n" + "instanceType=" + instanceType + "\n" + "id=" + id + "\n" + "name=" + name + "\n"
                + "fileUpload=" + fileUpload + "\n" + "}";
    }

}