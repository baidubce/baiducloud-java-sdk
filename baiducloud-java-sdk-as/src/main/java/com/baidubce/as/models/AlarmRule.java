package com.baidubce.as.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlarmRule {
    /**
     * 报警规则id
     */
    private Integer id;

    /**
     * 报警规则的索引，当多个规则共同组成同一报警规则，它们的索引相同
     */
    private Integer index;

    /**
     * 监控指标名称，如：vCPUUsagePercent
     */
    private String metric;

    /**
     * 多长时间计算一次是否满足各个报警规则，即单个评估周期时长，单位s
     */
    private Integer periodInSecond;

    /**
     * 统计方式，可选值为：maximum（最大值）、minimum（最小值）、sum（和值）、average（平均值）
     */
    private String statistics;

    /**
     * 报警规则的阈值
     */
    private String threshold;

    /**
     * 和阈值比较的算符，取值为>=、>、=、<、<=
     */
    private String comparisonOperator;

    /**
     * 触发报警所需连续发生次数
     */
    private Integer evaluationPeriodCount;

    /**
     * 指标维度
     */
    private List<Dimension> metricDimensions;

    public AlarmRule setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return this.id;
    }

    public AlarmRule setIndex(Integer index) {
        this.index = index;
        return this;
    }

    public Integer getIndex() {
        return this.index;
    }

    public AlarmRule setMetric(String metric) {
        this.metric = metric;
        return this;
    }

    public String getMetric() {
        return this.metric;
    }

    public AlarmRule setPeriodInSecond(Integer periodInSecond) {
        this.periodInSecond = periodInSecond;
        return this;
    }

    public Integer getPeriodInSecond() {
        return this.periodInSecond;
    }

    public AlarmRule setStatistics(String statistics) {
        this.statistics = statistics;
        return this;
    }

    public String getStatistics() {
        return this.statistics;
    }

    public AlarmRule setThreshold(String threshold) {
        this.threshold = threshold;
        return this;
    }

    public String getThreshold() {
        return this.threshold;
    }

    public AlarmRule setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public AlarmRule setEvaluationPeriodCount(Integer evaluationPeriodCount) {
        this.evaluationPeriodCount = evaluationPeriodCount;
        return this;
    }

    public Integer getEvaluationPeriodCount() {
        return this.evaluationPeriodCount;
    }

    public AlarmRule setMetricDimensions(List<Dimension> metricDimensions) {
        this.metricDimensions = metricDimensions;
        return this;
    }

    public List<Dimension> getMetricDimensions() {
        return this.metricDimensions;
    }

    @Override
    public String toString() {
        return "AlarmRule{" + "id=" + id + "\n" + "index=" + index + "\n" + "metric=" + metric + "\n" + "periodInSecond=" + periodInSecond + "\n" + "statistics=" + statistics
                + "\n" + "threshold=" + threshold + "\n" + "comparisonOperator=" + comparisonOperator + "\n" + "evaluationPeriodCount=" + evaluationPeriodCount + "\n"
                + "metricDimensions=" + metricDimensions + "\n" + "}";
    }

}