package com.bean;

import java.util.Date;

public class Checking {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checking.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checking.day
     *
     * @mbggenerated
     */
    private Date day;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checking.checkin
     *
     * @mbggenerated
     */
    private Date checkin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checking.checkout
     *
     * @mbggenerated
     */
    private Date checkout;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column checking.istype
     *
     * @mbggenerated
     */
    private String istype;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checking
     *
     * @mbggenerated
     */
    public Checking(String id, Date day, Date checkin, Date checkout, String istype) {
        this.id = id;
        this.day = day;
        this.checkin = checkin;
        this.checkout = checkout;
        this.istype = istype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table checking
     *
     * @mbggenerated
     */
    public Checking() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking.id
     *
     * @return the value of checking.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking.id
     *
     * @param id the value for checking.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking.day
     *
     * @return the value of checking.day
     *
     * @mbggenerated
     */
    public Date getDay() {
        return day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking.day
     *
     * @param day the value for checking.day
     *
     * @mbggenerated
     */
    public void setDay(Date day) {
        this.day = day;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking.checkin
     *
     * @return the value of checking.checkin
     *
     * @mbggenerated
     */
    public Date getCheckin() {
        return checkin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking.checkin
     *
     * @param checkin the value for checking.checkin
     *
     * @mbggenerated
     */
    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking.checkout
     *
     * @return the value of checking.checkout
     *
     * @mbggenerated
     */
    public Date getCheckout() {
        return checkout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking.checkout
     *
     * @param checkout the value for checking.checkout
     *
     * @mbggenerated
     */
    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column checking.istype
     *
     * @return the value of checking.istype
     *
     * @mbggenerated
     */
    public String getIstype() {
        return istype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column checking.istype
     *
     * @param istype the value for checking.istype
     *
     * @mbggenerated
     */
    public void setIstype(String istype) {
        this.istype = istype == null ? null : istype.trim();
    }
}