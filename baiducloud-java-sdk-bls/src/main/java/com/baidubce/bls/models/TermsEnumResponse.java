package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TermsEnumResponse extends BaseBceResponse {

    /**
    * 返回匹配到的term值数组
    */
    private List<String> terms;

    /**
    * error
    */
    private Error error;

    /**
    * http状态码，比如：500
    */
    private Integer status;

    public List<String> getTerms() {
        return terms;
    }

    public TermsEnumResponse setTerms(List<String> terms) {
        this.terms = terms;
        return this;
    }

    public Error getError() {
        return error;
    }

    public TermsEnumResponse setError(Error error) {
        this.error = error;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public TermsEnumResponse setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        return "TermsEnumResponse{" + "terms=" + terms + "\n" + "error=" + error + "\n" + "status=" + status + "\n" + "}";
    }

}
