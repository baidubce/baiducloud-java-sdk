package com.baidubce.bls.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.bls.BlsClient;
import com.baidubce.bls.models.AsyncSearchRequest;
import com.baidubce.bls.models.Highlight;
import com.baidubce.bls.models.AsyncSearchResponse;
import java.util.HashMap;
import java.util.ArrayList;

public class ExampleAsyncSearch {
    public static void main(String[] args) {
        // 设置Client的Access Key ID和Secret Access Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
        String ak = "Your Ak";
        String sk = "Your Sk";
        String endpoint = "Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));
        bceClientConfig.setEndpoint(endpoint);
        BlsClient client = new BlsClient(bceClientConfig);
        Highlight highlight = new Highlight();
        highlight.setPreTags(new ArrayList<>());
        highlight.setPostTags(new ArrayList<>());

        AsyncSearchRequest asyncSearchRequest = new AsyncSearchRequest();
        asyncSearchRequest.setName("");
        asyncSearchRequest.setQuery(null);
        asyncSearchRequest.setAggs(null);
        asyncSearchRequest.setFields(new ArrayList<>());
        asyncSearchRequest.setSort(new HashMap<>());
        asyncSearchRequest.setSearchAfter(new ArrayList<>());
        asyncSearchRequest.setHighlight(highlight);
        asyncSearchRequest.setSize(0);
        try {
            AsyncSearchResponse response = client.asyncSearch(asyncSearchRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
