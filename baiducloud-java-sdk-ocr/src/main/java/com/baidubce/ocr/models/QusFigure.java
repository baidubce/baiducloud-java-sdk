package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QusFigure {
    /**
     * figLocation
     */
    @JsonProperty("fig_location")
    private FigLocation figLocation;

    public QusFigure setFigLocation(FigLocation figLocation) {
        this.figLocation = figLocation;
        return this;
    }

    public FigLocation getFigLocation() {
        return this.figLocation;
    }

    @Override
    public String toString() {
        return "QusFigure{" + "figLocation=" + figLocation + "\n" + "}";
    }

}