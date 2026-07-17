package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionFilter {
    /**
     * 命令 ID，仅用来查询执行历史记录，例如：c-jPwwUBxxxxxxxxxx
     */
    private String id;

    /**
     * 命令名称，仅用来查询执行历史记录
     */
    private String name;

    /**
     * Action类型。COMMAND（命令），FILE_UPLOAD（上传文件）
     */
    private String type;

    /**
     * command
     */
    private CommandFilter command;

    /**
     * fileUpload
     */
    private FileUploadFilter fileUpload;

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

    public ActionFilter setFileUpload(FileUploadFilter fileUpload) {
        this.fileUpload = fileUpload;
        return this;
    }

    public FileUploadFilter getFileUpload() {
        return this.fileUpload;
    }

    @Override
    public String toString() {
        return "ActionFilter{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "command=" + command + "\n" + "fileUpload=" + fileUpload + "\n" + "}";
    }

}