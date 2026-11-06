package com.baidubce.rds.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetParameterTemplateListResponse extends BaseBceResponse {

    /**
    * 参数模板列表。
    */
    @JsonProperty("list")
    private List<Template> rdsList;

    /**
    * 当前页号。
    */
    private Integer page;

    /**
    * 每页数量。
    */
    private Integer perpage;

    /**
    * 总数。
    */
    private Integer total;

    public List<Template> getRdsList() {
        return rdsList;
    }

    public GetParameterTemplateListResponse setRdsList(List<Template> rdsList) {
        this.rdsList = rdsList;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public GetParameterTemplateListResponse setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getPerpage() {
        return perpage;
    }

    public GetParameterTemplateListResponse setPerpage(Integer perpage) {
        this.perpage = perpage;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public GetParameterTemplateListResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    @Override
    public String toString() {
        return "GetParameterTemplateListResponse{" + "rdsList=" + rdsList + "\n" + "page=" + page + "\n" + "perpage=" + perpage + "\n" + "total=" + total + "\n" + "}";
    }

}
