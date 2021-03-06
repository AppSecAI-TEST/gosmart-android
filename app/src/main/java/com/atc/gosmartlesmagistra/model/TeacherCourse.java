package com.atc.gosmartlesmagistra.model;

import android.util.Log;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.atc.gosmartlesmagistra.App;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeacherCourse implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("expected_cost")
    @Expose
    private String expectedCost;
    @SerializedName("expected_cost_updated_at")
    @Expose
    private String expectedCostUpdatedAt;
    @SerializedName("additional_cost")
    @Expose
    private String additionalCost;
    @SerializedName("admin_fee")
    @Expose
    private String adminFee;
    @SerializedName("final_cost")
    @Expose
    private String finalCost;
    @SerializedName("approved_at")
    @Expose
    private String approvedAt;
    @SerializedName("module")
    @Expose
    private String module;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("course")
    @Expose
    private Course course;
    @SerializedName("user")
    @Expose
    private User user;
    private final static long serialVersionUID = 8130222537541333959L;

    /**
     * No args constructor for use in serialization
     *
     */
    public TeacherCourse() {
    }

    /**
     *
     * @param course
     * @param id
     * @param module
     * @param additionalCost
     * @param status
     * @param finalCost
     * @param expectedCost
     * @param description
     * @param adminFee
     * @param courseId
     * @param approvedAt
     * @param expectedCostUpdatedAt
     */
    public TeacherCourse(Integer id, Integer courseId, String description, String expectedCost, String expectedCostUpdatedAt, String additionalCost, String adminFee, String finalCost, String approvedAt, String module, Integer status, Course course) {
        super();
        this.id = id;
        this.courseId = courseId;
        this.description = description;
        this.expectedCost = expectedCost;
        this.expectedCostUpdatedAt = expectedCostUpdatedAt;
        this.additionalCost = additionalCost;
        this.adminFee = adminFee;
        this.finalCost = finalCost;
        this.approvedAt = approvedAt;
        this.module = module;
        this.status = status;
        this.course = course;
    }

    /**
     *
     * @param course
     * @param id
     * @param module
     * @param additionalCost
     * @param finalCost
     * @param expectedCost
     * @param description
     * @param adminFee
     * @param courseId
     * @param user
     * @param expectedCostUpdatedAt
     */
    public TeacherCourse(Integer id, Integer courseId, String description, String expectedCost, String expectedCostUpdatedAt, String additionalCost, String adminFee, String finalCost, String module, Course course, User user) {
        super();
        this.id = id;
        this.courseId = courseId;
        this.description = description;
        this.expectedCost = expectedCost;
        this.expectedCostUpdatedAt = expectedCostUpdatedAt;
        this.additionalCost = additionalCost;
        this.adminFee = adminFee;
        this.finalCost = finalCost;
        this.module = module;
        this.course = course;
        this.user = user;
    }

    /**
     *
     * @param course
     * @param id
     * @param module
     * @param additionalCost
     * @param status
     * @param finalCost
     * @param expectedCost
     * @param description
     * @param adminFee
     * @param courseId
     * @param approvedAt
     * @param expectedCostUpdatedAt
     */
    public TeacherCourse(Integer id, Integer courseId, String description, String expectedCost, String expectedCostUpdatedAt, String additionalCost, String adminFee, String finalCost, String approvedAt, String module, Integer status, Course course, User user) {
        super();
        this.id = id;
        this.courseId = courseId;
        this.description = description;
        this.expectedCost = expectedCost;
        this.expectedCostUpdatedAt = expectedCostUpdatedAt;
        this.additionalCost = additionalCost;
        this.adminFee = adminFee;
        this.finalCost = finalCost;
        this.approvedAt = approvedAt;
        this.module = module;
        this.status = status;
        this.course = course;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpectedCost() {
        return expectedCost;
    }

    public void setExpectedCost(String expectedCost) {
        this.expectedCost = expectedCost;
    }

    public String getExpectedCostUpdatedAt() {
        return expectedCostUpdatedAt;
    }

    public void setExpectedCostUpdatedAt(String expectedCostUpdatedAt) {
        this.expectedCostUpdatedAt = expectedCostUpdatedAt;
    }

    public String getAdditionalCost() {
        return additionalCost;
    }

    public void setAdditionalCost(String additionalCost) {
        this.additionalCost = additionalCost;
    }

    public String getAdminFee() {
        return adminFee;
    }

    public void setAdminFee(String adminFee) {
        this.adminFee = adminFee;
    }

    public String getFinalCost() {
        return finalCost;
    }

    public void setFinalCost(String finalCost) {
        this.finalCost = finalCost;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getApprovedAt() {
        return approvedAt;
    }

    public void setApprovedAt(String approvedAt) {
        this.approvedAt = approvedAt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFormattedFinalCost() {
        return App.getFormattedCurrencyRupiah(this.getFinalCost());
    }

    public String getFormattedExpectedCost() {
        return App.getFormattedCurrencyRupiah(this.getExpectedCost());
    }

    public String getFormattedApprovedAt() {
        String formattedDate;
        if (this.getApprovedAt() == null) {
            return "-";
        }

        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd H:m:s", new Locale("id", "ID")).parse(this.getApprovedAt());

            SimpleDateFormat outGoing = new SimpleDateFormat("dd MMM yyyy", new Locale("id", "ID"));
            formattedDate = outGoing.format(date);
        } catch (ParseException e) {
            formattedDate = this.getApprovedAt();
            e.printStackTrace();
        }

        return "Approved at " + formattedDate;
    }

    public String getStatusText() {
        if (this.getStatus() == 1) {
            return "Approved";
        } else {
            return "Waiting for Approve";
        }
    }

}