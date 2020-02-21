package net.com.wxdemo.service.impl;

import net.com.wxdemo.domain.Video;
import net.com.wxdemo.mapper.VideoMapper;
import net.com.wxdemo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public List<Video> findAll() {
        return videoMapper.findAll();
    }

    @Override
    public int update(Video video) {
        return videoMapper.update(video);
    }

    @Override
    public int delete(int id) {
        return videoMapper.delete(id);
    }

    @Override
    public Video findById(int id) {
        return videoMapper.findById(id);
    }

    @Override
    public int save(Video video) {
       int row = videoMapper.save(video);
       System.out.println("id:"+video.getId());
        return row;
    }
}
