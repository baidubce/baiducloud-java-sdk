package com.baidubce.blb.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.blb.BlbClient;
import com.baidubce.blb.models.DescribeAppBlbIpGroupMemberRequest;
import com.baidubce.blb.models.DescribeAppBlbIpGroupMemberResponse;

public class ExampleDescribeAppBlbIpGroupMember {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        BlbClient client = new BlbClient(config);
        DescribeAppBlbIpGroupMemberRequest describeAppBlbIpGroupMemberRequest = new DescribeAppBlbIpGroupMemberRequest();
        describeAppBlbIpGroupMemberRequest.setBlbId("");
        describeAppBlbIpGroupMemberRequest.setIpGroupId("");
        describeAppBlbIpGroupMemberRequest.setMarker("");
        describeAppBlbIpGroupMemberRequest.setMaxKeys(0);
        try {
            DescribeAppBlbIpGroupMemberResponse response = client.describeAppBlbIpGroupMember(describeAppBlbIpGroupMemberRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
