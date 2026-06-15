package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyDatasetRequest extends BaseBceRequest {

    /**
    * datasetId
    */
    @JsonIgnore
    private String datasetId;

    /**
    * 数据集名称
    */
    private String name;

    /**
    * 描述
    */
    private String description;

    /**
    * 可见范围<br>ALL_PEOPLE：所有人可见<br>ONLY_OWNER：仅所有者可读写<br>USER_GROUP：指定范围可用
    */
    private String visibilityScope;

    /**
    * 用户权限列表<br>[{"id": "xxx", "name": "xxx", "permission": "r"}, {"id": "yyy", "name": "xxx", "permission": "rw"}]
    */
    private List<PermissionEntry> visibilityUser;

    /**
    * 用户组权限列表<br>[{"id": "xxx", "name": "xxx", "permission": "r"}, {"id": "yyy", "name": "xxx", "permission": "rw"}]
    */
    private List<PermissionEntry> visibilityGroup;

    public String getDatasetId() {
        return datasetId;
    }

    public ModifyDatasetRequest setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModifyDatasetRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyDatasetRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public ModifyDatasetRequest setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public List<PermissionEntry> getVisibilityUser() {
        return visibilityUser;
    }

    public ModifyDatasetRequest setVisibilityUser(List<PermissionEntry> visibilityUser) {
        this.visibilityUser = visibilityUser;
        return this;
    }

    public List<PermissionEntry> getVisibilityGroup() {
        return visibilityGroup;
    }

    public ModifyDatasetRequest setVisibilityGroup(List<PermissionEntry> visibilityGroup) {
        this.visibilityGroup = visibilityGroup;
        return this;
    }

}
