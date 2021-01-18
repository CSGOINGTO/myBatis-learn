package com.lx.mapper;

import com.lx.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    /**
     * 通过用户名查找用户
     *
     * @param username 用户名
     * @return 用户
     */
    @Select("SELECT user_id, userName, email, mobile, password, status, create_time, ssex, last_login_time, modify_time, description FROM user WHERE userName = #{userName}")
    User findByName(String username);

    /**
     * 新增用户
     *
     * @param user 用户
     */
    int insertUser(User user);

    /**
     * 删除用户
     *
     * @param user 用户
     */
    int deleteUser(User user);

    int updateUser(User user);

}
