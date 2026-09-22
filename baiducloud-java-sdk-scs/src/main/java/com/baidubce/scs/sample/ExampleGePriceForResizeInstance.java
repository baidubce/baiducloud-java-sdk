package com.baidubce.scs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.scs.ScsClient;
import com.baidubce.scs.models.GePriceForResizeInstanceRequest;
import com.baidubce.scs.models.GePriceForResizeInstanceResponse;

public class ExampleGePriceForResizeInstance {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        ScsClient client = new ScsClient(bceClientConfig);
        GePriceForResizeInstanceRequest gePriceForResizeInstanceRequest = new GePriceForResizeInstanceRequest();
        gePriceForResizeInstanceRequest.setClientToken("");
        gePriceForResizeInstanceRequest.setInstanceId("");
        gePriceForResizeInstanceRequest.setNodeType("");
        gePriceForResizeInstanceRequest.setShardNum(0);
        gePriceForResizeInstanceRequest.setReplicationNum(0);
        gePriceForResizeInstanceRequest.setDiskFlavor(0);
        gePriceForResizeInstanceRequest.setChargeType("");
        gePriceForResizeInstanceRequest.setPeriod(0);
        gePriceForResizeInstanceRequest.setChangeType("");
        try {
            GePriceForResizeInstanceResponse response = client.gePriceForResizeInstance(gePriceForResizeInstanceRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
