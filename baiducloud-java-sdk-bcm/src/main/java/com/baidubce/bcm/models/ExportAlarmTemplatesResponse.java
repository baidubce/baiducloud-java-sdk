package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExportAlarmTemplatesResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 导出的报警模板列表
    */
    private List<Template> templates;

    public Boolean getSuccess() {
        return success;
    }

    public ExportAlarmTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ExportAlarmTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ExportAlarmTemplatesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public ExportAlarmTemplatesResponse setTemplates(List<Template> templates) {
        this.templates = templates;
        return this;
    }

    @Override
    public String toString() {
        return "ExportAlarmTemplatesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "templates=" + templates + "\n" + "}";
    }

}
