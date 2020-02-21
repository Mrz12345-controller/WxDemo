package net.com.wxdemo.mapper;

import net.com.wxdemo.domain.Video;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface VideoMapper {
    @Select("select * from video")
    List<Video> findAll();

    @Update("update video set title=#{title}where id=#{id}")
    int update(Video video);

    @Delete("delete from video where id=#{id}")
    int delete(int id);

    @Select("select * from video where id=#{id}")
    Video findById(int id);

    @Insert("insert into video (title,summary,cover_img,view_num,price,create_time,online,point) values" +
            "(#{title},#{summary},#{coverImg},#{viewNum},#{price},#{createTime},#{online},#{point})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    int save(Video video);
}
