package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateProjectRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 命名空间名称，允许包含小写字母、数字及分隔符._-，且不能以分隔符开头或结尾，不能是纯数字
    */
    private String projectName;

    /**
    * 命名空间类型，有两种类型。true表示公有，false表示私有
    */
    @JsonProperty("public")
    private String ccrPublic;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateProjectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public CreateProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getCcrPublic() {
        return ccrPublic;
    }

    public CreateProjectRequest setCcrPublic(String ccrPublic) {
        this.ccrPublic = ccrPublic;
        return this;
    }

}
