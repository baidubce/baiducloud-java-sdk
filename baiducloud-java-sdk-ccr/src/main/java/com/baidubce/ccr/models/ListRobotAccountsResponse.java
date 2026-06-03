package com.baidubce.ccr.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListRobotAccountsResponse extends BaseBceResponse {

    /**
    * 当前页
    */
    private Integer pageNo;

    /**
    * 每页记录数
    */
    private Integer pageSize;

    /**
    * 实例机器人账号总数
    */
    private Integer total;

    /**
    * 机器人账号列表
    */
    private List<Robot> robots;

    public Integer getPageNo() {
        return pageNo;
    }

    public ListRobotAccountsResponse setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public ListRobotAccountsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public ListRobotAccountsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public ListRobotAccountsResponse setRobots(List<Robot> robots) {
        this.robots = robots;
        return this;
    }

    @Override
    public String toString() {
        return "ListRobotAccountsResponse{" + "pageNo=" + pageNo + "\n" + "pageSize=" + pageSize + "\n" + "total=" + total + "\n" + "robots=" + robots + "\n" + "}";
    }

}
