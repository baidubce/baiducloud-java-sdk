package com.baidubce.face.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FaceVerifyLiveness {
    /**
     * 单张图片的活体得分，范围[0~1]
     */
    private Double livemapscore;

    public FaceVerifyLiveness setLivemapscore(Double livemapscore) {
        this.livemapscore = livemapscore;
        return this;
    }

    public Double getLivemapscore() {
        return this.livemapscore;
    }

    @Override
    public String toString() {
        return "FaceVerifyLiveness{" + "livemapscore=" + livemapscore + "\n" + "}";
    }

}