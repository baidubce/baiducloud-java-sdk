package com.baidubce.vpc.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.vpc.VpcClient;
import com.baidubce.vpc.models.QueryVpcListRequest;
import com.baidubce.vpc.models.QueryVpcListResponse;

public class ExampleQueryVpcList {
  public static void main(String[] args) {
    // 设置Client的Access Key ID和Secret Access
    // Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
    String ak = "Your Ak";
    String sk = "Your Sk";
    String endpoint = "Endpoint";
    BceClientConfiguration config = new BceClientConfiguration();
    config.setCredentials(new DefaultBceCredentials(ak, sk));
    config.setEndpoint(endpoint);
    VpcClient client = new VpcClient(config);
    QueryVpcListRequest queryVpcListRequest = new QueryVpcListRequest();
    queryVpcListRequest.setMarker("");
    queryVpcListRequest.setMaxKeys(0);
    queryVpcListRequest.setIsDefault(false);
    queryVpcListRequest.setVpcIds("");
    try {
      QueryVpcListResponse response = client.queryVpcList(queryVpcListRequest);
      System.out.println(response.toJsonString());
    } catch (BceClientException e) {
      System.out.println(e.getMessage());
    }
  }
}
