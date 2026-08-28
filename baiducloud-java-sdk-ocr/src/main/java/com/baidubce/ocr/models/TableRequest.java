package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file，当image字段存在时，url、pdf_file、ofd_file字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过8M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式。优先级：image > url > pdf_file > ofd_file，当image字段存在时，url字段失效。请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px。优先级：image > url > pdf_file > ofd_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当 pdf_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第1页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * OFD文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过8M，最短边至少15px，最长边最大8192px。优先级：image > url > pdf_file > ofd_file，当image、url、pdf_file字段存在时，ofd_file字段失效
    */
    @JsonProperty("ofd_file")
    private String ofdFile;

    /**
    * 需要识别的OFD文件的对应页码，当 ofd_file 参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第1页
    */
    @JsonProperty("ofd_file_num")
    private Integer ofdFileNum;

    /**
    * 是否输出excel文件，默认不输出，即：false。- true：输出excel，base64编码后输出；- false：不输出excel
    */
    @JsonProperty("return_excel")
    private Boolean returnExcel;

    /**
    * 是否输出单元格文字位置信息。- false：默认值，仅输出单元格行列信息及四角点坐标，不输出单元格内文字位置信息；- true：输出单元格内文字的外接四边形四角点坐标，若文字折行，则分行分别输出
    */
    @JsonProperty("cell_contents")
    private Boolean cellContents;

    public String getImage() {
        return image;
    }

    public TableRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public TableRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public TableRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public TableRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public String getOfdFile() {
        return ofdFile;
    }

    public TableRequest setOfdFile(String ofdFile) {
        this.ofdFile = ofdFile;
        return this;
    }

    public Integer getOfdFileNum() {
        return ofdFileNum;
    }

    public TableRequest setOfdFileNum(Integer ofdFileNum) {
        this.ofdFileNum = ofdFileNum;
        return this;
    }

    public Boolean getReturnExcel() {
        return returnExcel;
    }

    public TableRequest setReturnExcel(Boolean returnExcel) {
        this.returnExcel = returnExcel;
        return this;
    }

    public Boolean getCellContents() {
        return cellContents;
    }

    public TableRequest setCellContents(Boolean cellContents) {
        this.cellContents = cellContents;
        return this;
    }

}
