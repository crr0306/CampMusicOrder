package com.ssm.po;

import java.util.Date;

public class Tblsong {
    private String id;

    private String colname;

    private String colsinger;

    private String colcomposingwords;

    private String colproductioncompany;

    private String collyric;

    private String userid;

    private String username;

    private String datestr;

    private String createuserid;

    private String createusername;

    private Date createdate;

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

    public String getColname() {
        return colname;
    }

    public void setColname(String colname) {
        this.colname = colname == null ? null : colname.trim();
    }

    public String getColsinger() {
        return colsinger;
    }

    public void setColsinger(String colsinger) {
        this.colsinger = colsinger == null ? null : colsinger.trim();
    }

    public String getColcomposingwords() {
        return colcomposingwords;
    }

    public void setColcomposingwords(String colcomposingwords) {
        this.colcomposingwords = colcomposingwords == null ? null : colcomposingwords.trim();
    }

    public String getColproductioncompany() {
        return colproductioncompany;
    }

    public void setColproductioncompany(String colproductioncompany) {
        this.colproductioncompany = colproductioncompany == null ? null : colproductioncompany.trim();
    }

    public String getCollyric() {
        return collyric;
    }

    public void setCollyric(String collyric) {
        this.collyric = collyric == null ? null : collyric.trim();
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

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr == null ? null : datestr.trim();
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