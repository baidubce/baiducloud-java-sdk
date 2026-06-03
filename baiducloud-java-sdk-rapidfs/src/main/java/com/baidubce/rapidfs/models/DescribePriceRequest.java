package com.baidubce.rapidfs.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DescribePriceRequest extends BaseBceRequest {

    /**
    * 货币单位，枚举值：* CNY：人民币，默认；* USD：美元。
    */
    private String currency;

    /**
    * RapidFS 实例部署模式，枚举值：* FullyManaged：全托管部署模式，适合无闲置存储资源、超大规模或追求高稳定性的业务。该模式下，RapidFS 产品完全管理实例，无需用户运维；* MasterManaged：Master 托管部署模式，适合有闲置存储资源、成本敏感且具备一定运维能力的业务。
    */
    private String managedMode;

    /**
    * 元数据规格，当前仅在 MasterManaged 部署模式下生效，枚举值：* M1：适用于文件数在 10 亿，Cache节点上限 50 个，单个Cache节点可挂载数据盘上限 4 个的场景；* M2：适用于文件数在 50 亿，Cache节点上限 400 个，单个Cache节点可挂载数据盘上限 8 个的场景。
    */
    private String metaSpec;

    /**
    * 数据规格，当前仅在 FullyManaged 部署模式下生效，枚举值：* Basic：数据性能基线为 100MB/s/TiB；* Capacity：数据性能基线为 200MB/s/TiB；
    */
    private String dataSpec;

    /**
    * FullyManaged 部署模式下必填，表示购买的缓存容量，单位 TiB。不超过 DescribeSpecs 接口返回的可购买的最大容量。
    */
    private Integer capacityTiB;

    public String getCurrency() {
        return currency;
    }

    public DescribePriceRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getManagedMode() {
        return managedMode;
    }

    public DescribePriceRequest setManagedMode(String managedMode) {
        this.managedMode = managedMode;
        return this;
    }

    public String getMetaSpec() {
        return metaSpec;
    }

    public DescribePriceRequest setMetaSpec(String metaSpec) {
        this.metaSpec = metaSpec;
        return this;
    }

    public String getDataSpec() {
        return dataSpec;
    }

    public DescribePriceRequest setDataSpec(String dataSpec) {
        this.dataSpec = dataSpec;
        return this;
    }

    public Integer getCapacityTiB() {
        return capacityTiB;
    }

    public DescribePriceRequest setCapacityTiB(Integer capacityTiB) {
        this.capacityTiB = capacityTiB;
        return this;
    }

}
