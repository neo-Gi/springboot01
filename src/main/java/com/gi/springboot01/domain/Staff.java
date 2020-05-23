package com.gi.springboot01.domain;

import org.joda.time.DateTime;

import java.util.Objects;

public class Staff {
    private String staffId; // 员工ID
    private String staffType; // 员工类型:0默认 1管理员 2...(待补充)
    private String staffState; // 员工状态：1正常、9离职
    private String loginType; // 登录方式：1手机动态验证码登录、2员工工号登录密码、3工号密码+动态验证码登录、4微信扫码登录，默认值3
    private String staffName; // 员工姓名
    private String staffPinyin; // 员工姓名拼音
    private String staffCode; // 员工工号，账号登录时非空
    private String staffPhone; // 员工登录号码，动态验证码登录时非空
    private String staffEmail; // 邮箱
    private String wxOpenId; // 扫码用的openid，微信扫码登录时非空
    private String wxUsercode; // 顾问/销售使用的微信号
    private String wxQrcode; // 顾问/销售使用、展示给经办人的微信二维码
    private String headimgUrl; // 用户头像
    private String sexType; // 性别 男 女
    private String operatorId; // 操作人
    private DateTime timeCreate; // 创建时间
    private DateTime timeUpdate; // 更新时间
    private String remark; // 备注
    private String staffPassword;

    public Staff() {
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getStaffState() {
        return staffState;
    }

    public void setStaffState(String staffState) {
        this.staffState = staffState;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPinyin() {
        return staffPinyin;
    }

    public void setStaffPinyin(String staffPinyin) {
        this.staffPinyin = staffPinyin;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public String getWxUsercode() {
        return wxUsercode;
    }

    public void setWxUsercode(String wxUsercode) {
        this.wxUsercode = wxUsercode;
    }

    public String getWxQrcode() {
        return wxQrcode;
    }

    public void setWxQrcode(String wxQrcode) {
        this.wxQrcode = wxQrcode;
    }

    public String getHeadimgUrl() {
        return headimgUrl;
    }

    public void setHeadimgUrl(String headimgUrl) {
        this.headimgUrl = headimgUrl;
    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public DateTime getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(DateTime timeCreate) {
        this.timeCreate = timeCreate;
    }

    public DateTime getTimeUpdate() {
        return timeUpdate;
    }

    public void setTimeUpdate(DateTime timeUpdate) {
        this.timeUpdate = timeUpdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", staffType='" + staffType + '\'' +
                ", staffState='" + staffState + '\'' +
                ", loginType='" + loginType + '\'' +
                ", staffName='" + staffName + '\'' +
                ", staffPinyin='" + staffPinyin + '\'' +
                ", staffCode='" + staffCode + '\'' +
                ", staffPhone='" + staffPhone + '\'' +
                ", staffEmail='" + staffEmail + '\'' +
                ", wxOpenId='" + wxOpenId + '\'' +
                ", wxUsercode='" + wxUsercode + '\'' +
                ", wxQrcode='" + wxQrcode + '\'' +
                ", headimgUrl='" + headimgUrl + '\'' +
                ", sexType='" + sexType + '\'' +
                ", operatorId='" + operatorId + '\'' +
                ", timeCreate=" + timeCreate +
                ", timeUpdate=" + timeUpdate +
                ", remark='" + remark + '\'' +
                ", staffPassword='" + staffPassword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff)) return false;
        Staff staff = (Staff) o;
        return Objects.equals(staffId, staff.staffId) &&
                Objects.equals(staffType, staff.staffType) &&
                Objects.equals(staffState, staff.staffState) &&
                Objects.equals(loginType, staff.loginType) &&
                Objects.equals(staffName, staff.staffName) &&
                Objects.equals(staffPinyin, staff.staffPinyin) &&
                Objects.equals(staffCode, staff.staffCode) &&
                Objects.equals(staffPhone, staff.staffPhone) &&
                Objects.equals(staffEmail, staff.staffEmail) &&
                Objects.equals(wxOpenId, staff.wxOpenId) &&
                Objects.equals(wxUsercode, staff.wxUsercode) &&
                Objects.equals(wxQrcode, staff.wxQrcode) &&
                Objects.equals(headimgUrl, staff.headimgUrl) &&
                Objects.equals(sexType, staff.sexType) &&
                Objects.equals(operatorId, staff.operatorId) &&
                Objects.equals(timeCreate, staff.timeCreate) &&
                Objects.equals(timeUpdate, staff.timeUpdate) &&
                Objects.equals(remark, staff.remark) &&
                Objects.equals(staffPassword, staff.staffPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, staffType, staffState, loginType, staffName, staffPinyin, staffCode, staffPhone, staffEmail, wxOpenId, wxUsercode, wxQrcode, headimgUrl, sexType, operatorId, timeCreate, timeUpdate, remark, staffPassword);
    }
}
