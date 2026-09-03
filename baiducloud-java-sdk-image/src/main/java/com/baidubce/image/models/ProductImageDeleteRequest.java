package com.baidubce.image.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductImageDeleteRequest extends BaseBceRequest {

    /**
    * 图片数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，和url、cont_sign三选一，优先级：image > url > cont_sign，注意要去掉图片头部，如（data:image/jpg;base64,
    * ）。最短边至少50px，最长边最大4096px，支持jpg/png/bmp格式
    */
    private String image;

    /**
    * 图片URL，和image、cont_sign三选一，image优先级更高，由于图床的差异性，抓图服务无法适配所有的图床，部分URL可能抓不到图，或者图片下载超时，遇到上述情况时请更换图片URL、或者将图片下载到本地转码后上传
    */
    private String url;

    /**
    * 图片签名，和image、url三选一，优先级最低，支持批量删除，批量删除时请勿传image、url，最多支持100个cont_sign列表，样例：\"932301884,1068006219;316336521,553141152;2491030726,1352091083\"
    */
    @JsonProperty("cont_sign")
    private String contSign;

    public String getImage() {
        return image;
    }

    public ProductImageDeleteRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public ProductImageDeleteRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getContSign() {
        return contSign;
    }

    public ProductImageDeleteRequest setContSign(String contSign) {
        this.contSign = contSign;
        return this;
    }

}
