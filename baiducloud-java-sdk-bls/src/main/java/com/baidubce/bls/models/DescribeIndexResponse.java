package com.baidubce.bls.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeIndexResponse extends BaseBceResponse {

    /**
    * 请求是否成功
    */
    private Boolean success;

    /**
    * 请求码，成功为OK，错误为具体的错误码
    */
    private String code;

    /**
    * 是否开启全文索引，true 表示开启
    */
    private Boolean fulltext;

    /**
    * 字段索引的字段名称和类型信息
    */
    private Map<String, IndexField> fields;

    /**
    * 全文索引是否开启大小写敏感，true表示开启大小写敏感
    */
    private Boolean caseSensitive;

    /**
    * 是否包含中文，true表示包含中文
    */
    private Boolean includeChinese;

    /**
    * 全文分词符
    */
    private String separators;

    public Boolean getSuccess() {
        return success;
    }

    public DescribeIndexResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getCode() {
        return code;
    }

    public DescribeIndexResponse setCode(String code) {
        this.code = code;
        return this;
    }

    public Boolean getFulltext() {
        return fulltext;
    }

    public DescribeIndexResponse setFulltext(Boolean fulltext) {
        this.fulltext = fulltext;
        return this;
    }

    public Map<String, IndexField> getFields() {
        return fields;
    }

    public DescribeIndexResponse setFields(Map<String, IndexField> fields) {
        this.fields = fields;
        return this;
    }

    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public DescribeIndexResponse setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Boolean getIncludeChinese() {
        return includeChinese;
    }

    public DescribeIndexResponse setIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
        return this;
    }

    public String getSeparators() {
        return separators;
    }

    public DescribeIndexResponse setSeparators(String separators) {
        this.separators = separators;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeIndexResponse{" + "success=" + success + "\n" + "code=" + code + "\n" + "fulltext=" + fulltext + "\n" + "fields=" + fields + "\n" + "caseSensitive="
                + caseSensitive + "\n" + "includeChinese=" + includeChinese + "\n" + "separators=" + separators + "\n" + "}";
    }

}
