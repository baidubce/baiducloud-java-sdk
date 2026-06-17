package com.baidubce.bls.models;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Execution {
    /**
     * 执行时间，UTC时间
     */
    private String time;

    /**
     * 执行状态，取值：OK: 恢复正常, ALERT: 报警中
     */
    private String state;

    /**
     * 通知状态，取值：NOT_SENT: 未通知, SENT: 已通知，FAIL: 通知发送失败
     */
    private String noticeState;

    /**
     * 若发送失败，填写失败原因
     */
    private String reason;

    /**
     * 触发报警时的查询结果数据
     */
    private Map<String, Object> values;

    /**
     * 报警通知模板，参考：[BCM通知模板接口](https://cloud.baidu.com/doc/BCM/s/elmiysvfo)
     */
    private List<Notice> notices;

    /**
     * 报警通知中原始日志
     */
    private List<RawLog> rawLogs;

    public Execution setTime(String time) {
        this.time = time;
        return this;
    }

    public String getTime() {
        return this.time;
    }

    public Execution setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public Execution setNoticeState(String noticeState) {
        this.noticeState = noticeState;
        return this;
    }

    public String getNoticeState() {
        return this.noticeState;
    }

    public Execution setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public Execution setValues(Map<String, Object> values) {
        this.values = values;
        return this;
    }

    public Map<String, Object> getValues() {
        return this.values;
    }

    public Execution setNotices(List<Notice> notices) {
        this.notices = notices;
        return this;
    }

    public List<Notice> getNotices() {
        return this.notices;
    }

    public Execution setRawLogs(List<RawLog> rawLogs) {
        this.rawLogs = rawLogs;
        return this;
    }

    public List<RawLog> getRawLogs() {
        return this.rawLogs;
    }

    @Override
    public String toString() {
        return "Execution{" + "time=" + time + "\n" + "state=" + state + "\n" + "noticeState=" + noticeState + "\n" + "reason=" + reason + "\n" + "values=" + values + "\n"
                + "notices=" + notices + "\n" + "rawLogs=" + rawLogs + "\n" + "}";
    }

}