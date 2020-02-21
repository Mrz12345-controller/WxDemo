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

    /**
     * 分页接口
     * @param page 总页数，默认1页
     * @param size 每页记录数，默认10条
     * @return
     */
   @GetMapping("page")
    public Object findAll(@RequestParam(value = "page",defaultValue = "1")int page,
                          @RequestParam(value = "size",defaultValue = "10")int size){
       return videoService.findAll();
   }

    /**
     * 根据id查询
     * @param videoid
     * @return
     */
   @GetMapping("find_by_id")
    public Object findById(@RequestParam(value = "video_id",required = true)int videoid){
       return videoService.findById(videoid);
   }

}
