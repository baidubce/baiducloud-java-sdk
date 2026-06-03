package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetInstanceDetailResponse extends BaseBceResponse {

    /**
    * bos bucket
    */
    private String bucket;

    /**
    * 地域
    */
    private String region;

    /**
    * info
    */
    private Instance info;

    /**
    * statistic
    */
    private InstanceStatistic statistic;

    /**
    * quota
    */
    private InstanceQuota quota;

    public String getBucket() {
        return bucket;
    }

    public GetInstanceDetailResponse setBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public GetInstanceDetailResponse setRegion(String region) {
        this.region = region;
        return this;
    }

    public Instance getInfo() {
        return info;
    }

    public GetInstanceDetailResponse setInfo(Instance info) {
        this.info = info;
        return this;
    }

    public InstanceStatistic getStatistic() {
        return statistic;
    }

    public GetInstanceDetailResponse setStatistic(InstanceStatistic statistic) {
        this.statistic = statistic;
        return this;
    }

    public InstanceQuota getQuota() {
        return quota;
    }

    public GetInstanceDetailResponse setQuota(InstanceQuota quota) {
        this.quota = quota;
        return this;
    }

    @Override
    public String toString() {
        return "GetInstanceDetailResponse{" + "bucket=" + bucket + "\n" + "region=" + region + "\n" + "info=" + info + "\n" + "statistic=" + statistic + "\n" + "quota=" + quota
                + "\n" + "}";
    }

}
