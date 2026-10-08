package com.baidubce.scs.models;

/**
 * Gets or Sets InstanceStatus
 */
public enum InstanceStatus {

    VALUE_UNKNOWN("状态值"),

    CREATING("Creating"),

    DATAPREPAREING("Dataprepareing"),

    RUNNING("Running"),

    VALUE_TO_SYNC("To-sync"),

    REBOOTING("Rebooting"),

    PAUSING("Pausing"),

    PAUSED("Paused"),

    DELETED("Deleted"),

    DELETING("Deleting"),

    ERROR("Error"),

    FAILED("Failed"),

    MODIFYING("Modifying"),

    MODIFYFAILED("Modifyfailed"),

    EXPIRED("Expired"),

    FLUSHING("Flushing"),

    VALUE_FLUSH_FAILED("Flush failed"),

    AZTRANSFORMING("Aztransforming"),

    BACKUPING("Backuping"),

    RECOVERING("Recovering"),

    RESTARTING("Restarting"),

    ANALYSISING("Analysising"),

    EXCHANGING("Exchanging"),

    VALUE_EXCHANGE_FAILED("Exchange failed"),

    ISOLATED("Isolated"),

    RELAUNCHABLE("Relaunchable"),

    MODIFYABLE("Modifyable"),

    TOPOMODIFING("Topomodifing"),

    QUITTING("Quitting"),

    RO_CREATING("Ro_creating"),

    RO_DELETING("Ro_deleting"),

    UPDATE_DOMAIN_IN_DB("Update_domain_in_db"),

    SYNCCREATING("Synccreating"),

    SYNCDELETING("Syncdeleting"),

    ENTRANCE_CREATING("Entrance_creating"),

    MODIFYING_AZ("Modifying_az"),

    MODIFYING_DEFAULT_ENTRANCE("Modifying_default_entrance"),

    MODIFYING_NET_BANDWIDTH("Modifying_net_bandwidth"),

    NORMAL("Normal"),

    INITIAL("Initial"),

    VALUE_DEL_MEMBER("Del-member"),

    GROUPMODIFYING("Groupmodifying"),

    VALUE_AZ_TRANSFORM_FAILED("Az transform failed"),

    VALUE_MODIFY_TYPE_ADD_SHARDS("Modify-type-add-shards"),

    VALUE_MODIFY_TYPE_DEL_SHARDS("Modify-type-del-shards"),

    VALUE_MODIFY_TYPE_INCR_NODE_TYPE("Modify-type-incr-node-type"),

    VALUE_MODIFY_TYPE_DECR_NODE_TYPE("Modify-type-decr-node-type"),

    VALUE_MODIFY_TYPE_SPEC("Modify-type-spec"),

    CONFIGURING("Configuring"),

    VALUE_ADD_MEMBER("Add-member"),

    MALFUNCTIONING("Malfunctioning"),

    PROXY_REPLACING("Proxy_replacing");

    private String value;

    InstanceStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}