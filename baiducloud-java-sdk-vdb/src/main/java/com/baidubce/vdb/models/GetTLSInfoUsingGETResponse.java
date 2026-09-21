package com.baidubce.vdb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTLSInfoUsingGETResponse extends BaseBceResponse {

    /**
    * tlsExpiredDate
    */
    private String tlsExpiredDate;

    /**
    * tlsIssuedDate
    */
    private String tlsIssuedDate;

    /**
    * tlsStatus
    */
    private String tlsStatus;

    /**
    * tlsValidDays
    */
    private Integer tlsValidDays;

    public String getTlsExpiredDate() {
        return tlsExpiredDate;
    }

    public GetTLSInfoUsingGETResponse setTlsExpiredDate(String tlsExpiredDate) {
        this.tlsExpiredDate = tlsExpiredDate;
        return this;
    }

    public String getTlsIssuedDate() {
        return tlsIssuedDate;
    }

    public GetTLSInfoUsingGETResponse setTlsIssuedDate(String tlsIssuedDate) {
        this.tlsIssuedDate = tlsIssuedDate;
        return this;
    }

    public String getTlsStatus() {
        return tlsStatus;
    }

    public GetTLSInfoUsingGETResponse setTlsStatus(String tlsStatus) {
        this.tlsStatus = tlsStatus;
        return this;
    }

    public Integer getTlsValidDays() {
        return tlsValidDays;
    }

    public GetTLSInfoUsingGETResponse setTlsValidDays(Integer tlsValidDays) {
        this.tlsValidDays = tlsValidDays;
        return this;
    }

    @Override
    public String toString() {
        return "GetTLSInfoUsingGETResponse{" + "tlsExpiredDate=" + tlsExpiredDate + "\n" + "tlsIssuedDate=" + tlsIssuedDate + "\n" + "tlsStatus=" + tlsStatus + "\n"
                + "tlsValidDays=" + tlsValidDays + "\n" + "}";
    }

}
