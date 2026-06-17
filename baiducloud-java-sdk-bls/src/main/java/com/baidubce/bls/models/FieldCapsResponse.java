package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldCapsResponse extends BaseBceResponse {

    /**
    * 索引列表，目前只有一个元素
    */
    private List<String> indices;

    /**
    * 索引字段，字段名称-字段类型-字段元信息的关系
    */
    private Map<String, Map<String, Field>> fields;

    /**
    * error
    */
    private Error error;

    /**
    * http状态码，比如：500
    */
    private Integer status;

    public List<String> getIndices() {
        return indices;
    }

    public FieldCapsResponse setIndices(List<String> indices) {
        this.indices = indices;
        return this;
    }

    public Map<String, Map<String, Field>> getFields() {
        return fields;
    }

    public FieldCapsResponse setFields(Map<String, Map<String, Field>> fields) {
        this.fields = fields;
        return this;
    }

    public Error getError() {
        return error;
    }

    public FieldCapsResponse setError(Error error) {
        this.error = error;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public FieldCapsResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "FieldCapsResponse{" + "indices=" + indices + "\n" + "fields=" + fields + "\n" + "error=" + error + "\n" + "status=" + status + "\n" + "}";
    }

}
