package com.inyu.dal.master;


import com.inyu.entity.QuartzConfig;

import java.util.List;

public interface QuartzConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_config
     *
     * @mbg.generated
     */
    int insert(QuartzConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_config
     *
     * @mbg.generated
     */
    QuartzConfig selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_config
     *
     * @mbg.generated
     */
    List<QuartzConfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quartz_config
     *
     * @mbg.generated
     */
    int updateMsgByPK(long id, String cron, String msg);

    int updateStatusByPK(long id, int status);
}