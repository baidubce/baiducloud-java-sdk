package com.baidubce.bcc.models;

/**
 * Gets or Sets StorageType
 */
public enum StorageType {

    ENHANCED_SSD_PL0("enhanced_ssd_pl0"),

    ENHANCED_SSD_PL1("enhanced_ssd_pl1"),

    SSD_ENHANCED("SSD_Enhanced"),

    ENHANCED_SSD_PL2("enhanced_ssd_pl2"),

    ENHANCED_SSD_PL3("enhanced_ssd_pl3"),

    CLOUD_HP1("cloud_hp1"),

    PREMIUM_SSD("premium_ssd"),

    HP1("hp1"),

    SSD("ssd"),

    HDD("hdd"),

    ELASTIC_EPHEMERAL_DISK("elastic_ephemeral_disk"),

    LOCAL("local"),

    SATA("sata"),

    LOCAL_SSD("local_ssd"),

    LOCAL_HDD("local_hdd"),

    STD1("std1"),

    LOCAL_NVME("local_nvme"),

    NVME("nvme");

    private String value;

    StorageType(String value) {
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