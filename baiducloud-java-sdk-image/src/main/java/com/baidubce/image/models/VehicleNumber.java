package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VehicleNumber {
    /**
     * 小轿车数量
     */
    private Integer car;

    /**
     * 卡车数量
     */
    private Integer truck;

    /**
     * 公交车数量
     */
    private Integer bus;

    /**
     * 摩托车数量
     */
    private Integer motorbike;

    /**
     * 三轮车数量
     */
    private Integer tricycle;

    /**
     * 车牌数量
     */
    private Integer carplate;

    public VehicleNumber setCar(Integer car) {
        this.car = car;
        return this;
    }

    public Integer getCar() {
        return this.car;
    }

    public VehicleNumber setTruck(Integer truck) {
        this.truck = truck;
        return this;
    }

    public Integer getTruck() {
        return this.truck;
    }

    public VehicleNumber setBus(Integer bus) {
        this.bus = bus;
        return this;
    }

    public Integer getBus() {
        return this.bus;
    }

    public VehicleNumber setMotorbike(Integer motorbike) {
        this.motorbike = motorbike;
        return this;
    }

    public Integer getMotorbike() {
        return this.motorbike;
    }

    public VehicleNumber setTricycle(Integer tricycle) {
        this.tricycle = tricycle;
        return this;
    }

    public Integer getTricycle() {
        return this.tricycle;
    }

    public VehicleNumber setCarplate(Integer carplate) {
        this.carplate = carplate;
        return this;
    }

    public Integer getCarplate() {
        return this.carplate;
    }

    @Override
    public String toString() {
        return "VehicleNumber{" + "car=" + car + "\n" + "truck=" + truck + "\n" + "bus=" + bus + "\n" + "motorbike=" + motorbike + "\n" + "tricycle=" + tricycle + "\n"
                + "carplate=" + carplate + "\n" + "}";
    }

}