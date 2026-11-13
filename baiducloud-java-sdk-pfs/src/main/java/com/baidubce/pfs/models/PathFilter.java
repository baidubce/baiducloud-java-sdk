package com.baidubce.pfs.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PathFilter {
    /**
     * 过滤类型。0 后缀匹配（SUFFIX）；1 路径匹配（PATH_PATTERN）
     */
    private Integer type;

    /**
     * 匹配规则，最长1000字节。
     */
    private String pattern;

    public PathFilter setType(Integer type) {
        this.type = type;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public PathFilter setPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override
    public String toString() {
        return "PathFilter{" + "type=" + type + "\n" + "pattern=" + pattern + "\n" + "}";
    }

}