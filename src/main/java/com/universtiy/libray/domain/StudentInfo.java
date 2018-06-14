package com.universtiy.libray.domain;

public class StudentInfo {
    private String stId;

    private String stNo;

    private String stName;

    private String grend;

    private String grade;

    public String getStId() {
        return stId;
    }

    public void setStId(String stId) {
        this.stId = stId == null ? null : stId.trim();
    }

    public String getStNo() {
        return stNo;
    }

    public void setStNo(String stNo) {
        this.stNo = stNo == null ? null : stNo.trim();
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getGrend() {
        return grend;
    }

    public void setGrend(String grend) {
        this.grend = grend == null ? null : grend.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}