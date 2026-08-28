package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Change {
    /**
     * 变更事项
     */
    private String changefield;

    /**
     * 变更前内容
     */
    private String changebefore;

    /**
     * 变更后内容
     */
    private String changeafter;

    /**
     * 变更日期
     */
    private String changedate;

    public Change setChangefield(String changefield) {
        this.changefield = changefield;
        return this;
    }

    public String getChangefield() {
        return this.changefield;
    }

    public Change setChangebefore(String changebefore) {
        this.changebefore = changebefore;
        return this;
    }

    public String getChangebefore() {
        return this.changebefore;
    }

    public Change setChangeafter(String changeafter) {
        this.changeafter = changeafter;
        return this;
    }

    public String getChangeafter() {
        return this.changeafter;
    }

    public Change setChangedate(String changedate) {
        this.changedate = changedate;
        return this;
    }

    public String getChangedate() {
        return this.changedate;
    }

    @Override
    public String toString() {
        return "Change{" + "changefield=" + changefield + "\n" + "changebefore=" + changebefore + "\n" + "changeafter=" + changeafter + "\n" + "changedate=" + changedate + "\n"
                + "}";
    }

}