package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VatInvoiceRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url > pdf_file >
    * ofd_file，当image字段存在时，url、pdf_file、ofd_file 字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大4096px，支持jpg/jpeg/png/bmp格式。<br/>优先级：image > url > pdf_file > ofd_file，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px。<br/>优先级：image > url > pdf_file > ofd_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * OFD文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大4096px。<br/>优先级：image > url > pdf_file > ofd_file，当image、url、pdf_file字段存在时，ofd_file字段失效
    */
    @JsonProperty("ofd_file")
    private String ofdFile;

    /**
    * 需要识别的OFD文件的对应页码，当 ofd_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("ofd_file_num")
    private Integer ofdFileNum;

    /**
    * 进行识别的增值税发票类型，默认为 normal，可缺省。normal：可识别增值税普票、专票、电子发票；roll：可识别增值税卷票
    */
    private String type;

    /**
    * 是否开启印章判断功能，并返回印章内容的识别结果。true：开启；false：不开启
    */
    @JsonProperty("seal_tag")
    private Boolean sealTag;

    public String getImage() {
        return image;
    }

    public VatInvoiceRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public VatInvoiceRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public VatInvoiceRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public VatInvoiceRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public VatInvoiceRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public VatInvoiceRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public String getType() {
        return type;
    }

    public VatInvoiceRequest setType(String type) {
        this.type = type;
        return this;
    }

    public Boolean getSealTag() {
        return sealTag;
    }

    public VatInvoiceRequest setSealTag(Boolean sealTag) {
        this.sealTag = sealTag;
        return this;
    }

}
