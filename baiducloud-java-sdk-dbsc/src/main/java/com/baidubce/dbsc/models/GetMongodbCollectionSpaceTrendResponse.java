package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMongodbCollectionSpaceTrendResponse extends BaseBceResponse {

    /**
    * result
    */
    private TrendResultBase result;

    public TrendResultBase getResult() {
        return result;
    }

    public GetMongodbCollectionSpaceTrendResponse setResult(TrendResultBase result) {
        this.result = result;
        return this;
    }

    @Override
    public String toString() {
        return "GetMongodbCollectionSpaceTrendResponse{" + "result=" + result + "\n" + "}";
    }

}
