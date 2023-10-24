package oit.is.z2144.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
  @Select("SELECT id, name from users;")
  ArrayList<User> selectAllUsers();

  @Select("SELECT id, name from users where id = #{id}")
  User selectUserById(int id);
}
