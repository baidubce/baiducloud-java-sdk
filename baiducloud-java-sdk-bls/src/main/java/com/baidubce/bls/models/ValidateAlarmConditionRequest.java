package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidateAlarmConditionRequest extends BaseBceRequest {

    /**
    * 字段名称和类型，按照sql的顺序
    */
    private List<String> fieldTypes;

    /**
    * 执行条件列表
    */
    private List<String> conditions;

    public List<String> getFieldTypes() {
        return fieldTypes;
    }

    public ValidateAlarmConditionRequest setFieldTypes(List<String> fieldTypes) {
        this.fieldTypes = fieldTypes;
        return this;
    }

    public List<String> getConditions() {
        return conditions;
    }

    public ValidateAlarmConditionRequest setConditions(List<String> conditions) {
        this.conditions = conditions;
        return this;
    }

}
