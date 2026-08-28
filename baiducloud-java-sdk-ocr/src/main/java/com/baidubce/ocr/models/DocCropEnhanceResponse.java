package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocCropEnhanceResponse extends BaseBceResponse {

    /**
    * 唯一的log id，用于问题定位
    */
    @JsonProperty("log_id")
    private Long logId;

    /**
    * 返回处理后的图片，base64编码，如请求参数 scan_type = 1&enhance_type =0，则返回原图
    */
    @JsonProperty("image_processed")
    private String imageProcessed;

    /**
    * 检测到的图片内主体在原图中的四角点坐标，scan_type = 2 时不返回此参数
    */
    private List<DocCropEnhancePoint> points;

    /**
    * 传入PDF文件的总页数，当 pdf_file 参数有效时返回该字段
    */
    @JsonProperty("pdf_file_size")
    private Integer pdfFileSize;

    public Long getLogId() {
        return logId;
    }

    public DocCropEnhanceResponse setLogId(Long logId) {
        this.logId = logId;
        return this;
    }

    public String getImageProcessed() {
        return imageProcessed;
    }

    public DocCropEnhanceResponse setImageProcessed(String imageProcessed) {
        this.imageProcessed = imageProcessed;
        return this;
    }

    public List<DocCropEnhancePoint> getPoints() {
        return points;
    }

    public DocCropEnhanceResponse setPoints(List<DocCropEnhancePoint> points) {
        this.points = points;
        return this;
    }

    public Integer getPdfFileSize() {
        return pdfFileSize;
    }

    public DocCropEnhanceResponse setPdfFileSize(Integer pdfFileSize) {
        this.pdfFileSize = pdfFileSize;
        return this;
    }

    @Override
    public String toString() {
        return "DocCropEnhanceResponse{" + "logId=" + logId + "\n" + "imageProcessed=" + imageProcessed + "\n" + "points=" + points + "\n" + "pdfFileSize=" + pdfFileSize + "\n"
                + "}";
    }

}
