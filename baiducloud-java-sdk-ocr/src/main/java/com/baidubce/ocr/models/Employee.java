package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {
    /**
     * 姓名
     */
    private String employeename;

    /**
     * 职位
     */
    private String position;

    public Employee setEmployeename(String employeename) {
        this.employeename = employeename;
        return this;
    }

    public String getEmployeename() {
        return this.employeename;
    }

    public Employee setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeename=" + employeename + "\n" + "position=" + position + "\n" + "}";
    }

}