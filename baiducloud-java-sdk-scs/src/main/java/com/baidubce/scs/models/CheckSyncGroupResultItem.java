package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckSyncGroupResultItem {
    /**
     * 成员实例展示ID
     */
    private String memberId;

    /**
     * 是否没有数据
     */
    private Boolean noData;

    /**
     * 版本校验是否通过
     */
    private Boolean version;

    /**
     * 引擎版本是否符合要求
     */
    private Boolean engineVersion;

    /**
     * 集群状态校验是否通过
     */
    private Boolean clusterStatus;

    /**
     * 分片数是否一致
     */
    private Boolean shardNum;

    /**
     * 副本数是否一致
     */
    private Boolean replicationNum;

    /**
     * 单分片容量是否一致
     */
    private Boolean flavor;

    /**
     * 是否已加入多活/热活实例组
     */
    private Boolean notJoined;

    /**
     * 是否无VPC侧安全组
     */
    private Boolean noSecurityGroup;

    /**
     * 是否新架构（true：是，false：否）
     */
    private Boolean isHitX1;

    /**
     * 是否开启AOF
     */
    private Boolean isAppendOnlyOn;

    /**
     * 密码是否一致
     */
    private Boolean samePasswd;

    /**
     * 是否具备相同的hashtag参数值
     */
    private Boolean hasSameHashTagConf;

    /**
     * 是否设置了密码
     */
    private Boolean hasSetPwd;

    public CheckSyncGroupResultItem setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getMemberId() {
        return this.memberId;
    }

    public CheckSyncGroupResultItem setNoData(Boolean noData) {
        this.noData = noData;
        return this;
    }

    public Boolean getNoData() {
        return this.noData;
    }

    public CheckSyncGroupResultItem setVersion(Boolean version) {
        this.version = version;
        return this;
    }

    public Boolean getVersion() {
        return this.version;
    }

    public CheckSyncGroupResultItem setEngineVersion(Boolean engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    public Boolean getEngineVersion() {
        return this.engineVersion;
    }

    public CheckSyncGroupResultItem setClusterStatus(Boolean clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    public Boolean getClusterStatus() {
        return this.clusterStatus;
    }

    public CheckSyncGroupResultItem setShardNum(Boolean shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    public Boolean getShardNum() {
        return this.shardNum;
    }

    public CheckSyncGroupResultItem setReplicationNum(Boolean replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    public Boolean getReplicationNum() {
        return this.replicationNum;
    }

    public CheckSyncGroupResultItem setFlavor(Boolean flavor) {
        this.flavor = flavor;
        return this;
    }

    public Boolean getFlavor() {
        return this.flavor;
    }

    public CheckSyncGroupResultItem setNotJoined(Boolean notJoined) {
        this.notJoined = notJoined;
        return this;
    }

    public Boolean getNotJoined() {
        return this.notJoined;
    }

    public CheckSyncGroupResultItem setNoSecurityGroup(Boolean noSecurityGroup) {
        this.noSecurityGroup = noSecurityGroup;
        return this;
    }

    public Boolean getNoSecurityGroup() {
        return this.noSecurityGroup;
    }

    public CheckSyncGroupResultItem setIsHitX1(Boolean isHitX1) {
        this.isHitX1 = isHitX1;
        return this;
    }

    public Boolean getIsHitX1() {
        return this.isHitX1;
    }

    public CheckSyncGroupResultItem setIsAppendOnlyOn(Boolean isAppendOnlyOn) {
        this.isAppendOnlyOn = isAppendOnlyOn;
        return this;
    }

    public Boolean getIsAppendOnlyOn() {
        return this.isAppendOnlyOn;
    }

    public CheckSyncGroupResultItem setSamePasswd(Boolean samePasswd) {
        this.samePasswd = samePasswd;
        return this;
    }

    public Boolean getSamePasswd() {
        return this.samePasswd;
    }

    public CheckSyncGroupResultItem setHasSameHashTagConf(Boolean hasSameHashTagConf) {
        this.hasSameHashTagConf = hasSameHashTagConf;
        return this;
    }

    public Boolean getHasSameHashTagConf() {
        return this.hasSameHashTagConf;
    }

    public CheckSyncGroupResultItem setHasSetPwd(Boolean hasSetPwd) {
        this.hasSetPwd = hasSetPwd;
        return this;
    }

    public Boolean getHasSetPwd() {
        return this.hasSetPwd;
    }

    @Override
    public String toString() {
        return "CheckSyncGroupResultItem{" + "memberId=" + memberId + "\n" + "noData=" + noData + "\n" + "version=" + version + "\n" + "engineVersion=" + engineVersion + "\n"
                + "clusterStatus=" + clusterStatus + "\n" + "shardNum=" + shardNum + "\n" + "replicationNum=" + replicationNum + "\n" + "flavor=" + flavor + "\n" + "notJoined="
                + notJoined + "\n" + "noSecurityGroup=" + noSecurityGroup + "\n" + "isHitX1=" + isHitX1 + "\n" + "isAppendOnlyOn=" + isAppendOnlyOn + "\n" + "samePasswd="
                + samePasswd + "\n" + "hasSameHashTagConf=" + hasSameHashTagConf + "\n" + "hasSetPwd=" + hasSetPwd + "\n" + "}";
    }

}