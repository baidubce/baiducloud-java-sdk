package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupSyncStatusResponse extends BaseBceResponse {

    /**
    * 热活实例组ID
    */
    private List<Followers> followers;

    public List<Followers> getFollowers() {
        return followers;
    }

    public HotGroupSyncStatusResponse setFollowers(List<Followers> followers) {
        this.followers = followers;
        return this;
    }

    @Override
    public String toString() {
        return "HotGroupSyncStatusResponse{" + "followers=" + followers + "\n" + "}";
    }

}
