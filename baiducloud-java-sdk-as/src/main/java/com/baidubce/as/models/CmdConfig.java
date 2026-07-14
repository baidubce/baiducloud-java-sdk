package com.baidubce.as.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CmdConfig {
    /**
     * 是否配置缩容脚本
     */
    private Boolean hasDecreaseCmd;

    /**
     * 缩容策略，不可为空，失败暂停缩容、失败继续缩容：Proceed、Pause
     */
    private String decCmdStrategy;

    /**
     * 缩容脚本
     */
    private String decCmdData;

    /**
     * 缩容脚本超时时间
     */
    private Integer decCmdTimeout;

    /**
     * 手动移出是否执行缩容脚本
     */
    private Boolean decCmdManual;

    /**
     * 是否配置扩容脚本
     */
    private Boolean hasIncreaseCmd;

    /**
     * 缩容策略，不可为空，失败暂停缩容、失败继续缩容：Proceed、Pause
     */
    private String incCmdStrategy;

    /**
     * 扩容脚本
     */
    private String incCmdData;

    /**
     * 扩容脚本超时时间
     */
    private Integer incCmdTimeout;

    /**
     * 手动移入是否执行扩容脚本
     */
    private Boolean incCmdManual;

    public CmdConfig setHasDecreaseCmd(Boolean hasDecreaseCmd) {
        this.hasDecreaseCmd = hasDecreaseCmd;
        return this;
    }

    public Boolean getHasDecreaseCmd() {
        return this.hasDecreaseCmd;
    }

    public CmdConfig setDecCmdStrategy(String decCmdStrategy) {
        this.decCmdStrategy = decCmdStrategy;
        return this;
    }

    public String getDecCmdStrategy() {
        return this.decCmdStrategy;
    }

    public CmdConfig setDecCmdData(String decCmdData) {
        this.decCmdData = decCmdData;
        return this;
    }

    public String getDecCmdData() {
        return this.decCmdData;
    }

    public CmdConfig setDecCmdTimeout(Integer decCmdTimeout) {
        this.decCmdTimeout = decCmdTimeout;
        return this;
    }

    public Integer getDecCmdTimeout() {
        return this.decCmdTimeout;
    }

    public CmdConfig setDecCmdManual(Boolean decCmdManual) {
        this.decCmdManual = decCmdManual;
        return this;
    }

    public Boolean getDecCmdManual() {
        return this.decCmdManual;
    }

    public CmdConfig setHasIncreaseCmd(Boolean hasIncreaseCmd) {
        this.hasIncreaseCmd = hasIncreaseCmd;
        return this;
    }

    public Boolean getHasIncreaseCmd() {
        return this.hasIncreaseCmd;
    }

    public CmdConfig setIncCmdStrategy(String incCmdStrategy) {
        this.incCmdStrategy = incCmdStrategy;
        return this;
    }

    public String getIncCmdStrategy() {
        return this.incCmdStrategy;
    }

    public CmdConfig setIncCmdData(String incCmdData) {
        this.incCmdData = incCmdData;
        return this;
    }

    public String getIncCmdData() {
        return this.incCmdData;
    }

    public CmdConfig setIncCmdTimeout(Integer incCmdTimeout) {
        this.incCmdTimeout = incCmdTimeout;
        return this;
    }

    public Integer getIncCmdTimeout() {
        return this.incCmdTimeout;
    }

    public CmdConfig setIncCmdManual(Boolean incCmdManual) {
        this.incCmdManual = incCmdManual;
        return this;
    }

    public Boolean getIncCmdManual() {
        return this.incCmdManual;
    }

    @Override
    public String toString() {
        return "CmdConfig{" + "hasDecreaseCmd=" + hasDecreaseCmd + "\n" + "decCmdStrategy=" + decCmdStrategy + "\n" + "decCmdData=" + decCmdData + "\n" + "decCmdTimeout="
                + decCmdTimeout + "\n" + "decCmdManual=" + decCmdManual + "\n" + "hasIncreaseCmd=" + hasIncreaseCmd + "\n" + "incCmdStrategy=" + incCmdStrategy + "\n"
                + "incCmdData=" + incCmdData + "\n" + "incCmdTimeout=" + incCmdTimeout + "\n" + "incCmdManual=" + incCmdManual + "\n" + "}";
    }

}