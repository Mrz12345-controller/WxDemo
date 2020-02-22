package net.com.wxdemo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.com.wxdemo.domain.Video;
import net.com.wxdemo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
       PageHelper.startPage(page,size);
       List<Video> list = videoService.findAll();
       PageInfo<Video> pageInfo = new PageInfo<>(list);
       //得到的pageInfo进行封装
       Map<String, Object> data = new HashMap<>();
       data.put("total_size",pageInfo.getTotal());//总条数
       data.put("total_page",pageInfo.getPages());//总页数
       data.put("current_page",pageInfo.getPageNum());//当前页
       data.put("data",pageInfo.getList());//当前数据
       return data;
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
