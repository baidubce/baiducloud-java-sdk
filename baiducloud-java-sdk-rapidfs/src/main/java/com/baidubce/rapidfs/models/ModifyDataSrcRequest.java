package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyDataSrcRequest extends BaseBceRequest {

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;

    /**
    * 待修改的数据源 ID
    */
    private String dataSrcId;

    /**
    * 所属 RapidFS 实例唯一 ID
    */
    private String instanceId;

    /**
    * 是否保留 BOS 软链，保留软链会降低创建数据源导入效率，以及后续增量元数据同步效率
    */
    private Boolean keepSymlink;

    /**
    * 权限组Id
    */
    private String authGroupId;

    /**
    * 数据源描述信息，不超过256个字符
    */
    private String description;

    /**
    * 该数据源的容量配额，表示该数据源的可用最大容量，不能超过实例的缓存总容量。-1 表示取消对数据源的容量限制
    */
    private Integer quotaMiB;

    public String getClientToken() {
        return clientToken;
    }

    public ModifyDataSrcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public String getDataSrcId() {
        return dataSrcId;
    }

    public ModifyDataSrcRequest setDataSrcId(String dataSrcId) {
        this.dataSrcId = dataSrcId;
        return this;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public ModifyDataSrcRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public Boolean getKeepSymlink() {
        return keepSymlink;
    }

    public ModifyDataSrcRequest setKeepSymlink(Boolean keepSymlink) {
        this.keepSymlink = keepSymlink;
        return this;
    }

    public String getAuthGroupId() {
        return authGroupId;
    }

    public ModifyDataSrcRequest setAuthGroupId(String authGroupId) {
        this.authGroupId = authGroupId;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ModifyDataSrcRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getQuotaMiB() {
        return quotaMiB;
    }

    public ModifyDataSrcRequest setQuotaMiB(Integer quotaMiB) {
        this.quotaMiB = quotaMiB;
        return this;
    }

}
