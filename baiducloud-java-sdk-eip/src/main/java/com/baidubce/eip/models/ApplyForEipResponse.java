
package com.baidubce.eip.models;



import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApplyForEipResponse extends BaseBceResponse  {
    /**
     * 分配的EIP地址
     */
    private String eip;

    public ApplyForEipResponse setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public String getEip() {
        return this.eip;
    }

    @Override
    public String toString() {
        return "ApplyForEipResponse{"
                + "eip=" + eip + "\n"
                + "}";
    }




}