package com.baidubce.dbsc.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMysqlActiveSessionsResponse extends BaseBceResponse {

    /**
    * 实时会话列表信息
    */
    private List<MySQLSession> items;

    /**
    * 数据库统计信息
    */
    private List<MysqlSessionDBSummary> databaseStatistics;

    /**
    * 源端Host统计信息
    */
    private List<MysqlSessionHostSummary> hostStatistics;

    /**
    * 用户统计信息
    */
    private List<MysqlSessionUserSummary> userStatistics;

    /**
    * 整体统计信息
    */
    private List<MySQLSessionSummary> summary;

    public List<MySQLSession> getItems() {
        return items;
    }

    public GetMysqlActiveSessionsResponse setItems(List<MySQLSession> items) {
        this.items = items;
        return this;
    }

    public List<MysqlSessionDBSummary> getDatabaseStatistics() {
        return databaseStatistics;
    }

    public GetMysqlActiveSessionsResponse setDatabaseStatistics(List<MysqlSessionDBSummary> databaseStatistics) {
        this.databaseStatistics = databaseStatistics;
        return this;
    }

    public List<MysqlSessionHostSummary> getHostStatistics() {
        return hostStatistics;
    }

    public GetMysqlActiveSessionsResponse setHostStatistics(List<MysqlSessionHostSummary> hostStatistics) {
        this.hostStatistics = hostStatistics;
        return this;
    }

    public List<MysqlSessionUserSummary> getUserStatistics() {
        return userStatistics;
    }

    public GetMysqlActiveSessionsResponse setUserStatistics(List<MysqlSessionUserSummary> userStatistics) {
        this.userStatistics = userStatistics;
        return this;
    }

    public List<MySQLSessionSummary> getSummary() {
        return summary;
    }

    public GetMysqlActiveSessionsResponse setSummary(List<MySQLSessionSummary> summary) {
        this.summary = summary;
        return this;
    }

    @Override
    public String toString() {
        return "GetMysqlActiveSessionsResponse{" + "items=" + items + "\n" + "databaseStatistics=" + databaseStatistics + "\n" + "hostStatistics=" + hostStatistics + "\n"
                + "userStatistics=" + userStatistics + "\n" + "summary=" + summary + "\n" + "}";
    }

}
