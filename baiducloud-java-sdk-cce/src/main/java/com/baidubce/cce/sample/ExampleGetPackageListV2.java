package com.baidubce.cce.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.cce.CceClient;
import com.baidubce.cce.models.GetPackageListV2Request;
import com.baidubce.cce.models.GetPackageListV2Response;
import java.util.ArrayList;

public class ExampleGetPackageListV2 {
    public static void main(String[] args) {
        String endpoint = "Your Endpoint";
        BceClientConfiguration bceClientConfig = new BceClientConfiguration();
        bceClientConfig.setEndpoint(endpoint);

        // ==== AK/SK 鉴权 ====
        String ak = "Your Ak";
        String sk = "Your Sk";
        bceClientConfig.setCredentials(new DefaultBceCredentials(ak, sk));

        CceClient client = new CceClient(bceClientConfig);
        GetPackageListV2Request getPackageListV2Request = new GetPackageListV2Request();
        getPackageListV2Request.setType("");
        getPackageListV2Request.setMachineSpecList(new ArrayList<>());
        try {
            GetPackageListV2Response response = client.getPackageListV2(getPackageListV2Request);
            System.out.println(response.toJsonString());
        } catch (BceClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
