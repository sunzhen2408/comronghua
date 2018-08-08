package com.yanghua.gongxiang.dao;

import com.yanghua.gongxiang.bean.GradeHistory;
import com.yanghua.gongxiang.bean.GradeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    long countByExample(GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int deleteByExample(GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int insert(GradeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int insertSelective(GradeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    List<GradeHistory> selectByExampleWithBLOBs(GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    List<GradeHistory> selectByExample(GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    GradeHistory selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") GradeHistory record, @Param("example") GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") GradeHistory record, @Param("example") GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByExample(@Param("record") GradeHistory record, @Param("example") GradeHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByPrimaryKeySelective(GradeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(GradeHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gx_grade_history
     *
     * @mbg.generated Wed Jan 31 20:33:27 CST 2018
     */
    int updateByPrimaryKey(GradeHistory record);
}