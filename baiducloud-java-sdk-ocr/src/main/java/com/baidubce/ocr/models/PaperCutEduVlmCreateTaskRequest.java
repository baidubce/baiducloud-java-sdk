package com.baidubce.ocr.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaperCutEduVlmCreateTaskRequest extends BaseBceRequest {

    /**
    * 图像数据，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式 <br/>优先级：image > url > pdf_file，当image字段存在时，url、pdf_file字段失效
    */
    private String image;

    /**
    * 图片完整url，url长度不超过1024字节，url对应的图片base64编码后大小不超过10M，最短边至少15px，最长边最大8192px，支持jpg/jpeg/png/bmp格式 <br/>优先级：image > url > pdf_file，当image字段存在时，url字段失效请注意关闭URL防盗链
    */
    private String url;

    /**
    * PDF文件，base64编码后进行urlencode，要求base64编码和urlencode后大小不超过10M，最短边至少15px，最长边最大8192px <br/>优先级：image > url > pdf_file，当image、url字段存在时，pdf_file字段失效
    */
    @JsonProperty("pdf_file")
    private String pdfFile;

    /**
    * 需要识别的PDF文件的对应页码，当pdf_file参数有效时，识别传入页码的对应页面内容，若不传入，则默认识别第 1 页
    */
    @JsonProperty("pdf_file_num")
    private Integer pdfFileNum;

    /**
    * 是否仅进行题目切分，默认false。<br/>- true：同步返回单题位置信息及题内手写答案位置；<br/>- false：异步返回单题位置信息及题内结构化文本信息
    */
    @JsonProperty("only_split")
    private Boolean onlySplit;

    /**
    * 指定传入文件的场景类型，paper：试卷题目识别场景；answer_sheet：答题卡识别场景
    */
    @JsonProperty("scene_type")
    private String sceneType;

    /**
    * 是否开启矫正增强，默认关闭
    */
    private Boolean enhance;

    public String getImage() {
        return image;
    }

    public PaperCutEduVlmCreateTaskRequest setImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PaperCutEduVlmCreateTaskRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public PaperCutEduVlmCreateTaskRequest setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile;
        return this;
    }

    public Integer getPdfFileNum() {
        return pdfFileNum;
    }

    public PaperCutEduVlmCreateTaskRequest setPdfFileNum(Integer pdfFileNum) {
        this.pdfFileNum = pdfFileNum;
        return this;
    }

    public Boolean getOnlySplit() {
        return onlySplit;
    }

    public PaperCutEduVlmCreateTaskRequest setOnlySplit(Boolean onlySplit) {
        this.onlySplit = onlySplit;
        return this;
    }

    public String getSceneType() {
        return sceneType;
    }

    public PaperCutEduVlmCreateTaskRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }

    public Boolean getEnhance() {
        return enhance;
    }

    public PaperCutEduVlmCreateTaskRequest setEnhance(Boolean enhance) {
        this.enhance = enhance;
        return this;
    }

}
