package com.inyu.repo;

import com.inyu.entity.CrmUser;

import java.util.List;

public interface CrmUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_user
     *
     * @mbg.generated
     */
    int insert(CrmUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_user
     *
     * @mbg.generated
     */
    CrmUser selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_user
     *
     * @mbg.generated
     */
    List<CrmUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table crm_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CrmUser record);

    CrmUser validateUserName(String name);

    CrmUser login(String name, String password);

}