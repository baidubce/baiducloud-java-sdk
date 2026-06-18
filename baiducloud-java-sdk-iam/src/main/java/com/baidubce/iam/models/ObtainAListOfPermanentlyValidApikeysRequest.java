package com.baidubce.iam.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObtainAListOfPermanentlyValidApikeysRequest extends BaseBceRequest {

    /**
    * 子用户Id；如果apikey归属其他子用户则必填
    */
    private String userId;

    /**
    * 筛选条件['AI_APAAS', 'WENXINFACTORY', 'CONSOLE_AI']，  APIKey 归属服务，多个service是或的关系
    */
    private List<String> service;

    /**
    * 页码，从1开始；默认 1
    */
    private Integer pageNo;

    /**
    * 每页大小；默认10
    */
    private Integer pageSize;

    public String getUserId() {
        return userId;
    }

    public ObtainAListOfPermanentlyValidApikeysRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public List<String> getService() {
        return service;
    }

    public ObtainAListOfPermanentlyValidApikeysRequest setService(List<String> service) {
        this.service = service;
        return this;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public ObtainAListOfPermanentlyValidApikeysRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ObtainAListOfPermanentlyValidApikeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
