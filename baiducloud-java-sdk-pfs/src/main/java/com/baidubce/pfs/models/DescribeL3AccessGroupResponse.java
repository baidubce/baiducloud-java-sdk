package com.baidubce.pfs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeL3AccessGroupResponse extends BaseBceResponse {

    /**
    * 唯一请求 ID，每次请求都会返回
    */
    private String requestId;

    /**
    * 权限组名称
    */
    private String accessGroupName;

    /**
    * 描述，未设置时该字段不返回
    */
    private String description;

    /**
    * 关联实例数量
    */
    private Integer instanceCount;

    /**
    * 关联挂载点数量
    */
    private Integer mountCount;

    /**
    * 创建时间，ISO-8601 UTC 秒精度，如 2026-09-01T03:12:45Z
    */
    private String createTime;

    /**
    * 逻辑机房（可用区）
    */
    private String zoneName;

    /**
    * 已关联的挂载点列表
    */
    private List<AttachedMountTargetInfo> attachedMountTargets;

    public String getRequestId() {
        return requestId;
    }

    public DescribeL3AccessGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public String getAccessGroupName() {
        return accessGroupName;
    }

    public DescribeL3AccessGroupResponse setAccessGroupName(String accessGroupName) {
        this.accessGroupName = accessGroupName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public DescribeL3AccessGroupResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public DescribeL3AccessGroupResponse setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    public Integer getMountCount() {
        return mountCount;
    }

    public DescribeL3AccessGroupResponse setMountCount(Integer mountCount) {
        this.mountCount = mountCount;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescribeL3AccessGroupResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getZoneName() {
        return zoneName;
    }

    public DescribeL3AccessGroupResponse setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }

    public List<AttachedMountTargetInfo> getAttachedMountTargets() {
        return attachedMountTargets;
    }

    public DescribeL3AccessGroupResponse setAttachedMountTargets(List<AttachedMountTargetInfo> attachedMountTargets) {
        this.attachedMountTargets = attachedMountTargets;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeL3AccessGroupResponse{" + "requestId=" + requestId + "\n" + "accessGroupName=" + accessGroupName + "\n" + "description=" + description + "\n"
                + "instanceCount=" + instanceCount + "\n" + "mountCount=" + mountCount + "\n" + "createTime=" + createTime + "\n" + "zoneName=" + zoneName + "\n"
                + "attachedMountTargets=" + attachedMountTargets + "\n" + "}";
    }

}
