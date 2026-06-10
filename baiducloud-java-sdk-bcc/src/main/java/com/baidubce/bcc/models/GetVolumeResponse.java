package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetVolumeResponse extends BaseBceResponse {

    /**
    * volume
    */
    private VolumeModel volume;

    public VolumeModel getVolume() {
        return volume;
    }

    public GetVolumeResponse setVolume(VolumeModel volume) {
        this.volume = volume;
        return this;
    }

    @Override
    public String toString() {
        return "GetVolumeResponse{" + "volume=" + volume + "\n" + "}";
    }

}
