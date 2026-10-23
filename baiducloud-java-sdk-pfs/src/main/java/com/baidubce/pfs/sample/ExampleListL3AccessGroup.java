package com.baidubce.pfs.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.pfs.PfsClient;
import com.baidubce.pfs.models.ListL3AccessGroupRequest;
import com.baidubce.pfs.models.ListL3AccessGroupResponse;

public class ExampleListL3AccessGroup {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        PfsClient client = new PfsClient(bceClientConfig);
        ListL3AccessGroupRequest listL3AccessGroupRequest = new ListL3AccessGroupRequest();
        listL3AccessGroupRequest.setKeyword("");
        listL3AccessGroupRequest.setKeywordType("");
        listL3AccessGroupRequest.setZoneName("");
        listL3AccessGroupRequest.setOrder("");
        listL3AccessGroupRequest.setOrderBy("");
        listL3AccessGroupRequest.setPageNo(0);
        listL3AccessGroupRequest.setPageSize(0);
        try {
            ListL3AccessGroupResponse response = client.listL3AccessGroup(listL3AccessGroupRequest);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
