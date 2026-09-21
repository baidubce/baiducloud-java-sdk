package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRecordsUsingGETRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * engineType
    */
    @JsonIgnore
    private String engineType;

    /**
    * listOrder
    */
    @JsonIgnore
    private String listOrder;

    /**
    * page
    */
    @JsonIgnore
    private String page;

    /**
    * pageSize
    */
    @JsonIgnore
    private String pageSize;

    public String getInstanceId() {
        return instanceId;
    }

    public ListRecordsUsingGETRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getEngineType() {
        return engineType;
    }

    public ListRecordsUsingGETRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    public String getListOrder() {
        return listOrder;
    }

    public ListRecordsUsingGETRequest setListOrder(String listOrder) {
        this.listOrder = listOrder;
        return this;
    }

    public String getPage() {
        return page;
    }

    public ListRecordsUsingGETRequest setPage(String page) {
        this.page = page;
        return this;
    }

    public String getPageSize() {
        return pageSize;
    }

    public ListRecordsUsingGETRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
