package org.example.studyweb.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.studyweb.pojo.Resource;

import java.util.List;

@Mapper
public interface ResourceMapper {

    @Select("select * from resource")
    List<Resource>getAllResource();


    @Insert("INSERT INTO Resource (link, title, description, category, time, views) values (#{link},#{title},#{description},#{category},#{time},#{views})")
    void insertResource(Resource resource);

}

