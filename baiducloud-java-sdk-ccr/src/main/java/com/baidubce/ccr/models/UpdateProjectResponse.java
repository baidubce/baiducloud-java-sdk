package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateProjectResponse extends BaseBceResponse {

    /**
    * 推送时是否自动扫描镜像，有效值为true、false
    */
    private String autoScan;

    /**
    * 命名空间下的chart数量
    */
    private Integer chartCount;

    /**
    * 命名空间的创建时间，格式为date-time
    */
    private String creationTime;

    /**
    * 命名空间ID
    */
    private Integer projectId;

    /**
    * 命名空间名字
    */
    private String projectName;

    /**
    * 命名空间类型，有两种类型。true表示公有，false表示私有
    */
    @JsonProperty("public")
    private String ccrPublic;

    /**
    * 命名空间下镜像仓库的数量
    */
    private Integer repoCount;

    /**
    * 命名空间更新时间，格式为date-time
    */
    private String updateTime;

    public String getAutoScan() {
        return autoScan;
    }

    public UpdateProjectResponse setAutoScan(String autoScan) {
        this.autoScan = autoScan;
        return this;
    }

    public Integer getChartCount() {
        return chartCount;
    }

    public UpdateProjectResponse setChartCount(Integer chartCount) {
        this.chartCount = chartCount;
        return this;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public UpdateProjectResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public UpdateProjectResponse setProjectId(Integer projectId) {
        this.projectId = projectId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public UpdateProjectResponse setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getCcrPublic() {
        return ccrPublic;
    }

    public UpdateProjectResponse setCcrPublic(String ccrPublic) {
        this.ccrPublic = ccrPublic;
        return this;
    }

    public Integer getRepoCount() {
        return repoCount;
    }

    public UpdateProjectResponse setRepoCount(Integer repoCount) {
        this.repoCount = repoCount;
        return this;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public UpdateProjectResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        return "UpdateProjectResponse{" + "autoScan=" + autoScan + "\n" + "chartCount=" + chartCount + "\n" + "creationTime=" + creationTime + "\n" + "projectId=" + projectId
                + "\n" + "projectName=" + projectName + "\n" + "ccrPublic=" + ccrPublic + "\n" + "repoCount=" + repoCount + "\n" + "updateTime=" + updateTime + "\n" + "}";
    }

}
