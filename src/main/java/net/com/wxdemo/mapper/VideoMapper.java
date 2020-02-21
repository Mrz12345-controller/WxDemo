package net.com.wxdemo.mapper;

import net.com.wxdemo.domain.Video;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
}
