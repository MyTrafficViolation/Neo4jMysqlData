package com.dao;

import com.bean.Tcplog;

public interface TcplogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tcplog
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tcplog
     *
     * @mbggenerated
     */
    int insert(Tcplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tcplog
     *
     * @mbggenerated
     */
    int insertSelective(Tcplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tcplog
     *
     * @mbggenerated
     */
    Tcplog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tcplog
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Tcplog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tcplog
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Tcplog record);
}