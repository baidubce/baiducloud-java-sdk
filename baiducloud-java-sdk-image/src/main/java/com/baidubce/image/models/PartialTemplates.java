package com.baidubce.image.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PartialTemplates {
    /**
     * maleOld
     */
    @JsonProperty("male_old")
    private PartialHumanOptions maleOld;

    /**
     * femaleOld
     */
    @JsonProperty("female_old")
    private PartialHumanOptions femaleOld;

    /**
     * femaleYoung
     */
    @JsonProperty("female_young")
    private PartialHumanOptions femaleYoung;

    /**
     * maleYoung
     */
    @JsonProperty("male_young")
    private PartialHumanOptions maleYoung;

    /**
     * child
     */
    private PartialHumanOptions child;

    public PartialTemplates setMaleOld(PartialHumanOptions maleOld) {
        this.maleOld = maleOld;
        return this;
    }

    public PartialHumanOptions getMaleOld() {
        return this.maleOld;
    }

    public PartialTemplates setFemaleOld(PartialHumanOptions femaleOld) {
        this.femaleOld = femaleOld;
        return this;
    }

    public PartialHumanOptions getFemaleOld() {
        return this.femaleOld;
    }

    public PartialTemplates setFemaleYoung(PartialHumanOptions femaleYoung) {
        this.femaleYoung = femaleYoung;
        return this;
    }

    public PartialHumanOptions getFemaleYoung() {
        return this.femaleYoung;
    }

    public PartialTemplates setMaleYoung(PartialHumanOptions maleYoung) {
        this.maleYoung = maleYoung;
        return this;
    }

    public PartialHumanOptions getMaleYoung() {
        return this.maleYoung;
    }

    public PartialTemplates setChild(PartialHumanOptions child) {
        this.child = child;
        return this;
    }

    public PartialHumanOptions getChild() {
        return this.child;
    }

    @Override
    public String toString() {
        return "PartialTemplates{" + "maleOld=" + maleOld + "\n" + "femaleOld=" + femaleOld + "\n" + "femaleYoung=" + femaleYoung + "\n" + "maleYoung=" + maleYoung + "\n"
                + "child=" + child + "\n" + "}";
    }

}