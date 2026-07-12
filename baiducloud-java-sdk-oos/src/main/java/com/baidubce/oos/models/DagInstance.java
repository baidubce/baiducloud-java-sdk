package com.baidubce.oos.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DagInstance {
    /**
     * DAG（执行）ID，全局唯一
     */
    private String id;

    /**
     * 执行描述
     */
    private String description;

    /**
     * 版本号，更新 DAG 时需要携带
     */
    private Long revision;

    /**
     * 执行创建时间，Unix 时间戳，单位：毫秒
     */
    private Long createdTimestamp;

    /**
     * 执行最近更新时间，Unix 时间戳，单位：毫秒
     */
    private Long updatedTimestamp;

    /**
     * 执行结束时间，Unix 时间戳，单位：毫秒；未结束时填 0
     */
    private Long finishedTimestamp;

    /**
     * 名称空间，DAG 仅在所属 namespace 下执行
     */
    private String namespace;

    /**
     * 
     */
    private String state;

    /**
     * dagSpec
     */
    private DagSpec dagSpec;

    /**
     * 全局参数取值集合（Map<String,Object>）
     */
    private Object initContext;

    /**
     * 并发度
     */
    private Integer parallelism;

    /**
     * 是否手动触发，默认 false
     */
    private Boolean manually;

    /**
     * 工作机选择器列表（List<TagSelector>）
     */
    private List<TagSelector> workerSelectors;

    /**
     * 执行中的任务列表（List<TaskModel>）
     */
    private List<ExecutionTaskSummary> tasks;

    /**
     * 执行所属用户信息
     */
    private Object user;

    /**
     * operator 级别动作映射，key 为 operator 名称，value 为对应动作（Map<String,OperatorActionModel>）
     */
    private Object operatorActions;

    /**
     * dagActions
     */
    private DagActionModel dagActions;

    /**
     * event
     */
    private EventModel event;

    /**
     * parentTask
     */
    private ExecutionTaskSummary parentTask;

    /**
     * 触发方式（如 manual / cron / event 等）
     */
    private String trigger;

    /**
     * 初始 operator 列表（List<OperatorModel>），DAG 创建时记录的初始 operator 快照
     */
    private List<TaskOperatorSummary> initOperators;

    /**
     * 状态原因（失败/取消等场景下的原因说明）
     */
    private String reason;

    /**
     * 错误码
     */
    private String errorCode;

    /**
     * 定时运维名称（cron 触发时填充）
     */
    private String cronDagName;

    /**
     * 报警事件运维名称（event 触发时填充）
     */
    private String eventDagName;

    public DagInstance setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public DagInstance setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public DagInstance setRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    public Long getRevision() {
        return this.revision;
    }

    public DagInstance setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
        return this;
    }

    public Long getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    public DagInstance setUpdatedTimestamp(Long updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
        return this;
    }

    public Long getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    public DagInstance setFinishedTimestamp(Long finishedTimestamp) {
        this.finishedTimestamp = finishedTimestamp;
        return this;
    }

    public Long getFinishedTimestamp() {
        return this.finishedTimestamp;
    }

    public DagInstance setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public DagInstance setState(String state) {
        this.state = state;
        return this;
    }

    public String getState() {
        return this.state;
    }

    public DagInstance setDagSpec(DagSpec dagSpec) {
        this.dagSpec = dagSpec;
        return this;
    }

    public DagSpec getDagSpec() {
        return this.dagSpec;
    }

    public DagInstance setInitContext(Object initContext) {
        this.initContext = initContext;
        return this;
    }

    public Object getInitContext() {
        return this.initContext;
    }

    public DagInstance setParallelism(Integer parallelism) {
        this.parallelism = parallelism;
        return this;
    }

    public Integer getParallelism() {
        return this.parallelism;
    }

    public DagInstance setManually(Boolean manually) {
        this.manually = manually;
        return this;
    }

    public Boolean getManually() {
        return this.manually;
    }

    public DagInstance setWorkerSelectors(List<TagSelector> workerSelectors) {
        this.workerSelectors = workerSelectors;
        return this;
    }

    public List<TagSelector> getWorkerSelectors() {
        return this.workerSelectors;
    }

    public DagInstance setTasks(List<ExecutionTaskSummary> tasks) {
        this.tasks = tasks;
        return this;
    }

    public List<ExecutionTaskSummary> getTasks() {
        return this.tasks;
    }

    public DagInstance setUser(Object user) {
        this.user = user;
        return this;
    }

    public Object getUser() {
        return this.user;
    }

    public DagInstance setOperatorActions(Object operatorActions) {
        this.operatorActions = operatorActions;
        return this;
    }

    public Object getOperatorActions() {
        return this.operatorActions;
    }

    public DagInstance setDagActions(DagActionModel dagActions) {
        this.dagActions = dagActions;
        return this;
    }

    public DagActionModel getDagActions() {
        return this.dagActions;
    }

    public DagInstance setEvent(EventModel event) {
        this.event = event;
        return this;
    }

    public EventModel getEvent() {
        return this.event;
    }

    public DagInstance setParentTask(ExecutionTaskSummary parentTask) {
        this.parentTask = parentTask;
        return this;
    }

    public ExecutionTaskSummary getParentTask() {
        return this.parentTask;
    }

    public DagInstance setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public String getTrigger() {
        return this.trigger;
    }

    public DagInstance setInitOperators(List<TaskOperatorSummary> initOperators) {
        this.initOperators = initOperators;
        return this;
    }

    public List<TaskOperatorSummary> getInitOperators() {
        return this.initOperators;
    }

    public DagInstance setReason(String reason) {
        this.reason = reason;
        return this;
    }

    public String getReason() {
        return this.reason;
    }

    public DagInstance setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public DagInstance setCronDagName(String cronDagName) {
        this.cronDagName = cronDagName;
        return this;
    }

    public String getCronDagName() {
        return this.cronDagName;
    }

    public DagInstance setEventDagName(String eventDagName) {
        this.eventDagName = eventDagName;
        return this;
    }

    public String getEventDagName() {
        return this.eventDagName;
    }

    @Override
    public String toString() {
        return "DagInstance{" + "id=" + id + "\n" + "description=" + description + "\n" + "revision=" + revision + "\n" + "createdTimestamp=" + createdTimestamp + "\n"
                + "updatedTimestamp=" + updatedTimestamp + "\n" + "finishedTimestamp=" + finishedTimestamp + "\n" + "namespace=" + namespace + "\n" + "state=" + state + "\n"
                + "dagSpec=" + dagSpec + "\n" + "initContext=" + initContext + "\n" + "parallelism=" + parallelism + "\n" + "manually=" + manually + "\n" + "workerSelectors="
                + workerSelectors + "\n" + "tasks=" + tasks + "\n" + "user=" + user + "\n" + "operatorActions=" + operatorActions + "\n" + "dagActions=" + dagActions + "\n"
                + "event=" + event + "\n" + "parentTask=" + parentTask + "\n" + "trigger=" + trigger + "\n" + "initOperators=" + initOperators + "\n" + "reason=" + reason + "\n"
                + "errorCode=" + errorCode + "\n" + "cronDagName=" + cronDagName + "\n" + "eventDagName=" + eventDagName + "\n" + "}";
    }

}