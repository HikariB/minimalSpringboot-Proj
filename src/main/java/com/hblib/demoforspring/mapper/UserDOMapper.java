package com.hblib.demoforspring.mapper;

import com.hblib.demoforspring.pojo.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDOMapper {

    @Select("Select * from user")
    @Results({
            @Result(property = "createTime", column = "create_time")
    })
    List<UserDO> findAll();

//    @Select("Select * from user where id = #{id}")
//    UserDO findById(int id);

    UserDO findById(@Param("id") int id);

    @Insert("insert into user(username,password,create_time) values(#{username},#{password},#{createTime})")
    void save(UserDO userDO);

    @Update("update user set username = #{username}, password = #{password}, where id=#{id}")
    void update(UserDO userDO);

    @Delete("delete from user where id=#{id}")
    void delete(long id);

    List<UserDO> findByName(@Param("name") String name);


}
