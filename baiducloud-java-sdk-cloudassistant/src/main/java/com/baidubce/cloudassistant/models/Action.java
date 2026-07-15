package com.baidubce.cloudassistant.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Action {
    /**
     * 命令ID，系统自动生成，仅被保存的命令拥有
     */
    private String id;

    /**
     * Action ID，仅用于更新命令接口。通常引用已有的 Action ID，例如命令执行场景（命令列表查询不返回）
     */
    private String ref;

    /**
     * Action类型。COMMAND（命令），FILE_UPLOAD（上传文件）
     */
    private String type;

    /**
     * 命令名称，仅被保存的命令拥有
     */
    private String name;

    /**
     * Action 别名
     */
    private String alias;

    /**
     * Action 描述
     */
    private String description;

    /**
     * 动作的超时时间（秒）
     */
    private Integer timeoutSecond;

    /**
     * command
     */
    private Command command;

    /**
     * fileUpload
     */
    private FileUpload fileUpload;

    /**
     * 此公共命令支持的实例类型列表，根据命令创建执行时，根据此字段确定展示那些实例列表，目前支持：BCC、BBC、HPAS
     */
    private List<String> supportedInstanceTypes;

    /**
     * 命令创建时间。unix时间戳（毫秒）
     */
    private Long createdTimestamp;

    /**
     * 命令最后一次被修改时间。unix时间戳（毫秒）
     */
    private Long updatedTimestamp;

    public Action setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Action setRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getRef() {
        return this.ref;
    }

    public Action setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Action setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Action setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getAlias() {
        return this.alias;
    }

    public Action setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Action setTimeoutSecond(Integer timeoutSecond) {
        this.timeoutSecond = timeoutSecond;
        return this;
    }

    public Integer getTimeoutSecond() {
        return this.timeoutSecond;
    }

    public Action setCommand(Command command) {
        this.command = command;
        return this;
    }

    public Command getCommand() {
        return this.command;
    }

    public Action setFileUpload(FileUpload fileUpload) {
        this.fileUpload = fileUpload;
        return this;
    }

    public FileUpload getFileUpload() {
        return this.fileUpload;
    }

    public Action setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
        this.supportedInstanceTypes = supportedInstanceTypes;
        return this;
    }

    public List<String> getSupportedInstanceTypes() {
        return this.supportedInstanceTypes;
    }

    public Action setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public Action setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    @Override
    public String toString() {
        return "Action{" + "id=" + id + "\n" + "ref=" + ref + "\n" + "type=" + type + "\n" + "name=" + name + "\n" + "alias=" + alias + "\n" + "description=" + description + "\n"
                + "timeoutSecond=" + timeoutSecond + "\n" + "command=" + command + "\n" + "fileUpload=" + fileUpload + "\n" + "supportedInstanceTypes=" + supportedInstanceTypes
                + "\n" + "createdTimestamp=" + createdTimestamp + "\n" + "updatedTimestamp=" + updatedTimestamp + "\n" + "}";
    }

}