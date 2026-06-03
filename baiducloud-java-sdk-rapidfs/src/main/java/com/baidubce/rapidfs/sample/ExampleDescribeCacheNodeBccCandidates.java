package com.baidubce.rapidfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.rapidfs.RapidfsClient;
import com.baidubce.rapidfs.models.DescribeCacheNodeBccCandidatesRequest;
import com.baidubce.rapidfs.models.DescribeCacheNodeBccCandidatesResponse;
import java.util.ArrayList;

public class ExampleDescribeCacheNodeBccCandidates {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration config = new BceClientConfiguration();
        config.setCredentials(new DefaultBceCredentials(ak, sk));
        config.setEndpoint(endpoint);
        RapidfsClient client = new RapidfsClient(config);
        DescribeCacheNodeBccCandidatesRequest describeCacheNodeBccCandidatesRequest = new DescribeCacheNodeBccCandidatesRequest();
        describeCacheNodeBccCandidatesRequest.setInstanceId("");
        describeCacheNodeBccCandidatesRequest.setVpcId("");
        describeCacheNodeBccCandidatesRequest.setFilters(new ArrayList<>());
        describeCacheNodeBccCandidatesRequest.setMaxKeys(0);
        describeCacheNodeBccCandidatesRequest.setMarker("");
        try {
            DescribeCacheNodeBccCandidatesResponse response = client.describeCacheNodeBccCandidates(describeCacheNodeBccCandidatesRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
