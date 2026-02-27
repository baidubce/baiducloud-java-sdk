package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReceiveEipTransferRequest extends BaseBceRequest {

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 转移资源短ID列表,单次最多接收30个。 */
  private List<String> transferIdList;

  public String getClientToken() {
    return clientToken;
  }

  public ReceiveEipTransferRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public List<String> getTransferIdList() {
    return transferIdList;
  }

  public ReceiveEipTransferRequest setTransferIdList(List<String> transferIdList) {
    this.transferIdList = transferIdList;
    return this;
  }
}
