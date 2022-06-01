package com.rystars.general.feign.bean;

import java.io.Serializable;

public class LimsTestDto implements Serializable {

    private static final long serialVersionUID = 6229042272748381456L;

    private String id;

    private String testName;

    private String testCategoryId;

    private String testCategoryName;

    private String testMethodId;

    private String testMethodName;

    private String methodNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTestCategoryId() {
        return testCategoryId;
    }

    public void setTestCategoryId(String testCategoryId) {
        this.testCategoryId = testCategoryId;
    }

    public String getTestCategoryName() {
        return testCategoryName;
    }

    public void setTestCategoryName(String testCategoryName) {
        this.testCategoryName = testCategoryName;
    }

    public String getTestMethodId() {
        return testMethodId;
    }

    public void setTestMethodId(String testMethodId) {
        this.testMethodId = testMethodId;
    }

    public String getTestMethodName() {
        return testMethodName;
    }

    public void setTestMethodName(String testMethodName) {
        this.testMethodName = testMethodName;
    }

    public String getMethodNo() {
        return methodNo;
    }

    public void setMethodNo(String methodNo) {
        this.methodNo = methodNo;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

}
