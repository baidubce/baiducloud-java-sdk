package com.baidubce.aigw.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAIGatewaysRequest extends BaseBceRequest {

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

    /**
    * keywordType
    */
    @JsonIgnore
    private String keywordType;

    /**
    * status
    */
    @JsonIgnore
    private String status;

    /**
    * srcProduct
    */
    @JsonIgnore
    private String srcProduct;

    /**
    * tagKey
    */
    @JsonIgnore
    private String tagKey;

    /**
    * tagValue
    */
    @JsonIgnore
    private String tagValue;

    /**
    * resourceGroupId
    */
    @JsonIgnore
    private String resourceGroupId;

    /**
    * pageNo
    */
    @JsonIgnore
    private Integer pageNo;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    /**
    * orderBy
    */
    @JsonIgnore
    private String orderBy;

    /**
    * order
    */
    @JsonIgnore
    private String order;

    /**
    * xRegion
    */
    @JsonIgnore
    private String xRegion;

    public String getKeyword() {
        return keyword;
    }

    public ListAIGatewaysRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getKeywordType() {
        return keywordType;
    }

    public ListAIGatewaysRequest setKeywordType(String keywordType) {
        this.keywordType = keywordType;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ListAIGatewaysRequest setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getSrcProduct() {
        return srcProduct;
    }

    public ListAIGatewaysRequest setSrcProduct(String srcProduct) {
        this.srcProduct = srcProduct;
        return this;
    }

    public String getTagKey() {
        return tagKey;
    }

    public ListAIGatewaysRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }

    public String getTagValue() {
        return tagValue;
    }

    public ListAIGatewaysRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

    public String getResourceGroupId() {
        return resourceGroupId;
    }

    public ListAIGatewaysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ListAIGatewaysRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListAIGatewaysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public ListAIGatewaysRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getOrder() {
        return order;
    }

    public ListAIGatewaysRequest setOrder(String order) {
        this.order = order;
        return this;
    }

    public String getXRegion() {
        return xRegion;
    }

    public ListAIGatewaysRequest setXRegion(String xRegion) {
        this.xRegion = xRegion;
        return this;
    }

}
