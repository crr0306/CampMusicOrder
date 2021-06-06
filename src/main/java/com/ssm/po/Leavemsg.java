package com.ssm.po;

import java.util.Date;

public class Leavemsg {
    private String id;

    private String title;

    private String content;

    private String createuserid;

    private String createusername;

    private Date createdate;

    private String retitle;

    private String recontent;

    private String reuserid;

    private String reusername;

    private Date recreatedate;

    private String remark;

    private String type;

    private String typename;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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

    public String getRetitle() {
        return retitle;
    }

    public void setRetitle(String retitle) {
        this.retitle = retitle == null ? null : retitle.trim();
    }

    public String getRecontent() {
        return recontent;
    }

    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }

    public String getReuserid() {
        return reuserid;
    }

    public void setReuserid(String reuserid) {
        this.reuserid = reuserid == null ? null : reuserid.trim();
    }

    public String getReusername() {
        return reusername;
    }

    public void setReusername(String reusername) {
        this.reusername = reusername == null ? null : reusername.trim();
    }

    public Date getRecreatedate() {
        return recreatedate;
    }

    public void setRecreatedate(Date recreatedate) {
        this.recreatedate = recreatedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
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