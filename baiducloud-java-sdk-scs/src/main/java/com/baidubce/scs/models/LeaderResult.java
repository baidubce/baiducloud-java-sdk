package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeaderResult {
    /**
     * 版本是否为集群版（true:是，false：否）
     */
    private Boolean version;

    /**
     * 集群状态是否是running（true:是，false：否）
     */
    private Boolean clusterStatus;

    /**
     * 副本数（true:是，false：否）（主角色副本数需为2）
     */
    private Boolean replicationNum;

    /**
     * 单分片容量（true:是，false：否）（主角色单分片在8G及以下）
     */
    private Boolean flavor;

    /**
     * 是否已加入热活实例组（true：是，false：否）
     */
    private Boolean joined;

    /**
     * 是否无密码（true：是，false：否）
     */
    private Boolean noPasswd;

    /**
     * 是否无vpc侧安全组（true：是， false：否）
     */
    private Boolean noSecurityGroup;

    /**
     * 是否是新架构（true:是 false：否）
     */
    private Boolean isHitX1;

    /**
     * 是否没有开通TDE（true:是 false：否）
     */
    private Boolean noTde;

    /**
     * 是否具备相同的hashtag参数值（true:是 false：否）
     */
    private Boolean hasSameHashTagConf;

    /**
     * 是否设置了密码（true:是 false：否）
     */
    private Boolean hasSetPwd;

    /**
     * 是否没有开通跨AZ就近访问（true:是 false：否）
     */
    private Boolean isNotCrossAzNearest;

    public LeaderResult setVersion(Boolean version) {
        this.version = version;
        return this;
    }

    public Boolean getVersion() {
        return this.version;
    }

    public LeaderResult setClusterStatus(Boolean clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }

    public Boolean getClusterStatus() {
        return this.clusterStatus;
    }

    public LeaderResult setReplicationNum(Boolean replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    public Boolean getReplicationNum() {
        return this.replicationNum;
    }

    public LeaderResult setFlavor(Boolean flavor) {
        this.flavor = flavor;
        return this;
    }

    public Boolean getFlavor() {
        return this.flavor;
    }

    public LeaderResult setJoined(Boolean joined) {
        this.joined = joined;
        return this;
    }

    public Boolean getJoined() {
        return this.joined;
    }

    public LeaderResult setNoPasswd(Boolean noPasswd) {
        this.noPasswd = noPasswd;
        return this;
    }

    public Boolean getNoPasswd() {
        return this.noPasswd;
    }

    public LeaderResult setNoSecurityGroup(Boolean noSecurityGroup) {
        this.noSecurityGroup = noSecurityGroup;
        return this;
    }

    public Boolean getNoSecurityGroup() {
        return this.noSecurityGroup;
    }

    public LeaderResult setIsHitX1(Boolean isHitX1) {
        this.isHitX1 = isHitX1;
        return this;
    }

    public Boolean getIsHitX1() {
        return this.isHitX1;
    }

    public LeaderResult setNoTde(Boolean noTde) {
        this.noTde = noTde;
        return this;
    }

    public Boolean getNoTde() {
        return this.noTde;
    }

    public LeaderResult setHasSameHashTagConf(Boolean hasSameHashTagConf) {
        this.hasSameHashTagConf = hasSameHashTagConf;
        return this;
    }

    public Boolean getHasSameHashTagConf() {
        return this.hasSameHashTagConf;
    }

    public LeaderResult setHasSetPwd(Boolean hasSetPwd) {
        this.hasSetPwd = hasSetPwd;
        return this;
    }

    public Boolean getHasSetPwd() {
        return this.hasSetPwd;
    }

    public LeaderResult setIsNotCrossAzNearest(Boolean isNotCrossAzNearest) {
        this.isNotCrossAzNearest = isNotCrossAzNearest;
        return this;
    }

    public Boolean getIsNotCrossAzNearest() {
        return this.isNotCrossAzNearest;
    }

    @Override
    public String toString() {
        return "LeaderResult{" + "version=" + version + "\n" + "clusterStatus=" + clusterStatus + "\n" + "replicationNum=" + replicationNum + "\n" + "flavor=" + flavor + "\n"
                + "joined=" + joined + "\n" + "noPasswd=" + noPasswd + "\n" + "noSecurityGroup=" + noSecurityGroup + "\n" + "isHitX1=" + isHitX1 + "\n" + "noTde=" + noTde + "\n"
                + "hasSameHashTagConf=" + hasSameHashTagConf + "\n" + "hasSetPwd=" + hasSetPwd + "\n" + "isNotCrossAzNearest=" + isNotCrossAzNearest + "\n" + "}";
    }

}