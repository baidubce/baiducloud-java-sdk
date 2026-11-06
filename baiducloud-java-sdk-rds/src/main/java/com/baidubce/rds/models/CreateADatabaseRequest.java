package com.baidubce.rds.models;

import com.baidubce.common.BaseBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateADatabaseRequest extends BaseBceRequest {

    /**
    * instanceId
    */
    @JsonIgnore
    private String instanceId;

    /**
    * pg支持字符集（UTF8，LATIN1，SQL\_ASCII），sqlserver支持字符集：（Chinese\_PRC\_CI\_AS、Chinese\_PRC\_CS\_AS、SQL\_Latin1\_General\_CP1\_CI\_AS、SQL\_Latin1\_General\_CP1\_CS\_AS、
    * Chinese\_PRC\_BIN）
    */
    private String characterSetName;

    /**
    * 数据库名称，由中文、韩文、字母、小数点、下划线组成，中文、韩文或字母开头，中文、韩文、字母、数字结尾，支持2-64个字符.
    */
    private String dbName;

    /**
    * 备注
    */
    private String remark;

    /**
    * 账户权限由 [AccountPrivilege](#AccountPrivilege) 对象组成
    */
    private List<AccountPrivilege> accountPrivileges;

    /**
    * 字符分类：  **PostgreSQL数据库必填参数，其他数据库非必填此参数**  characterSetName参数为：utf-8,此参数为:zh\_CN.utf-8  characterSetNam参数为：LATIN1，此参数为:en\_US  characterSetNam参数为：SQL\_ASCII，此参数为:C
    */
    private String ctype;

    /**
    * 字符分类：  **PostgreSQL数据库必填参数，其他数据库非必填此参数**  characterSetName参数为：utf-8,此参数为:zh\_CN.utf-8  characterSetNam参数为：LATIN1，此参数为:en\_US  characterSetNam参数为：SQL\_ASCII，此参数为:C
    */
    private String collate;

    /**
    * 授权账号
    */
    private String owner;

    public String getInstanceId() {
        return instanceId;
    }

    public CreateADatabaseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public String getCharacterSetName() {
        return characterSetName;
    }

    public CreateADatabaseRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    public String getDbName() {
        return dbName;
    }

    public CreateADatabaseRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public CreateADatabaseRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public List<AccountPrivilege> getAccountPrivileges() {
        return accountPrivileges;
    }

    public CreateADatabaseRequest setAccountPrivileges(List<AccountPrivilege> accountPrivileges) {
        this.accountPrivileges = accountPrivileges;
        return this;
    }

    public String getCtype() {
        return ctype;
    }

    public CreateADatabaseRequest setCtype(String ctype) {
        this.ctype = ctype;
        return this;
    }

    public String getCollate() {
        return collate;
    }

    public CreateADatabaseRequest setCollate(String collate) {
        this.collate = collate;
        return this;
    }

    public String getOwner() {
        return owner;
    }

    public CreateADatabaseRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }

}
