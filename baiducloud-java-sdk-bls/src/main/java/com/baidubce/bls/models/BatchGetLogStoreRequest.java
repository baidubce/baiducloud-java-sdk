package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchGetLogStoreRequest extends BaseBceRequest {

    /**
    * 待查询的日志集，每次最大查询100个
    */
    private List<LogStoreBatchRequest> logStores;

    public List<LogStoreBatchRequest> getLogStores() {
        return logStores;
    }

    public BatchGetLogStoreRequest setLogStores(List<LogStoreBatchRequest> logStores) {
        this.logStores = logStores;
        return this;
    }

}
