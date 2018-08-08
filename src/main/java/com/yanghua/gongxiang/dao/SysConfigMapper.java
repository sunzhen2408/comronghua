package com.yanghua.gongxiang.dao;

import com.yanghua.gongxiang.bean.SysConfig;
import com.yanghua.gongxiang.bean.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    long countByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int deleteByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    List<SysConfig> selectByExampleWithBLOBs(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    List<SysConfig> selectByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    SysConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_sys_config
     *
     * @mbg.generated Fri Jan 26 16:50:52 CST 2018
     */
    int updateByPrimaryKey(SysConfig record);
}