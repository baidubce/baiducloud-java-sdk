package com.baidubce.aihc.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSource {
    /**
     * 数据源类型，枚举值：pfs/hostpath/dataset/bos/cfs/rapidfs；
     */
    private String type;

    /**
     * 数据源名称，如果type类型为pfs时，此处必须填写pfs实例id / type类型为bos时，默认为空
     */
    private String name;

    /**
     * 源路径：    type类型为pfs时，表示pfs存储中的路径，默认为/  type类型为hostpath时，表示宿主机路径
     */
    private String sourcePath;

    /**
     * 容器内挂载路径
     */
    private String mountPath;

    /**
     * options
     */
    private Option options;

    public DataSource setType(String type) {
        this.type = type;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public DataSource setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DataSource setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    public String getSourcePath() {
        return this.sourcePath;
    }

    public DataSource setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }

    public String getMountPath() {
        return this.mountPath;
    }

    public DataSource setOptions(Option options) {
        this.options = options;
        return this;
    }

    public Option getOptions() {
        return this.options;
    }

    @Override
    public String toString() {
        return "DataSource{" + "type=" + type + "\n" + "name=" + name + "\n" + "sourcePath=" + sourcePath + "\n" + "mountPath=" + mountPath + "\n" + "options=" + options + "\n"
                + "}";
    }

}