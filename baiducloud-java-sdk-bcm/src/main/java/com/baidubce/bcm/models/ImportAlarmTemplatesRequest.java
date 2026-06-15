package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportAlarmTemplatesRequest extends BaseBceRequest {

    /**
    * 若模板重名，是否覆盖（true覆盖/false跳过）
    */
    private Boolean overwrite;

    /**
    * 报警模板列表
    */
    private List<Template> templates;

    public Boolean getOverwrite() {
        return overwrite;
    }

    public ImportAlarmTemplatesRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public ImportAlarmTemplatesRequest setTemplates(List<Template> templates) {
        this.templates = templates;
        return this;
    }

}
