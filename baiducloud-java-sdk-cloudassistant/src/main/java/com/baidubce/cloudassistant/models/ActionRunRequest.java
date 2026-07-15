package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionRunRequest extends BaseBceRequest {

    /**
    * locale
    */
    @JsonIgnore
    private String locale;

    /**
    * 所要执行的命令，仅需填写id
    */
    private Object action;

    /**
    * 执行命令时的参数值，仅在命令有参数时需要
    */
    private Object parameters;

    /**
    * 实例选择器类型，仅在执行动作为执行或保存并执行时需要。默认值为INSTANCES_LIST。可选值：INSTANCES_LIST（实例列表），ALL_INSTANCES（全部实例），TAG_INSTANCES（实例标签选择），INSTANCES_IMPORT（实例列表导入）
    */
    private String targetSelectorType;

    /**
    * 实例ID列表，仅在targetSelectorType为INSTANCES_LIST时需要
    */
    private List<Object> targets;

    /**
    * targetSelector
    */
    private TargetSelector targetSelector;

    public String getLocale() {
        return locale;
    }

    public ActionRunRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }

    public Object getAction() {
        return action;
    }

    public ActionRunRequest setAction(Object action) {
        this.action = action;
        return this;
    }

    public Object getParameters() {
        return parameters;
    }

    public ActionRunRequest setParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    public String getTargetSelectorType() {
        return targetSelectorType;
    }

    public ActionRunRequest setTargetSelectorType(String targetSelectorType) {
        this.targetSelectorType = targetSelectorType;
        return this;
    }

    public List<Object> getTargets() {
        return targets;
    }

    public ActionRunRequest setTargets(List<Object> targets) {
        this.targets = targets;
        return this;
    }

    public TargetSelector getTargetSelector() {
        return targetSelector;
    }

    public ActionRunRequest setTargetSelector(TargetSelector targetSelector) {
        this.targetSelector = targetSelector;
        return this;
    }

}
