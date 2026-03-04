package com.baidubce.eip.models;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TbspModel {
  /** DDoS增强防护包名称 */
  private String name;

  /** DDoS增强防护包ID */
  private String id;

  /** DDoS增强防护包线路类型 */
  private String defenseLineType;

  /** DDoS增强防护包容量 */
  private Integer defenseCountQuota;

  /** DDoS增强防护包绑定的IP列表 */
  private List<TbspIpModel> ipList;

  /** DDoS增强防护包绑定的IP数量 */
  private Integer ipTotalCount;

  /** DDoS增强防护包是否开启自动续费，1代表开启 */
  private Integer autoRenewSwitch;

  /** DDoS增强防护包状态 */
  private String productStatus;

  /** DDoS增强防护包创建时间 */
  private String createTime;

  /** DDoS增强防护包到期时间 */
  private String expireTime;

  /** DDoS增强防护包防护能力，0代表尽力防护 */
  private Integer defenseEnable;

  /** DDoS增强防护包攻击记录列表 */
  private List<TbspAttackRecordModel> attackingRecordList;

  /** DDoS增强防护包攻击记录总数 */
  private Integer attackingRecordTotalCount;

  /** 标签 */
  private List<TagModel> tags;

  public TbspModel setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return this.name;
  }

  public TbspModel setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return this.id;
  }

  public TbspModel setDefenseLineType(String defenseLineType) {
    this.defenseLineType = defenseLineType;
    return this;
  }

  public String getDefenseLineType() {
    return this.defenseLineType;
  }

  public TbspModel setDefenseCountQuota(Integer defenseCountQuota) {
    this.defenseCountQuota = defenseCountQuota;
    return this;
  }

  public Integer getDefenseCountQuota() {
    return this.defenseCountQuota;
  }

  public TbspModel setIpList(List<TbspIpModel> ipList) {
    this.ipList = ipList;
    return this;
  }

  public List<TbspIpModel> getIpList() {
    return this.ipList;
  }

  public TbspModel setIpTotalCount(Integer ipTotalCount) {
    this.ipTotalCount = ipTotalCount;
    return this;
  }

  public Integer getIpTotalCount() {
    return this.ipTotalCount;
  }

  public TbspModel setAutoRenewSwitch(Integer autoRenewSwitch) {
    this.autoRenewSwitch = autoRenewSwitch;
    return this;
  }

  public Integer getAutoRenewSwitch() {
    return this.autoRenewSwitch;
  }

  public TbspModel setProductStatus(String productStatus) {
    this.productStatus = productStatus;
    return this;
  }

  public String getProductStatus() {
    return this.productStatus;
  }

  public TbspModel setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public TbspModel setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public String getExpireTime() {
    return this.expireTime;
  }

  public TbspModel setDefenseEnable(Integer defenseEnable) {
    this.defenseEnable = defenseEnable;
    return this;
  }

  public Integer getDefenseEnable() {
    return this.defenseEnable;
  }

  public TbspModel setAttackingRecordList(List<TbspAttackRecordModel> attackingRecordList) {
    this.attackingRecordList = attackingRecordList;
    return this;
  }

  public List<TbspAttackRecordModel> getAttackingRecordList() {
    return this.attackingRecordList;
  }

  public TbspModel setAttackingRecordTotalCount(Integer attackingRecordTotalCount) {
    this.attackingRecordTotalCount = attackingRecordTotalCount;
    return this;
  }

  public Integer getAttackingRecordTotalCount() {
    return this.attackingRecordTotalCount;
  }

  public TbspModel setTags(List<TagModel> tags) {
    this.tags = tags;
    return this;
  }

  public List<TagModel> getTags() {
    return this.tags;
  }

  @Override
  public String toString() {
    return "TbspModel{"
        + "name="
        + name
        + "\n"
        + "id="
        + id
        + "\n"
        + "defenseLineType="
        + defenseLineType
        + "\n"
        + "defenseCountQuota="
        + defenseCountQuota
        + "\n"
        + "ipList="
        + ipList
        + "\n"
        + "ipTotalCount="
        + ipTotalCount
        + "\n"
        + "autoRenewSwitch="
        + autoRenewSwitch
        + "\n"
        + "productStatus="
        + productStatus
        + "\n"
        + "createTime="
        + createTime
        + "\n"
        + "expireTime="
        + expireTime
        + "\n"
        + "defenseEnable="
        + defenseEnable
        + "\n"
        + "attackingRecordList="
        + attackingRecordList
        + "\n"
        + "attackingRecordTotalCount="
        + attackingRecordTotalCount
        + "\n"
        + "tags="
        + tags
        + "\n"
        + "}";
  }
}
