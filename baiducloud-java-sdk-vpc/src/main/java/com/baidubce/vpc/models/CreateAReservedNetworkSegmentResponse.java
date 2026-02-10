
package com.baidubce.vpc.models;



import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAReservedNetworkSegmentResponse extends BaseBceResponse  {
    /**
     * 预留网段的ID
     */
    private String ipReserveId;

    public CreateAReservedNetworkSegmentResponse setIpReserveId(String ipReserveId) {
        this.ipReserveId = ipReserveId;
        return this;
    }

    public String getIpReserveId() {
        return this.ipReserveId;
    }

    @Override
    public String toString() {
        return "CreateAReservedNetworkSegmentResponse{"
                + "ipReserveId=" + ipReserveId + "\n"
                + "}";
    }




}