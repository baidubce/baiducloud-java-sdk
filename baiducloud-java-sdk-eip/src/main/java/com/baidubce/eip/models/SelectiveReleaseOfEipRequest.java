package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SelectiveReleaseOfEipRequest {

    /**
    * eip
    */
    @JsonIgnore
    private String eip;

    /**
    * releaseToRecycle
    */
    @JsonIgnore
    private Boolean releaseToRecycle;

    /**
    * clientToken
    */
    @JsonIgnore
    private String clientToken;


    public String getEip() {
        return eip;
    }

    public SelectiveReleaseOfEipRequest setEip(String eip) {
        this.eip = eip;
        return this;
    }

    public Boolean getReleaseToRecycle() {
        return releaseToRecycle;
    }

    public SelectiveReleaseOfEipRequest setReleaseToRecycle(Boolean releaseToRecycle) {
        this.releaseToRecycle = releaseToRecycle;
        return this;
    }

    public String getClientToken() {
        return clientToken;
    }

    public SelectiveReleaseOfEipRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }


}
