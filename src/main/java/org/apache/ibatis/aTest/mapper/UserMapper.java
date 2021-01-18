package org.apache.ibatis.aTest.mapper;

import org.apache.ibatis.aTest.pojo.User;

public interface UserMapper {
    /**
     * 通过用户名查找用户
     *
     * @param username 用户名
     * @return 用户
     */
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
