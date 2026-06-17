package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FieldCapsRequest extends BaseBceRequest {

    /**
    * name
    */
    @JsonIgnore
    private String name;

    /**
    * 索引字段名称，支持*通配符模糊匹配
    */
    private List<String> fields;

    public String getName() {
        return name;
    }

    public FieldCapsRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getFields() {
        return fields;
    }

    public FieldCapsRequest setFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

}
