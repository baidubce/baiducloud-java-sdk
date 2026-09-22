package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.HotGroupPreCheckRequest;
import com.baidubce.scs.models.Leader;
import com.baidubce.scs.models.HotGroupPreCheckResponse;
import java.util.ArrayList;

public class ExampleHotGroupPreCheck {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        Leader leader = new Leader();
        leader.setGroupName("");
        leader.setLeaderId("");
        leader.setLeaderRegion("");
        leader.setClusterName("");
        leader.setClusterShowId("");
        leader.setRegion("");
        leader.setStatus("");
        leader.setTotalCapacityInGB(0.0f);
        leader.setUsedCapacityInGB(0);
        leader.setShardNum(0);
        leader.setFlavor(0);
        leader.setQpsWrite(0L);
        leader.setQpsRead(0L);
        leader.setStaleReadable(false);
        leader.setForbidWrite(0);
        leader.setAvailabilityZone("");
        leader.setExpiredTime("");

        HotGroupPreCheckRequest hotGroupPreCheckRequest = new HotGroupPreCheckRequest();
        hotGroupPreCheckRequest.setLeader(leader);
        hotGroupPreCheckRequest.setFollowers(new ArrayList<>());
        try {
            HotGroupPreCheckResponse response = client.hotGroupPreCheck(hotGroupPreCheckRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
