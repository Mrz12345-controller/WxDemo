package net.com.wxdemo.controller;

import net.com.wxdemo.domain.Video;
import net.com.wxdemo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api/v1/video")
public class IndexController {

   @Autowired
    private VideoService videoService;
   @GetMapping("page")
    public Object findAll(){
       return videoService.findAll();
   }
   @GetMapping("find_by_id")
    public Object findById(int id){
       return videoService.findById(id);
   }
   @DeleteMapping("del_by_id")
    public int delById(int id){
       return videoService.delete(id);
   }
   @PutMapping("update_by_id")
    public int updateById(int id,String title){
       Video video = new Video();
       video.setId(id);
       video.setTitle(title);
       return videoService.update(video);
   }
   @PostMapping("save")
    public Object save(String title){
       Video video = new Video();
       video.setTitle(title);
       return videoService.save(video);
   }

}
