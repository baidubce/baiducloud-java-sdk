package com.baidubce.eip.sample;

import com.baidubce.BceClientConfiguration;
import com.baidubce.BceClientException;
import com.baidubce.auth.DefaultBceCredentials;
import com.baidubce.eip.EipClient;
import com.baidubce.eip.models.EipPostpaidToPrepaidRequest;

public class ExampleEipPostpaidToPrepaid {
  public static void main(String[] args) {
    // 设置Client的Access Key ID和Secret Access
    // Key，获取AKSK详见:https://cloud.baidu.com/doc/Reference/s/9jwvz2egb
    String ak = "Your Ak";
    String sk = "Your Sk";
    String endpoint = "Endpoint";
    BceClientConfiguration config = new BceClientConfiguration();
    config.setCredentials(new DefaultBceCredentials(ak, sk));
    config.setEndpoint(endpoint);
    EipClient client = new EipClient(config);
    EipPostpaidToPrepaidRequest eipPostpaidToPrepaidRequest = new EipPostpaidToPrepaidRequest();
    eipPostpaidToPrepaidRequest.setEip("");
    eipPostpaidToPrepaidRequest.setClientToken("");
    eipPostpaidToPrepaidRequest.setPurchaseLength(0);
    eipPostpaidToPrepaidRequest.setBandWidth(0);
    try {
      client.eipPostpaidToPrepaid(eipPostpaidToPrepaidRequest);
    } catch (BceClientException e) {
      // 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
      System.out.println(e.getMessage());
    }
  }
}
