package com.baidubce.blb.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribeLbdcResponse extends BaseBceResponse {

    /**
    * 集群id
    */
    private String id;

    /**
    * 集群名称
    */
    private String name;

    /**
    * 集群类型
    */
    private String type;

    /**
    * 集群状态
    */
    private String status;

    /**
    * 集群性能容量
    */
    private Integer ccuCount;

    /**
    * 集群创建时间
    */
    private String createTime;

    /**
    * 集群失效时间
    */
    private String expireTime;

    /**
    * 并发连接数
    */
    private Long totalConnectCount;

    /**
    * 新建连接速度，四层集群专有
    */
    private Long newConnectCps;

    /**
    * 网络输入带宽
    */
    private Long networkInBps;

    /**
    * 网络输出带宽
    */
    private Long networkOutBps;

    /**
    * https的qps
    */
    private Long httpsQps;

    /**
    * http的qps
    */
    private Long httpQps;

    /**
    * http新建速度
    */
    private Long httpNewConnectCps;

    /**
    * https新建速度
    */
    private Long httpsNewConnectCps;

    /**
    * ssl新建速度
    */
    private Long sslNewConnectCps;

    /**
    * 标签
    */
    private List<TagModel> tags;

    public String getId() {
        return id;
    }

    public DescribeLbdcResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DescribeLbdcResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public DescribeLbdcResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public DescribeLbdcResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getCcuCount() {
        return ccuCount;
    }

    public DescribeLbdcResponse setCcuCount(Integer ccuCount) {
        this.ccuCount = ccuCount;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public DescribeLbdcResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public DescribeLbdcResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public Long getTotalConnectCount() {
        return totalConnectCount;
    }

    public DescribeLbdcResponse setTotalConnectCount(Long totalConnectCount) {
        this.totalConnectCount = totalConnectCount;
        return this;
    }

    public Long getNewConnectCps() {
        return newConnectCps;
    }

    public DescribeLbdcResponse setNewConnectCps(Long newConnectCps) {
        this.newConnectCps = newConnectCps;
        return this;
    }

    public Long getNetworkInBps() {
        return networkInBps;
    }

    public DescribeLbdcResponse setNetworkInBps(Long networkInBps) {
        this.networkInBps = networkInBps;
        return this;
    }

    public Long getNetworkOutBps() {
        return networkOutBps;
    }

    public DescribeLbdcResponse setNetworkOutBps(Long networkOutBps) {
        this.networkOutBps = networkOutBps;
        return this;
    }

    public Long getHttpsQps() {
        return httpsQps;
    }

    public DescribeLbdcResponse setHttpsQps(Long httpsQps) {
        this.httpsQps = httpsQps;
        return this;
    }

    public Long getHttpQps() {
        return httpQps;
    }

    public DescribeLbdcResponse setHttpQps(Long httpQps) {
        this.httpQps = httpQps;
        return this;
    }

    public Long getHttpNewConnectCps() {
        return httpNewConnectCps;
    }

    public DescribeLbdcResponse setHttpNewConnectCps(Long httpNewConnectCps) {
        this.httpNewConnectCps = httpNewConnectCps;
        return this;
    }

    public Long getHttpsNewConnectCps() {
        return httpsNewConnectCps;
    }

    public DescribeLbdcResponse setHttpsNewConnectCps(Long httpsNewConnectCps) {
        this.httpsNewConnectCps = httpsNewConnectCps;
        return this;
    }

    public Long getSslNewConnectCps() {
        return sslNewConnectCps;
    }

    public DescribeLbdcResponse setSslNewConnectCps(Long sslNewConnectCps) {
        this.sslNewConnectCps = sslNewConnectCps;
        return this;
    }

    public List<TagModel> getTags() {
        return tags;
    }

    public DescribeLbdcResponse setTags(List<TagModel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return "DescribeLbdcResponse{" + "id=" + id + "\n" + "name=" + name + "\n" + "type=" + type + "\n" + "status=" + status + "\n" + "ccuCount=" + ccuCount + "\n"
                + "createTime=" + createTime + "\n" + "expireTime=" + expireTime + "\n" + "totalConnectCount=" + totalConnectCount + "\n" + "newConnectCps=" + newConnectCps + "\n"
                + "networkInBps=" + networkInBps + "\n" + "networkOutBps=" + networkOutBps + "\n" + "httpsQps=" + httpsQps + "\n" + "httpQps=" + httpQps + "\n"
                + "httpNewConnectCps=" + httpNewConnectCps + "\n" + "httpsNewConnectCps=" + httpsNewConnectCps + "\n" + "sslNewConnectCps=" + sslNewConnectCps + "\n" + "tags="
                + tags + "\n" + "}";
    }

}
