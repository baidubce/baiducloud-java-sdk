package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveHandwritingRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url > pdf_file，当image字段存在时，url、pdf_file字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url > pdf_file，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px。<br/>优先级：image > url > pdf_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * 是否去除文件边缘后再识别，默认为 true。<br/>true：去除，适用于有背景/边缘的拍摄件；false：不去除，适用于不含背景/边缘的扫描件
    */
    @JsonProperty("enable_detect")
    private Boolean enableDetect;

    public String getImage() {
        return image;
    }

    public RemoveHandwritingRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public RemoveHandwritingRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public RemoveHandwritingRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public RemoveHandwritingRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public Boolean getEnableDetect() {
        return enableDetect;
    }

    public RemoveHandwritingRequest setEnableDetect(Boolean enableDetect) {
        this.enableDetect = enableDetect;
        return this;
    }

}
