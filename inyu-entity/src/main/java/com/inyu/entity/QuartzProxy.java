package com.inyu.entity;

import java.io.Serializable;
import java.util.Date;

public class QuartzProxy implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.port
     *
     * @mbg.generated
     */
    private String port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.location
     *
     * @mbg.generated
     */
    private String location;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.spread
     *
     * @mbg.generated
     */
    private Float spread;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column quartz_proxy.last_validate
     *
     * @mbg.generated
     */
    private Date lastValidate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table quartz_proxy
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.id
     *
     * @return the value of quartz_proxy.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.id
     *
     * @param id the value for quartz_proxy.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.ip
     *
     * @return the value of quartz_proxy.ip
     *
     * @mbg.generated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.ip
     *
     * @param ip the value for quartz_proxy.ip
     *
     * @mbg.generated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.port
     *
     * @return the value of quartz_proxy.port
     *
     * @mbg.generated
     */
    public String getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.port
     *
     * @param port the value for quartz_proxy.port
     *
     * @mbg.generated
     */
    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.status
     *
     * @return the value of quartz_proxy.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.status
     *
     * @param status the value for quartz_proxy.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.location
     *
     * @return the value of quartz_proxy.location
     *
     * @mbg.generated
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.location
     *
     * @param location the value for quartz_proxy.location
     *
     * @mbg.generated
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.type
     *
     * @return the value of quartz_proxy.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.type
     *
     * @param type the value for quartz_proxy.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.spread
     *
     * @return the value of quartz_proxy.spread
     *
     * @mbg.generated
     */
    public Float getSpread() {
        return spread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.spread
     *
     * @param spread the value for quartz_proxy.spread
     *
     * @mbg.generated
     */
    public void setSpread(Float spread) {
        this.spread = spread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column quartz_proxy.last_validate
     *
     * @return the value of quartz_proxy.last_validate
     *
     * @mbg.generated
     */
    public Date getLastValidate() {
        return lastValidate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column quartz_proxy.last_validate
     *
     * @param lastValidate the value for quartz_proxy.last_validate
     *
     * @mbg.generated
     */
    public void setLastValidate(Date lastValidate) {
        this.lastValidate = lastValidate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_proxy
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", status=").append(status);
        sb.append(", location=").append(location);
        sb.append(", type=").append(type);
        sb.append(", spread=").append(spread);
        sb.append(", lastValidate=").append(lastValidate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}