package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAlarmMaskingStatesRequest extends BaseBceRequest {

    /**
    * 屏蔽规则ID列表
    */
    private List<String> ids;

    /**
    * 目标状态，可选ENABLED/DISABLED
    */
    private String state;

    public List<String> getIds() {
        return ids;
    }

    public UpdateAlarmMaskingStatesRequest setIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public String getState() {
        return state;
    }

    public UpdateAlarmMaskingStatesRequest setState(String state) {
        this.state = state;
        return this;
    }

}
