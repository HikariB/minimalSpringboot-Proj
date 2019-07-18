package com.hblib.demoforspring.mapper;

import com.hblib.demoforspring.pojo.ToolistDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ToolistDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table toollist
     *
     * @mbg.generated Sat Apr 20 14:16:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table toollist
     *
     * @mbg.generated Sat Apr 20 14:16:04 CST 2019
     */
    int insert(ToolistDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table toollist
     *
     * @mbg.generated Sat Apr 20 14:16:04 CST 2019
     */
    int insertSelective(ToolistDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table toollist
     *
     * @mbg.generated Sat Apr 20 14:16:04 CST 2019
     */
    ToolistDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table toollist
     *
     * @mbg.generated Sat Apr 20 14:16:04 CST 2019
     */
    int updateByPrimaryKeySelective(ToolistDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table toollist
     *
     * @mbg.generated Sat Apr 20 14:16:04 CST 2019
     */
    int updateByPrimaryKey(ToolistDO record);
}