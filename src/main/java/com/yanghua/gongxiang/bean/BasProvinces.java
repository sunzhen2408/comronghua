package com.yanghua.gongxiang.bean;

public class BasProvinces {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gx_bas_provinces.id
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    private Integer id;

    @Override
    public String toString() {
        return "BasProvinces{" +
                "id=" + id +
                ", provinceid=" + provinceid +
                ", provincename='" + provincename + '\'' +
                '}';
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gx_bas_provinces.provinceID
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    private Integer provinceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gx_bas_provinces.provinceName
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    private String provincename;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gx_bas_provinces.id
     *
     * @return the value of gx_bas_provinces.id
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gx_bas_provinces.id
     *
     * @param id the value for gx_bas_provinces.id
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gx_bas_provinces.provinceID
     *
     * @return the value of gx_bas_provinces.provinceID
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    public Integer getProvinceid() {
        return provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gx_bas_provinces.provinceID
     *
     * @param provinceid the value for gx_bas_provinces.provinceID
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gx_bas_provinces.provinceName
     *
     * @return the value of gx_bas_provinces.provinceName
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gx_bas_provinces.provinceName
     *
     * @param provincename the value for gx_bas_provinces.provinceName
     *
     * @mbg.generated Fri Jan 26 16:56:30 CST 2018
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename == null ? null : provincename.trim();
    }
}