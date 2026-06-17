package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsyncSearchRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * 语法同普通queryDSL，语法规则参考[官网](https://www.elastic.co/docs/reference/query-languages/querydsl)
    */
    private Object query;

    /**
    * 语法桶普通的Aggregations，语法规则参考[官网](https://www.elastic.co/docs/reference/aggregations/)
    */
    private Object aggs;

    /**
    * 返回的字段列表，默认全部字段
    */
    private List<String> fields;

    /**
    * 排序，目前仅支持按照@timestamp排序，默认按时间倒序
    */
    private Map<String, Map<String, String>> sort;

    /**
    * 下一页游标，目前只支持数组的第一个元素，默认从指定时间的第一个开始查询
    */
    private List<String> searchAfter;

    /**
    * highlight
    */
    private Highlight highlight;

    /**
    * 查询返回多少条命中的日志，默认1000
    */
    private Integer size;

    public String getName() {
        return name;
    }

    public AsyncSearchRequest setName(String name) {
        this.name = name;
        return this;
    }

    public Object getQuery() {
        return query;
    }

    public AsyncSearchRequest setQuery(Object query) {
        this.query = query;
        return this;
    }

    public Object getAggs() {
        return aggs;
    }

    public AsyncSearchRequest setAggs(Object aggs) {
        this.aggs = aggs;
        return this;
    }

    public List<String> getFields() {
        return fields;
    }

    public AsyncSearchRequest setFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    public Map<String, Map<String, String>> getSort() {
        return sort;
    }

    public AsyncSearchRequest setSort(Map<String, Map<String, String>> sort) {
        this.sort = sort;
        return this;
    }

    public List<String> getSearchAfter() {
        return searchAfter;
    }

    public AsyncSearchRequest setSearchAfter(List<String> searchAfter) {
        this.searchAfter = searchAfter;
        return this;
    }

    public Highlight getHighlight() {
        return highlight;
    }

    public AsyncSearchRequest setHighlight(Highlight highlight) {
        this.highlight = highlight;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public AsyncSearchRequest setSize(Integer size) {
        this.size = size;
        return this;
    }

}
