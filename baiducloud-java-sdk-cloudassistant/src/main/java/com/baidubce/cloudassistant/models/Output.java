package com.baidubce.cloudassistant.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Output {
    /**
     * 退出码
     */
    private Integer exitCode;

    /**
     * 标准错误
     */
    private String stderr;

    /**
     * 标准输出
     */
    private String stdout;

    /**
     * 标准输出或标准错误是否由于过长（超过4KB）而被截断
     */
    private Boolean isTruncated;

    public Output setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
        return this;
    }

    public Integer getExitCode() {
        return this.exitCode;
    }

    public Output setStderr(String stderr) {
        this.stderr = stderr;
        return this;
    }

    public String getStderr() {
        return this.stderr;
    }

    public Output setStdout(String stdout) {
        this.stdout = stdout;
        return this;
    }

    public String getStdout() {
        return this.stdout;
    }

    public Output setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    @Override
    public String toString() {
        return "Output{" + "exitCode=" + exitCode + "\n" + "stderr=" + stderr + "\n" + "stdout=" + stdout + "\n" + "isTruncated=" + isTruncated + "\n" + "}";
    }

}