package com.baidubce.apm.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.apm.ApmClient;
import com.baidubce.apm.models.DescribeServicesNamesRequest;
import com.baidubce.apm.models.DescribeServicesNamesResponse;
import com.baidubce.apm.models.Tag;
import java.util.ArrayList;

public class ExampleDescribeServicesNames {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        ApmClient client = new ApmClient(config);
        Tag tag = new Tag();
        tag.setKey("");
        tag.setValue("");

        DescribeServicesNamesRequest describeServicesNamesRequest = new DescribeServicesNamesRequest();
        describeServicesNamesRequest.setBeginDatetime("");
        describeServicesNamesRequest.setEndDatetime("");
        describeServicesNamesRequest.setServiceName("");
        describeServicesNamesRequest.setServiceId("");
        describeServicesNamesRequest.setLanguage("");
        describeServicesNamesRequest.setEnv("");
        describeServicesNamesRequest.setSource("");
        describeServicesNamesRequest.setTag(tag);
        describeServicesNamesRequest.setOrderBy("");
        describeServicesNamesRequest.setOrder("");
        describeServicesNamesRequest.setMetricFilters(new ArrayList<>());
        try {
            DescribeServicesNamesResponse response = client.describeServicesNames(describeServicesNamesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
