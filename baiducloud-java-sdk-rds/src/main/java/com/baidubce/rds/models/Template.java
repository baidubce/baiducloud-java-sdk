package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Template {
    /**
     * 见示例
     */
    private String id;

    /**
     * 模板名称。
     */
    private String name;

    /**
     * 数据库类型。
     */
    private String dbType;

    /**
     * 数据库版本。
     */
    private String dbVersion;

    /**
     * 见示例
     */
    private Integer count;

    /**
     * 备注。
     */
    private String desc;

    /**
     * 见示例
     */
    private Boolean dynamic;

    /**
     * 创建时间。
     */
    private String createTime;

    /**
     * 更新时间。
     */
    private String updateTime;

    /**
     * 见示例
     */
    private String idShow;

    /**
     * 见示例
     */
    private List<String> para;

    /**
     * 模板类型。
     */
    private String type;

    /**
     * 见示例
     */
    private String property;

    public Template setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Template setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Template setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    public String getDbType() {
        return this.dbType;
    }

    public Template setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

    public String getDbVersion() {
        return this.dbVersion;
    }

    public Template setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public Template setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public Template setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
        return this;
    }

    public Boolean getDynamic() {
        return this.dynamic;
    }

    public Template setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Template setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Template setIdShow(String idShow) {
        this.idShow = idShow;
        return this;
    }

    public String getIdShow() {
        return this.idShow;
    }

    public Template setPara(List<String> para) {
        this.para = para;
        return this;
    }

    public List<String> getPara() {
        return this.para;
    }

    public Template setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Template setProperty(String property) {
        this.property = property;
        return this;
    }

    public String getProperty() {
        return this.property;
    }

    @Override
    public String toString() {
        return "Template{" + "id=" + id + "\n" + "name=" + name + "\n" + "dbType=" + dbType + "\n" + "dbVersion=" + dbVersion + "\n" + "count=" + count + "\n" + "desc=" + desc
                + "\n" + "dynamic=" + dynamic + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "idShow=" + idShow + "\n" + "para=" + para + "\n"
                + "type=" + type + "\n" + "property=" + property + "\n" + "}";
    }

}