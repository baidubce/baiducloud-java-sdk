package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExportAlarmTemplatesRequest extends BaseBceRequest {

    /**
    * 报警模板名称列表
    */
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public ExportAlarmTemplatesRequest setNames(List<String> names) {
        this.names = names;
        return this;
    }

}
