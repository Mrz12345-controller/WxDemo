package net.com.wxdemo.provider;

import net.com.wxdemo.domain.Video;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.jdbc.SQL;

public class VideoProvider {
    public String updateVideo(final Video video){
        return new SQL(){{
            UPDATE("video");
            if(video.getTitle()!=null){
                SET("title=#{title}");
            }
            if(video.getSummary()!=null){
                SET("summary=#{summary}");
            }
            if(video.getCoverImg()!=null){
                SET("cover_img=#{CoverImg}");
            }
            if(video.getOnline()!=null){
                SET("online=#{online}");
            }
            if(video.getPoint()!=null){
                SET("point=#{point}");
            }
            if(video.getPrice()!=null){
                SET("price=#{price}");
            }
            if(video.getViewNum()!=null){
                SET("view_num=#{ViewNum}");
            }
            WHERE("id=#{id}");
        }}.toString();
    }
}
