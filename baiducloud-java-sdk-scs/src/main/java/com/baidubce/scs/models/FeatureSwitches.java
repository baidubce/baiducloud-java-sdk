package com.baidubce.scs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeatureSwitches {
    /**
     * 热活中的实例是否可以变更规格和分片：true 符合热活变更规格与分片的版本要求，false 不满足要求
     */
    private Boolean groupModify;

    /**
     * true: 可以执行开启/关闭跨AZ就近访问；false: 不可以
     */
    private Boolean crossAzNearest;

    /**
     * 是否支持 proxy 重启升级功能，true 支持
     */
    private Boolean proxyUpgradeSupport;

    /**
     * 是否允许原地恢复，多活或 pega 本地盘不支持原地恢复，为 false，否则为 true
     */
    private Boolean recoverInOriginSupport;

    /**
     * 是否允许克隆恢复，都支持，为 true
     */
    private Boolean recoverInNewSupport;

    /**
     * 是否支持 sentinel 命令开关
     */
    private Boolean supportSentinelSwitch;

    /**
     * 是否支持白名单分组字段，为 false 时为 3.x 老模块，需禁用分组功能
     */
    private Boolean whitelistGroupSupport;

    /**
     * 是否支持修改带宽
     */
    private Boolean bandwidthModify;

    /**
     * 展示开启影子从库的按钮
     */
    private Boolean shadowBackupSupport;

    public FeatureSwitches setGroupModify(Boolean groupModify) {
        this.groupModify = groupModify;
        return this;
    }

    public Boolean getGroupModify() {
        return this.groupModify;
    }

    public FeatureSwitches setCrossAzNearest(Boolean crossAzNearest) {
        this.crossAzNearest = crossAzNearest;
        return this;
    }

    public Boolean getCrossAzNearest() {
        return this.crossAzNearest;
    }

    public FeatureSwitches setProxyUpgradeSupport(Boolean proxyUpgradeSupport) {
        this.proxyUpgradeSupport = proxyUpgradeSupport;
        return this;
    }

    public Boolean getProxyUpgradeSupport() {
        return this.proxyUpgradeSupport;
    }

    public FeatureSwitches setRecoverInOriginSupport(Boolean recoverInOriginSupport) {
        this.recoverInOriginSupport = recoverInOriginSupport;
        return this;
    }

    public Boolean getRecoverInOriginSupport() {
        return this.recoverInOriginSupport;
    }

    public FeatureSwitches setRecoverInNewSupport(Boolean recoverInNewSupport) {
        this.recoverInNewSupport = recoverInNewSupport;
        return this;
    }

    public Boolean getRecoverInNewSupport() {
        return this.recoverInNewSupport;
    }

    public FeatureSwitches setSupportSentinelSwitch(Boolean supportSentinelSwitch) {
        this.supportSentinelSwitch = supportSentinelSwitch;
        return this;
    }

    public Boolean getSupportSentinelSwitch() {
        return this.supportSentinelSwitch;
    }

    public FeatureSwitches setWhitelistGroupSupport(Boolean whitelistGroupSupport) {
        this.whitelistGroupSupport = whitelistGroupSupport;
        return this;
    }

    public Boolean getWhitelistGroupSupport() {
        return this.whitelistGroupSupport;
    }

    public FeatureSwitches setBandwidthModify(Boolean bandwidthModify) {
        this.bandwidthModify = bandwidthModify;
        return this;
    }

    public Boolean getBandwidthModify() {
        return this.bandwidthModify;
    }

    public FeatureSwitches setShadowBackupSupport(Boolean shadowBackupSupport) {
        this.shadowBackupSupport = shadowBackupSupport;
        return this;
    }

    public Boolean getShadowBackupSupport() {
        return this.shadowBackupSupport;
    }

    @Override
    public String toString() {
        return "FeatureSwitches{" + "groupModify=" + groupModify + "\n" + "crossAzNearest=" + crossAzNearest + "\n" + "proxyUpgradeSupport=" + proxyUpgradeSupport + "\n"
                + "recoverInOriginSupport=" + recoverInOriginSupport + "\n" + "recoverInNewSupport=" + recoverInNewSupport + "\n" + "supportSentinelSwitch="
                + supportSentinelSwitch + "\n" + "whitelistGroupSupport=" + whitelistGroupSupport + "\n" + "bandwidthModify=" + bandwidthModify + "\n" + "shadowBackupSupport="
                + shadowBackupSupport + "\n" + "}";
    }

}