package net.com.wxdemo.service;

import net.com.wxdemo.domain.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAll();

    int update(Video video);

    int delete(int id);

    Video findById(int id);

    int save(Video video);
}
