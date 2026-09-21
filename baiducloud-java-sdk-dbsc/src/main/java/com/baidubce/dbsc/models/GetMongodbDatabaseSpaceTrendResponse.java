package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbDatabaseSpaceTrendResponse extends BaseBceResponse {

    /**
    * result
    */
    private TrendResultBase result;

    public TrendResultBase getResult() {
        return result;
    }

    public GetMongodbDatabaseSpaceTrendResponse setResult(TrendResultBase result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbDatabaseSpaceTrendResponse{" + "result=" + result + "\n" + "}";
    }

}
