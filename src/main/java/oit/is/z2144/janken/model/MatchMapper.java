package oit.is.z2144.janken.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

@Mapper
public interface MatchMapper {
  @Select("SELECT id, user1, user2, user1Hand, user2Hand from matches;")
  ArrayList<Match> selectAllMatche();

  @Insert("INSERT INTO matches (user1, user2, user1Hand, user2Hand) VALUES (#{user1},#{user2},#{user1Hand},#{user2Hand});")
  void insertMatch(Match match);
}
