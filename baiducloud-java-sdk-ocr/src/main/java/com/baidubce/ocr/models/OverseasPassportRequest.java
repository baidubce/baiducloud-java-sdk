package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OverseasPassportRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，需去掉编码头（data:image/jpeg;base64, ）要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/jpeg/png/bmp格式 <br/><strong>优先级 </strong>：image > url >
    * pdf_file，当image字段存在时，url、pdf_file字段失效
    */
    private String image;

    /**
    * 图片完整URL，URL长度不超过1024字节，URL对应的图片base64编码后大小不超过4M，最短边至少15px，最长边最大4096px, 支持jpg/jpeg/png/bmp格式，当image字段存在时url字段失效 <br/><strong>优先级</strong>：image > url >
    * pdf_file，当image字段存在时，url字段失效。 <strong>请注意关闭URL防盗链 </strong>
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过4M，最短边至少15px，最长边最大4096px <br/><strong>优先级</strong>：image > url > pdf_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * PDF文件页码
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    public String getImage() {
        return image;
    }

    public OverseasPassportRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public OverseasPassportRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public OverseasPassportRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public OverseasPassportRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

}
