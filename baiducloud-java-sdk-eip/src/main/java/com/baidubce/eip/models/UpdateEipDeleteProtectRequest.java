package com.baidubce.eip.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateEipDeleteProtectRequest extends BaseBceRequest {

  /** eip */
  @JsonIgnore private String eip;

  /** clientToken */
  @JsonIgnore private String clientToken;

  /** 是否开启释放保护 */
  private Boolean deleteProtect;

  public String getEip() {
    return eip;
  }

  public UpdateEipDeleteProtectRequest setEip(String eip) {
    this.eip = eip;
    return this;
  }

  public String getClientToken() {
    return clientToken;
  }

  public UpdateEipDeleteProtectRequest setClientToken(String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  public Boolean getDeleteProtect() {
    return deleteProtect;
  }

  public UpdateEipDeleteProtectRequest setDeleteProtect(Boolean deleteProtect) {
    this.deleteProtect = deleteProtect;
    return this;
  }
}
