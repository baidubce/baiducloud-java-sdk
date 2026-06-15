package com.baidubce.bcm.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportAlarmTemplatesResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 响应码，内容错误时为InvalidParameter
    */
    private String code;

    /**
    * 错误信息
    */
    private String message;

    /**
    * 内容错误的模板列表
    */
    private List<ErrTemplate> errTemplates;

    public Boolean getSuccess() {
        return success;
    }

    public ImportAlarmTemplatesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ImportAlarmTemplatesResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ImportAlarmTemplatesResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public List<ErrTemplate> getErrTemplates() {
        return errTemplates;
    }

    public ImportAlarmTemplatesResponse setErrTemplates(List<ErrTemplate> errTemplates) {
        this.errTemplates = errTemplates;
        return this;
    }

    @Override
    public String toString() {
        return "ImportAlarmTemplatesResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "message=" + message + "\n" + "errTemplates=" + errTemplates + "\n" + "}";
    }

}
