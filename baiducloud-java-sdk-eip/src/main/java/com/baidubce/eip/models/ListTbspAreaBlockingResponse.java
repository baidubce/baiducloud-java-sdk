package com.baidubce.eip.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspAreaBlockingResponse extends BaseBceResponse {
  /** 包含查询结果的列表 */
  private List<TbspAreaBlockingModel> areaBlockingList;

  /** DDoS增强防护包ID */
  private String id;

  public ListTbspAreaBlockingResponse setAreaBlockingList(
      List<TbspAreaBlockingModel> areaBlockingList) {
    this.areaBlockingList = areaBlockingList;
    return this;
  }

  public List<TbspAreaBlockingModel> getAreaBlockingList() {
    return this.areaBlockingList;
  }

  public ListTbspAreaBlockingResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return this.id;
  }

  @Override
  public String toString() {
    return "ListTbspAreaBlockingResponse{"
        + "areaBlockingList="
        + areaBlockingList
        + "\n"
        + "id="
        + id
        + "\n"
        + "}";
  }
}
