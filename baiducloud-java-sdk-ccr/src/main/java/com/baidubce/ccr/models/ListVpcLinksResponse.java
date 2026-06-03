package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListVpcLinksResponse extends BaseBceResponse {

    /**
    * 私有网络域名
    */
    private String domain;

    /**
    * 私有网络结果列表
    */
    private List<Privatelinks> items;

    public String getDomain() {
        return domain;
    }

    public ListVpcLinksResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public List<Privatelinks> getItems() {
        return items;
    }

    public ListVpcLinksResponse setItems(List<Privatelinks> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ListVpcLinksResponse{" + "domain=" + domain + "\n" + "items=" + items + "\n" + "}";
    }

}
