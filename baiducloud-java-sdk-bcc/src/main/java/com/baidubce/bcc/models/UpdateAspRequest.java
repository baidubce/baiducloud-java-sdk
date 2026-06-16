package com.baidubce.bcc.models;

import com.baidubce.common.BaseBceRequest;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateAspRequest extends BaseBceRequest {

    /**
    * 自动快照策略ID
    */
    private String aspId;

    /**
    * 自动快照策略名称，支持大小写字母、数字、中文以及-_ /.特殊字符，必须以字母开头，长度1-65
    */
    private String name;

    /**
    * 一天中做快照时间点，取值为0~23
    */
    private List<String> timePoints;

    /**
    * 一周中做快照的时间，取值为0~6
    */
    private List<String> repeatWeekdays;

    /**
    * 自动快照保留天数，取-1则永久保留
    */
    private String retentionDays;

    public String getAspId() {
        return aspId;
    }

    public UpdateAspRequest setAspId(String aspId) {
        this.aspId = aspId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateAspRequest setName(String name) {
        this.name = name;
        return this;
    }

    public List<String> getTimePoints() {
        return timePoints;
    }

    public UpdateAspRequest setTimePoints(List<String> timePoints) {
        this.timePoints = timePoints;
        return this;
    }

    public List<String> getRepeatWeekdays() {
        return repeatWeekdays;
    }

    public UpdateAspRequest setRepeatWeekdays(List<String> repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }

    public String getRetentionDays() {
        return retentionDays;
    }

    public UpdateAspRequest setRetentionDays(String retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }

}
