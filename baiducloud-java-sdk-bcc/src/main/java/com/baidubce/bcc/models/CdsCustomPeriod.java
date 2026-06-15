package com.baidubce.bcc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CdsCustomPeriod {
    /**
     * 续费时长，单位为月，范围为【1，60】。需保证续费后磁盘的到期时间等于或晚于BCC到期时间，否则续费失败。（实例续费）
     */
    private Integer period;

    /**
     * 磁盘ID（磁盘详情、磁盘列表接口返回、实例续费）
     */
    private String volumeId;

    public CdsCustomPeriod setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public CdsCustomPeriod setVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    public String getVolumeId() {
        return this.volumeId;
    }

    @Override
    public String toString() {
        return "CdsCustomPeriod{" + "period=" + period + "\n" + "volumeId=" + volumeId + "\n" + "}";
    }

}