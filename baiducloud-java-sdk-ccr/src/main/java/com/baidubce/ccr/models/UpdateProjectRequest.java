package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateProjectRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * projectName
    */
    @JsonIgnore
    private String projectName;

    /**
    * 推送时是否自动扫描镜像，有效值为true、false
    */
    private String autoScan;

    /**
    * 命名空间类型，有两种类型。true表示公有，false表示私有
    */
    @JsonProperty("public")
    private String ccrPublic;

    public String getInstanceId() {
        return instanceId;
    }

    public UpdateProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public UpdateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getAutoScan() {
        return autoScan;
    }

    public UpdateProjectRequest setAutoScan(String autoScan) {
        this.autoScan = autoScan;
        return this;
    }

    public String getCcrPublic() {
        return ccrPublic;
    }

    public UpdateProjectRequest setCcrPublic(String ccrPublic) {
        this.ccrPublic = ccrPublic;
        return this;
    }

}
