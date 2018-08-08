package com.yanghua.gongxiang.dao;

import com.yanghua.gongxiang.bean.GradeLevel;
import com.yanghua.gongxiang.bean.GradeLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    long countByExample(GradeLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int deleteByExample(GradeLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int insert(GradeLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int insertSelective(GradeLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    List<GradeLevel> selectByExample(GradeLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    GradeLevel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") GradeLevel record, @Param("example") GradeLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByExample(@Param("record") GradeLevel record, @Param("example") GradeLevelExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByPrimaryKeySelective(GradeLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_level
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByPrimaryKey(GradeLevel record);
}