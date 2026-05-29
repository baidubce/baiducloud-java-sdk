package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbIpGroupRequest;
import com.baidubce.blb.models.DescribeAppBlbIpGroupResponse;

public class ExampleDescribeAppBlbIpGroup {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        DescribeAppBlbIpGroupRequest describeAppBlbIpGroupRequest = new DescribeAppBlbIpGroupRequest();
        describeAppBlbIpGroupRequest.setBlbId("");
        describeAppBlbIpGroupRequest.setName("");
        describeAppBlbIpGroupRequest.setExactlyMatch(false);
        describeAppBlbIpGroupRequest.setMarker("");
        describeAppBlbIpGroupRequest.setMaxKeys(0);
        try {
            DescribeAppBlbIpGroupResponse response = client.describeAppBlbIpGroup(describeAppBlbIpGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
