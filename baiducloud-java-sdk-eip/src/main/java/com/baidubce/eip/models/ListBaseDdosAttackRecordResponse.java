package com.baidubce.eip.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBaseDdosAttackRecordResponse extends BaseBceResponse {

    /**
    * 基础防护攻击记录列表
    */
    private List<DdosAttackRecordModel> attackRecordList;

    public List<DdosAttackRecordModel> getAttackRecordList() {
        return attackRecordList;
    }

    public ListBaseDdosAttackRecordResponse setAttackRecordList(List<DdosAttackRecordModel> attackRecordList) {
        this.attackRecordList = attackRecordList;
        return this;
    }

    @Override
    public String toString() {
        return "ListBaseDdosAttackRecordResponse{" + "attackRecordList=" + attackRecordList + "\n" + "}";
    }

}
