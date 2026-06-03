package com.baidubce.ccr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project {
    /**
     * 推送时是否自动扫描镜像，有效值为 `true`、`false`
     */
    private String autoScan;

    /**
     * 命名空间下的 Chart 数量
     */
    private Integer chartCount;

    /**
     * 命名空间创建时间，格式为 `date-time`
     */
    private String creationTime;

    /**
     * 命名空间 ID
     */
    private Integer projectId;

    /**
     * 命名空间名称
     */
    private String projectName;

    /**
     * 命名空间类型，有两种类型：`true` 表示公有，`false` 表示私有
     */
    @JsonProperty("public")
    private String ccrPublic;

    /**
     * 命名空间下镜像仓库数量
     */
    private Integer repoCount;

    /**
     * 命名空间更新时间，格式为 `date-time`
     */
    private String updateTime;

    public Project setAutoScan(String autoScan) {
        this.autoScan = autoScan;
        return this;
    }

    public String getAutoScan() {
        return this.autoScan;
    }

    public Project setChartCount(Integer chartCount) {
        this.chartCount = chartCount;
        return this;
    }

    public Integer getChartCount() {
        return this.chartCount;
    }

    public Project setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public String getCreationTime() {
        return this.creationTime;
    }

    public Project setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    public Integer getProjectId() {
        return this.projectId;
    }

    public Project setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public Project setPublic(String ccrPublic) {
        this.ccrPublic = ccrPublic;
        return this;
    }

    public String getPublic() {
        return this.ccrPublic;
    }

    public Project setRepoCount(Integer repoCount) {
        this.repoCount = repoCount;
        return this;
    }

    public Integer getRepoCount() {
        return this.repoCount;
    }

    public Project setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    @Override
    public String toString() {
        return "Project{" + "autoScan=" + autoScan + "\n" + "chartCount=" + chartCount + "\n" + "creationTime=" + creationTime + "\n" + "projectId=" + projectId + "\n"
                + "projectName=" + projectName + "\n" + "ccrPublic=" + ccrPublic + "\n" + "repoCount=" + repoCount + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}