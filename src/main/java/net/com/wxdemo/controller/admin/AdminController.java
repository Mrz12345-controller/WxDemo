package net.com.wxdemo.controller.admin;

import net.com.wxdemo.domain.Video;
import net.com.wxdemo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/admin/api/v1/video")
public class AdminController {

    @Autowired
    private VideoService videoService;
    /**
     * 根据id删除
     * @param videoid
     * @return
     */
    @DeleteMapping("del_by_id")
    public int delById(@RequestParam(value="video_id",required = true) int videoid){
        return videoService.delete(videoid);
    }

    /**
     * 根据id更新
     * @param video
     * @return
     */
    @PutMapping("update_by_id")
    public int updateById(@RequestBody Video video){
        return videoService.update(video);
    }

    /**
     * 保存video
     * @param video
     * @return
     */
    @PostMapping("save")
    public Object save(@RequestBody Video video){
        return videoService.save(video);
    }

}
