package com.baidubce.rds.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DccHostInfo {
    /**
     * master
     */
    private DccHostId master;

    /**
     * backup
     */
    private DccHostId backup;

    public DccHostInfo setMaster(DccHostId master) {
        this.master = master;
        return this;
    }

    public DccHostId getMaster() {
        return this.master;
    }

    public DccHostInfo setBackup(DccHostId backup) {
        this.backup = backup;
        return this;
    }

    public DccHostId getBackup() {
        return this.backup;
    }

    @Override
    public String toString() {
        return "DccHostInfo{" + "master=" + master + "\n" + "backup=" + backup + "\n" + "}";
    }

}