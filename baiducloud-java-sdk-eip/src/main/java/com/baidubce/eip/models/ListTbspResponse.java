package com.baidubce.eip.models;

import java.util.List;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTbspResponse extends BaseBceResponse {
  /** 包含查询结果的列表 */
  private List<TbspModel> detailList;

  /** 标记查询的起始位置，若结果列表为空，此项不存在 */
  private String marker;

  /** true表示后面还有数据，false表示已经是最后一页 */
  private Boolean isTruncated;

  /** 获取下一页所需要传递的marker值，当isTruncated为false时，该域不出现 */
  private String nextMarker;

  /** 每页包含的最大数量 */
  private Integer maxKeys;

  public ListTbspResponse setDetailList(List<TbspModel> detailList) {
    this.detailList = detailList;
    return this;
  }

  public List<TbspModel> getDetailList() {
    return this.detailList;
  }

  public ListTbspResponse setMarker(String marker) {
    this.marker = marker;
    return this;
  }

  public String getMarker() {
    return this.marker;
  }

  public ListTbspResponse setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  public Boolean getIsTruncated() {
    return this.isTruncated;
  }

  public ListTbspResponse setNextMarker(String nextMarker) {
    this.nextMarker = nextMarker;
    return this;
  }

  public String getNextMarker() {
    return this.nextMarker;
  }

  public ListTbspResponse setMaxKeys(Integer maxKeys) {
    this.maxKeys = maxKeys;
    return this;
  }

  public Integer getMaxKeys() {
    return this.maxKeys;
  }

  @Override
  public String toString() {
    return "ListTbspResponse{"
        + "detailList="
        + detailList
        + "\n"
        + "marker="
        + marker
        + "\n"
        + "isTruncated="
        + isTruncated
        + "\n"
        + "nextMarker="
        + nextMarker
        + "\n"
        + "maxKeys="
        + maxKeys
        + "\n"
        + "}";
  }
}
