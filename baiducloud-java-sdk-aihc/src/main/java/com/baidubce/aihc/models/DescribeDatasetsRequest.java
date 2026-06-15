package com.baidubce.aihc.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeDatasetsRequest extends BaseBceRequest {

    /**
    * keyword
    */
    @JsonIgnore
    private String keyword;

    /**
    * storageType
    */
    @JsonIgnore
    private String storageType;

    /**
    * storageInstances
    */
    @JsonIgnore
    private String storageInstances;

    /**
    * importFormat
    */
    @JsonIgnore
    private String importFormat;

    /**
    * pageNumber
    */
    @JsonIgnore
    private Integer pageNumber;

    /**
    * pageSize
    */
    @JsonIgnore
    private Integer pageSize;

    public String getKeyword() {
        return keyword;
    }

    public DescribeDatasetsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public String getStorageType() {
        return storageType;
    }

    public DescribeDatasetsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    public String getStorageInstances() {
        return storageInstances;
    }

    public DescribeDatasetsRequest setStorageInstances(String storageInstances) {
        this.storageInstances = storageInstances;
        return this;
    }

    public String getImportFormat() {
        return importFormat;
    }

    public DescribeDatasetsRequest setImportFormat(String importFormat) {
        this.importFormat = importFormat;
        return this;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public DescribeDatasetsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public DescribeDatasetsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

}
