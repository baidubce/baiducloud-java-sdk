package com.baidubce.scs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClearInstanceRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * 实例密码，如果没有设置密码，传递空字符串，密码需要加密传输，禁止明文传输，
    * 详情请参考[密码加密传输规范定义](https://cloud.baidu.com/doc/SCS/s/fjwvxtrd9#%E5%AF%86%E7%A0%81%E5%8A%A0%E5%AF%86%E4%BC%A0%E8%BE%93%E8%A7%84%E8%8C%83%E5%AE%9A%E4%B9%89)
    */
    private String password;

    /**
    * 数据库索引，取值为：[0,255]
    */
    private Integer dbIndex;

    /**
    * true=只清理过期数据, false=清理所有数据
    */
    private Boolean isFlushExpired;

    /**
    * 维护时间窗口执行, 仅isFlushExpired=true时可用。<li>true：维护时间执行，false：立即执行。
    */
    private Boolean isDefer;

    public String getInstanceId() {
        return instanceId;
    }

    public ClearInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ClearInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getDbIndex() {
        return dbIndex;
    }

    public ClearInstanceRequest setDbIndex(Integer dbIndex) {
        this.dbIndex = dbIndex;
        return this;
    }

    public Boolean getIsFlushExpired() {
        return isFlushExpired;
    }

    public ClearInstanceRequest setIsFlushExpired(Boolean isFlushExpired) {
        this.isFlushExpired = isFlushExpired;
        return this;
    }

    public Boolean getIsDefer() {
        return isDefer;
    }

    public ClearInstanceRequest setIsDefer(Boolean isDefer) {
        this.isDefer = isDefer;
        return this;
    }

}
