package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRecordsUsingGETResponse extends BaseBceResponse {

    /**
    * records
    */
    private List<Record> records;

    /**
    * total
    */
    private Long total;

    public List<Record> getRecords() {
        return records;
    }

    public ListRecordsUsingGETResponse setRecords(List<Record> records) {
        this.records = records;
        return this;
    }

    public Long getTotal() {
        return total;
    }

    public ListRecordsUsingGETResponse setTotal(Long total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "ListRecordsUsingGETResponse{" + "records=" + records + "\n" + "total=" + total + "\n" + "}";
    }

}
