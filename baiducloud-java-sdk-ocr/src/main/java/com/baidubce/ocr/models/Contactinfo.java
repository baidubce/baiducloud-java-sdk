package com.baidubce.ocr.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contactinfo {
    /**
     * 网站信息，每个数组可能包含多个object
     */
    private List<Website> website;

    /**
     * 联系电话
     */
    private String phonenumber;

    /**
     * 联系邮箱
     */
    private String email;

    public Contactinfo setWebsite(List<Website> website) {
        this.website = website;
        return this;
    }

    public List<Website> getWebsite() {
        return this.website;
    }

    public Contactinfo setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public Contactinfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return "Contactinfo{" + "website=" + website + "\n" + "phonenumber=" + phonenumber + "\n" + "email=" + email + "\n" + "}";
    }

}