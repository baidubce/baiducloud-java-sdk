package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocCropEnhanceRequest extends BaseBceRequest {

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
    * 选择是否对图片内主体内容进行四角点增强或矫正，可选值如下：<br/>scan_type=1：只做检测，不对主体进行矫正，返回主体四角点坐标，可用作前端页面展示；<br/>scan_type=2：只做矫正，需传入主体四角点坐标，使用传入的坐标值对主体进行扣取及矫正；<br/>scan_type=3：默认值，检测并矫正，
    * 返回主体在原图中的四角点坐标以及矫正后的图像
    */
    @JsonProperty("scan_type")
    private Integer scanType;

    /**
    * 如 scan_type = 2，则需传入此参数，左上角起顺时针汇总四角点坐标为[{x1,y1},{x2,y2},{x3,y3},{x4,y4}]
    */
    private String points;

    /**
    * 选择是否开启图像增强功能，如开启可选择增强效果，可选值如下：<br/>enhance_type=0：默认值，不开启增强功能；<br/>enhance_type=1：去阴影；<br/>enhance_type=2：增强并锐化；<br/>enhance_type=3：黑白滤镜
    */
    @JsonProperty("enhance_type")
    private Integer enhanceType;

    public String getImage() {
        return image;
    }

    public DocCropEnhanceRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public DocCropEnhanceRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public DocCropEnhanceRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public DocCropEnhanceRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public Integer getScanType() {
        return scanType;
    }

    public DocCropEnhanceRequest setScanType(Integer scanType) {
        this.scanType = scanType;
        return this;
    }

    public String getPoints() {
        return points;
    }

    public DocCropEnhanceRequest setPoints(String points) {
        this.points = points;
        return this;
    }

    public Integer getEnhanceType() {
        return enhanceType;
    }

    public DocCropEnhanceRequest setEnhanceType(Integer enhanceType) {
        this.enhanceType = enhanceType;
        return this;
    }

}
