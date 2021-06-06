package com.ssm.po;

import java.util.Date;

public class Usersalary {
    private String id;

    private String userid;

    private String username;

    private String createuserid;

    private String createusername;

    private Date createdate;

    private String salarymonth;

    private String salary1;

    private String salary2;

    private String salary3;

    private String salary4;

    private Integer sort;

    private String bak1;

    private String bak2;

    private String bak3;

    private String bak4;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid == null ? null : createuserid.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getSalarymonth() {
        return salarymonth;
    }

    public void setSalarymonth(String salarymonth) {
        this.salarymonth = salarymonth == null ? null : salarymonth.trim();
    }

    public String getSalary1() {
        return salary1;
    }

    public void setSalary1(String salary1) {
        this.salary1 = salary1 == null ? null : salary1.trim();
    }

    public String getSalary2() {
        return salary2;
    }

    public void setSalary2(String salary2) {
        this.salary2 = salary2 == null ? null : salary2.trim();
    }

    public String getSalary3() {
        return salary3;
    }

    public void setSalary3(String salary3) {
        this.salary3 = salary3 == null ? null : salary3.trim();
    }

    public String getSalary4() {
        return salary4;
    }

    public void setSalary4(String salary4) {
        this.salary4 = salary4 == null ? null : salary4.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3 == null ? null : bak3.trim();
    }

    public String getBak4() {
        return bak4;
    }

    public void setBak4(String bak4) {
        this.bak4 = bak4 == null ? null : bak4.trim();
    }
}