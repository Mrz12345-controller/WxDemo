package net.com.wxdemo.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class MybatisConfig {
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        //设置为true时，将RowBounds第一个参数offset当成pageNum页码
        p.setProperty("RowBoundsWithCount","true");
        //设置成true，使用RowBounds分页会进行count查询
        p.setProperty("RowBoundsWithCount","true");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
