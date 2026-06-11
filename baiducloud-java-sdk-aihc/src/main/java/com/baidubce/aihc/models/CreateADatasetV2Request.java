package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateADatasetV2Request extends BaseBceRequest {

    /**
    * 数据集名称支持小写字母、数字和-，必须以小写字母开头，必须以小写字母或数字结尾，长度限制1-50。
    */
    private String name;

    /**
    * 存储类型，可选项：PFS、BOS
    */
    private String storageType;

    /**
    * 存储实例ID，对应PFS、BOS的ID
    */
    private String storageInstance;

    /**
    * 导入格式<br>FILE：文件<br>FOLDER：文件夹
    */
    private String importFormat;

    /**
    * 数据集的描述
    */
    private String description;

    /**
    * 所有者，不传递时默认为创建者
    */
    private String owner;

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

    /**
    * initVersionEntry
    */
    private DatasetVersionEntry initVersionEntry;

    public String getName() {
        return name;
    }

    public CreateADatasetV2Request setName(String name) {
        this.name = name;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public CreateADatasetV2Request setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageInstance() {
        return storageInstance;
    }

    public CreateADatasetV2Request setStorageInstance(String storageInstance) {
        this.storageInstance = storageInstance;
        return this;
    }

    public String getImportFormat() {
        return importFormat;
    }

    public CreateADatasetV2Request setImportFormat(String importFormat) {
        this.importFormat = importFormat;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CreateADatasetV2Request setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public CreateADatasetV2Request setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getVisibilityScope() {
        return visibilityScope;
    }

    public CreateADatasetV2Request setVisibilityScope(String visibilityScope) {
        this.visibilityScope = visibilityScope;
        return this;
    }

    public List<PermissionEntry> getVisibilityUser() {
        return visibilityUser;
    }

    public CreateADatasetV2Request setVisibilityUser(List<PermissionEntry> visibilityUser) {
        this.visibilityUser = visibilityUser;
        return this;
    }

    public List<PermissionEntry> getVisibilityGroup() {
        return visibilityGroup;
    }

    public CreateADatasetV2Request setVisibilityGroup(List<PermissionEntry> visibilityGroup) {
        this.visibilityGroup = visibilityGroup;
        return this;
    }

    public DatasetVersionEntry getInitVersionEntry() {
        return initVersionEntry;
    }

    public CreateADatasetV2Request setInitVersionEntry(DatasetVersionEntry initVersionEntry) {
        this.initVersionEntry = initVersionEntry;
        return this;
    }

}
