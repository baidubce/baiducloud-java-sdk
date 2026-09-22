package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetHotGroupDetailResponse extends BaseBceResponse {

    /**
    * leader
    */
    private Leader leader;

    /**
    * 从角色信息
    */
    private List<Followers> followers;

    /**
    * 实例组ID
    */
    private String groupId;

    /**
    * 实例组名称
    */
    private String groupName;

    /**
    * 实例组状态
    */
    private String groupStatus;

    /**
    * 实例组的集群数量
    */
    private Integer clusterNum;

    /**
    * 实例组创建时间
    */
    private String groupCreateTime;

    /**
    * 禁写标志（0 未禁写， 1 禁写）
    */
    private Integer forbidWrite;

    /**
    * 实例组类型。标准版：standalone；集群版：bdrp
    */
    private String groupType;

    public Leader getLeader() {
        return leader;
    }

    public GetHotGroupDetailResponse setLeader(Leader leader) {
        this.leader = leader;
        return this;
    }

    public List<Followers> getFollowers() {
        return followers;
    }

    public GetHotGroupDetailResponse setFollowers(List<Followers> followers) {
        this.followers = followers;
        return this;
    }

    public String getGroupId() {
        return groupId;
    }

    public GetHotGroupDetailResponse setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public GetHotGroupDetailResponse setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupStatus() {
        return groupStatus;
    }

    public GetHotGroupDetailResponse setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }

    public Integer getClusterNum() {
        return clusterNum;
    }

    public GetHotGroupDetailResponse setClusterNum(Integer clusterNum) {
        this.clusterNum = clusterNum;
        return this;
    }

    public String getGroupCreateTime() {
        return groupCreateTime;
    }

    public GetHotGroupDetailResponse setGroupCreateTime(String groupCreateTime) {
        this.groupCreateTime = groupCreateTime;
        return this;
    }

    public Integer getForbidWrite() {
        return forbidWrite;
    }

    public GetHotGroupDetailResponse setForbidWrite(Integer forbidWrite) {
        this.forbidWrite = forbidWrite;
        return this;
    }

    public String getGroupType() {
        return groupType;
    }

    public GetHotGroupDetailResponse setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    @Override
    public String toString() {
        return "GetHotGroupDetailResponse{" + "leader=" + leader + "\n" + "followers=" + followers + "\n" + "groupId=" + groupId + "\n" + "groupName=" + groupName + "\n"
                + "groupStatus=" + groupStatus + "\n" + "clusterNum=" + clusterNum + "\n" + "groupCreateTime=" + groupCreateTime + "\n" + "forbidWrite=" + forbidWrite + "\n"
                + "groupType=" + groupType + "\n" + "}";
    }

}
