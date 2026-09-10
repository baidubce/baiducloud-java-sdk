package com.baidubce.cce.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteOption {
    /**
     * 
     */
    private Boolean deleteResource;

    /**
     * 
     */
    private Boolean deleteCDSSnapshot;

    /**
     * 
     */
    private Boolean moveOut;

    public DeleteOption setDeleteResource(Boolean deleteResource) {
        this.deleteResource = deleteResource;
        return this;
    }

    public Boolean getDeleteResource() {
        return this.deleteResource;
    }

    public DeleteOption setDeleteCDSSnapshot(Boolean deleteCDSSnapshot) {
        this.deleteCDSSnapshot = deleteCDSSnapshot;
        return this;
    }

    public Boolean getDeleteCDSSnapshot() {
        return this.deleteCDSSnapshot;
    }

    public DeleteOption setMoveOut(Boolean moveOut) {
        this.moveOut = moveOut;
        return this;
    }

    public Boolean getMoveOut() {
        return this.moveOut;
    }

    @Override
    public String toString() {
        return "DeleteOption{" + "deleteResource=" + deleteResource + "\n" + "deleteCDSSnapshot=" + deleteCDSSnapshot + "\n" + "moveOut=" + moveOut + "\n" + "}";
    }

}