package com.baidubce.cloudassistant.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateActionRequest extends BaseBceRequest {

    /**
    * 执行动作。SAVE(仅保存），RUN（仅执行），SAVE_AND_RUN（保存并执行）
    */
    private String execution;

    /**
    * action
    */
    private Action action;

    /**
    * 执行命令时的参数值，仅在命令有参数且需要执行时需要
    */
    private Object parameters;

    /**
    * 实例选择器类型，仅在执行动作为执行或保存并执行时需要。默认值为INSTANCES_LIST。可选值：INSTANCES_LIST（实例列表），ALL_INSTANCES（全部实例），TAG_INSTANCES（实例标签选择），INSTANCES_IMPORT（实例列表导入）
    */
    private String targetSelectorType;

    /**
    * 实例ID列表，仅在targetSelectorType为INSTANCES_LIST时需要
    */
    private List<Target> targets;

    /**
    * targetSelector
    */
    private TargetSelector targetSelector;

    public String getExecution() {
        return execution;
    }

    public UpdateActionRequest setExecution(String execution) {
        this.execution = execution;
        return this;
    }

    public Action getAction() {
        return action;
    }

    public UpdateActionRequest setAction(Action action) {
        this.action = action;
        return this;
    }

    public Object getParameters() {
        return parameters;
    }

    public UpdateActionRequest setParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    public String getTargetSelectorType() {
        return targetSelectorType;
    }

    public UpdateActionRequest setTargetSelectorType(String targetSelectorType) {
        this.targetSelectorType = targetSelectorType;
        return this;
    }

    public List<Target> getTargets() {
        return targets;
    }

    public UpdateActionRequest setTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public TargetSelector getTargetSelector() {
        return targetSelector;
    }

    public UpdateActionRequest setTargetSelector(TargetSelector targetSelector) {
        this.targetSelector = targetSelector;
        return this;
    }

}
