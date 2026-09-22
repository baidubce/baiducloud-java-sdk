package com.baidubce.scs.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HotGroupPreCheckResponse extends BaseBceResponse {

    /**
    * 如果存在多个实例，检查主从、从从之间的网络联通性
    */
    private List<ConnectionResults> connectionResults;

    /**
    * leaderResult
    */
    private LeaderResult leaderResult;

    /**
    * 从角色实例数据配置检查结果
    */
    private List<FollowerResult> followerResult;

    public List<ConnectionResults> getConnectionResults() {
        return connectionResults;
    }

    public HotGroupPreCheckResponse setConnectionResults(List<ConnectionResults> connectionResults) {
        this.connectionResults = connectionResults;
        return this;
    }

    public LeaderResult getLeaderResult() {
        return leaderResult;
    }

    public HotGroupPreCheckResponse setLeaderResult(LeaderResult leaderResult) {
        this.leaderResult = leaderResult;
        return this;
    }

    public List<FollowerResult> getFollowerResult() {
        return followerResult;
    }

    public HotGroupPreCheckResponse setFollowerResult(List<FollowerResult> followerResult) {
        this.followerResult = followerResult;
        return this;
    }

    @Override
    public String toString() {
        return "HotGroupPreCheckResponse{" + "connectionResults=" + connectionResults + "\n" + "leaderResult=" + leaderResult + "\n" + "followerResult=" + followerResult + "\n"
                + "}";
    }

}
