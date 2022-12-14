package com.example.apitest.Mapper;

import com.example.apitest.Model.StarVO;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UserProfileMapper {


    //select PK id 한개
    @Select("SELECT * FROM star WHERE id=#{id}")
    StarVO getStar(@Param("id") String id);

    //select all
    @Select("SELECT * FROM star")
    List<StarVO> getStarList();

    //Insert
    @Insert("INSERT INTO star VALUES(#{id},#{race},#{ladder},#{map})")
    int insertStar(@Param("id") String id, @Param("race") String race, @Param("ladder") String ladder, @Param("map") String map);


    //Update
    @Update("UPDATE star SET race=#{race}, ladder=#{ladder}, map=#{map} WHERE id=#{id}")
    int updateStar(@Param("id") String id, @Param("race") String race, @Param("ladder") String ladder, @Param("map") String map);

    //Delete
    @Delete("DELETE FROM star WHERE id=#{id}")
    int deleteStar(@Param("id") String id);



}
