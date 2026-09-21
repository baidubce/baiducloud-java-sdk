package com.baidubce.cce.models;

import com.baidubce.common.BaseBceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetReportByTaskIDResponse extends BaseBceResponse {

    /**
    * 巡检任务 ID
    */
    private String taskId;

    /**
    * 巡检项数量
    */
    private Integer inspectionItemsCount;

    /**
    * 巡检项详细信息列表，外层 key 为巡检项类别，内层 key 为巡检项英文名
    */
    private Map<String, Map<String, InspectionItemInfo>> reportItems;

    /**
    * 巡检开始时间
    */
    private String inspectStartTime;

    /**
    * 报告发送状态，receiveMethod 为接收方式列表，元素类型为 [ReceiveAddr](CCE/API_V2参考/附录.md#ReceiveAddr)
    */
    private Object reportDeliveryStatus;

    public String getTaskId() {
        return taskId;
    }

    public GetReportByTaskIDResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    public Integer getInspectionItemsCount() {
        return inspectionItemsCount;
    }

    public GetReportByTaskIDResponse setInspectionItemsCount(Integer inspectionItemsCount) {
        this.inspectionItemsCount = inspectionItemsCount;
        return this;
    }

    public Map<String, Map<String, InspectionItemInfo>> getReportItems() {
        return reportItems;
    }

    public GetReportByTaskIDResponse setReportItems(Map<String, Map<String, InspectionItemInfo>> reportItems) {
        this.reportItems = reportItems;
        return this;
    }

    public String getInspectStartTime() {
        return inspectStartTime;
    }

    public GetReportByTaskIDResponse setInspectStartTime(String inspectStartTime) {
        this.inspectStartTime = inspectStartTime;
        return this;
    }

    public Object getReportDeliveryStatus() {
        return reportDeliveryStatus;
    }

    public GetReportByTaskIDResponse setReportDeliveryStatus(Object reportDeliveryStatus) {
        this.reportDeliveryStatus = reportDeliveryStatus;
        return this;
    }

    @Override
    public String toString() {
        return "GetReportByTaskIDResponse{" + "taskId=" + taskId + "\n" + "inspectionItemsCount=" + inspectionItemsCount + "\n" + "reportItems=" + reportItems + "\n"
                + "inspectStartTime=" + inspectStartTime + "\n" + "reportDeliveryStatus=" + reportDeliveryStatus + "\n" + "}";
    }

}
