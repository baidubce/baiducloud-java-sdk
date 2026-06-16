package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportKeypairResponse extends BaseBceResponse {

    /**
    * keypair
    */
    private KeypairModel keypair;

    public KeypairModel getKeypair() {
        return keypair;
    }

    public ImportKeypairResponse setKeypair(KeypairModel keypair) {
        this.keypair = keypair;
        return this;
    }

    @Override
    public String toString() {
        return "ImportKeypairResponse{" + "keypair=" + keypair + "\n" + "}";
    }

}
