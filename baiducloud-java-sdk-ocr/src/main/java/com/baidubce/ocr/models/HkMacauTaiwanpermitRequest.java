package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HkMacauTaiwanpermitRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式 <br/><strong>优先级</strong>：image > url > pdf_file，当image字段存在时，url、pdf_file字段失效
    */
    private String image;

    /**
    * 图片完整URL，url长度不超过1024字节，url对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式 <br/><strong>优先级</strong>：image > url >
    * pdf_file，当image字段存在时，url、pdf_file字段失效，<strong>请注意关闭URL防盗链</strong>
    */
    private String url;

    /**
    * PDF文件，base64编码，要求base64编码后大小不超过4M，最短边至少15px，最长边最大4096px <br/><strong>优先级</strong>：image > url > pdf_file，当image字段存在时，url、pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * 证件类型：hk_mc_passport_front(港澳通行证正面)、hk_mc_passport_back(港澳通行证反面)、tw_passport_front(台湾通行证正面)、tw_passport_back(台湾通行证反面)、tw_return_passport_front(台胞证正面)、
    * tw_return_passport_back(台胞证反面)、hk_mc_return_passport_front(返乡证正面)、hk_mc_return_passport_back(返乡证反面)
    */
    @JsonProperty("exitentrypermit_type")
    private String exitentrypermitType;

    /**
    * 是否返回字段置信度，默认为false，即不返回
    */
    private Boolean probability;

    /**
    * 是否返回字段位置坐标，默认为false，即不返回
    */
    private Boolean location;

    public String getImage() {
        return image;
    }

    public HkMacauTaiwanpermitRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public HkMacauTaiwanpermitRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public HkMacauTaiwanpermitRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public HkMacauTaiwanpermitRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getExitentrypermitType() {
        return exitentrypermitType;
    }

    public HkMacauTaiwanpermitRequest setExitentrypermitType(String exitentrypermitType) {
        this.exitentrypermitType = exitentrypermitType;
        return this;
    }

    public Boolean getProbability() {
        return probability;
    }

    public HkMacauTaiwanpermitRequest setProbability(Boolean probability) {
        this.probability = probability;
        return this;
    }

    public Boolean getLocation() {
        return location;
    }

    public HkMacauTaiwanpermitRequest setLocation(Boolean location) {
        this.location = location;
        return this;
    }

}
