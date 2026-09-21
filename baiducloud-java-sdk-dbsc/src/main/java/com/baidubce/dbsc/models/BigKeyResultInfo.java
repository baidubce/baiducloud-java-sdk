package com.baidubce.dbsc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BigKeyResultInfo {
    /**
     * 数据库编号
     */
    private Integer db;

    /**
     * 元素数量
     */
    private Integer elementCount;

    /**
     * 编码方式
     */
    private String encoding;

    /**
     * 过期时间
     */
    private String expireTime;

    /**
     * 键
     */
    private String key;

    /**
     * 占有内存
     */
    private Integer size;

    /**
     * 数据类型
     */
    private String type;

    public BigKeyResultInfo setDb(Integer db) {
        this.db = db;
        return this;
    }

    public Integer getDb() {
        return this.db;
    }

    public BigKeyResultInfo setElementCount(Integer elementCount) {
        this.elementCount = elementCount;
        return this;
    }

    public Integer getElementCount() {
        return this.elementCount;
    }

    public BigKeyResultInfo setEncoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public BigKeyResultInfo setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getExpireTime() {
        return this.expireTime;
    }

    public BigKeyResultInfo setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public BigKeyResultInfo setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getSize() {
        return this.size;
    }

    public BigKeyResultInfo setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "BigKeyResultInfo{" + "db=" + db + "\n" + "elementCount=" + elementCount + "\n" + "encoding=" + encoding + "\n" + "expireTime=" + expireTime + "\n" + "key=" + key
                + "\n" + "size=" + size + "\n" + "type=" + type + "\n" + "}";
    }

}