package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryLogHistogramResponse extends BaseBceResponse {

    /**
    * searchInfo
    */
    private SearchInfo searchInfo;

    /**
    * searchStatistic
    */
    private SearchStatistic searchStatistic;

    public SearchInfo getSearchInfo() {
        return searchInfo;
    }

    public QueryLogHistogramResponse setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
        return this;
    }

    public SearchStatistic getSearchStatistic() {
        return searchStatistic;
    }

    public QueryLogHistogramResponse setSearchStatistic(SearchStatistic searchStatistic) {
        this.searchStatistic = searchStatistic;
        return this;
    }

    @Override
    public String toString() {
        return "QueryLogHistogramResponse{" + "searchInfo=" + searchInfo + "\n" + "searchStatistic=" + searchStatistic + "\n" + "}";
    }

}
