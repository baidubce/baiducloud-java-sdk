package com.baidubce.bls.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateIndexRequest extends BaseBceRequest {

    /**
    * logStoreName
    */
    @JsonIgnore
    private String logStoreName;

    /**
    * project
    */
    @JsonIgnore
    private String project;

    /**
    * 是否开启全文索引，true 表示开启
    */
    private Boolean fulltext;

    /**
    * 全文索引是否开启大小写敏感，默认false，不开启大小写敏感
    */
    private Boolean caseSensitive;

    /**
    * 是否包含中文，默认为false，不包含中文
    */
    private Boolean includeChinese;

    /**
    * 全文分词符，不填使用默认分词符
    */
    private String separators;

    /**
    * 字段索引包含的字段名称及类型定义
    */
    private Map<String, IndexField> fields;

    public String getLogStoreName() {
        return logStoreName;
    }

    public CreateIndexRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }

    public String getProject() {
        return project;
    }

    public CreateIndexRequest setProject(String project) {
        this.project = project;
        return this;
    }

    public Boolean getFulltext() {
        return fulltext;
    }

    public CreateIndexRequest setFulltext(Boolean fulltext) {
        this.fulltext = fulltext;
        return this;
    }

    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public CreateIndexRequest setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    public Boolean getIncludeChinese() {
        return includeChinese;
    }

    public CreateIndexRequest setIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
        return this;
    }

    public String getSeparators() {
        return separators;
    }

    public CreateIndexRequest setSeparators(String separators) {
        this.separators = separators;
        return this;
    }

    public Map<String, IndexField> getFields() {
        return fields;
    }

    public CreateIndexRequest setFields(Map<String, IndexField> fields) {
        this.fields = fields;
        return this;
    }

}
