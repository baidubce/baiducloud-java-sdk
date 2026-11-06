package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveDatabaseListResponse extends BaseBceResponse {

    /**
    * 由[Database](#Database)对象组成的数组。
    */
    private List<Database> databases;

    public List<Database> getDatabases() {
        return databases;
    }

    public RetrieveDatabaseListResponse setDatabases(List<Database> databases) {
        this.databases = databases;
        return this;
    }

    @Override
    public String toString() {
        return "RetrieveDatabaseListResponse{" + "databases=" + databases + "\n" + "}";
    }

}
