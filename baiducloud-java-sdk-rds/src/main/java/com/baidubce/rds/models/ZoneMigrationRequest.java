package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZoneMigrationRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 主可用区
    */
    @JsonProperty("master_azone")
    private String masterAzone;

    /**
    * 备可用区
    */
    @JsonProperty
    ("backup_azone")private String backupAzone;

    /**
    * 可用区
    */
    private List<String> zoneNames;

    /**
    * 可用区子网
    */
    private List<SubnetMap> subnets;

    /**
    * 切换生效时间，默认值：immediate。 - immediate：立即生效； - timewindow：在时间窗口内进行切换或者重启等短暂影响业务的动作。
    */
    private String effectiveTime;

    public String getInstanceId() {
        return instanceId;
    }

    public ZoneMigrationRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getMasterAzone() {
        return masterAzone;
    }

    public ZoneMigrationRequest setMasterAzone(String masterAzone) {
        this.masterAzone = masterAzone;
        return this;
    }

    public String getBackupAzone() {
        return backupAzone;
    }

    public ZoneMigrationRequest setBackupAzone(String backupAzone) {
        this.backupAzone = backupAzone;
        return this;
    }

    public List<String> getZoneNames() {
        return zoneNames;
    }

    public ZoneMigrationRequest setZoneNames(List<String> zoneNames) {
        this.zoneNames = zoneNames;
        return this;
    }

    public List<SubnetMap> getSubnets() {
        return subnets;
    }

    public ZoneMigrationRequest setSubnets(List<SubnetMap> subnets) {
        this.subnets = subnets;
        return this;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public ZoneMigrationRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

}
