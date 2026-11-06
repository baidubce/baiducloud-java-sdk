package com.baidubce.rds.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
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
     * 参数列表。
     */
    private List<Para> para;

    /**
     * 模板类型。
     */
    private String type;

    /**
     * 见示例
     */
    private String property;

    public Result setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Result setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Result setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }

    public String getDbType() {
        return this.dbType;
    }

    public Result setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
        return this;
    }

    public String getDbVersion() {
        return this.dbVersion;
    }

    public Result setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public Result setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public Result setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
        return this;
    }

    public Boolean getDynamic() {
        return this.dynamic;
    }

    public Result setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Result setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Result setIdShow(String idShow) {
        this.idShow = idShow;
        return this;
    }

    public String getIdShow() {
        return this.idShow;
    }

    public Result setPara(List<Para> para) {
        this.para = para;
        return this;
    }

    public List<Para> getPara() {
        return this.para;
    }

    public Result setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Result setProperty(String property) {
        this.property = property;
        return this;
    }

    public String getProperty() {
        return this.property;
    }

    @Override
    public String toString() {
        return "Result{" + "id=" + id + "\n" + "name=" + name + "\n" + "dbType=" + dbType + "\n" + "dbVersion=" + dbVersion + "\n" + "count=" + count + "\n" + "desc=" + desc
                + "\n" + "dynamic=" + dynamic + "\n" + "createTime=" + createTime + "\n" + "updateTime=" + updateTime + "\n" + "idShow=" + idShow + "\n" + "para=" + para + "\n"
                + "type=" + type + "\n" + "property=" + property + "\n" + "}";
    }

}