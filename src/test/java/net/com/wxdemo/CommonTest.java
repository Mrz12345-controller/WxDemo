package net.com.wxdemo;

import io.jsonwebtoken.Claims;
import net.com.wxdemo.domain.User;
import net.com.wxdemo.utils.jwtUtils;
import org.junit.jupiter.api.Test;

public class CommonTest {
    @Test
    public void test(){
        User user = new User();
        user.setId(11);
        user.setHeadImg("www.xdclass.net");
        user.setName("zmy");
        String token = jwtUtils.jsonWebJWT(user);
        System.out.println(token);
    }
    @Test
    public void testCheck(){
        String token = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ6bXkgbml1YmkiLCJpZCI6MTEsIm5hbWUiOiJ6bXkiLCJpbWciOiJ3d3cueGRjbGFzcy5uZXQiLCJpYXQiOjE1ODIzNTM5OTEsImV4cCI6MTU4Mjk1ODc5MX0.Jdbw9QlJ9773HPfQv4isPLNkqiSYHxUJh-2DEC-ThFc";
        Claims claims = jwtUtils.checkJWT(token);
        if(claims != null){
           String name = (String) claims.get("name");
           String img = (String) claims.get("img");
           int id = (Integer) claims.get("id");
           System.out.println(name);
           System.out.println(img);
           System.out.println(id);
        }else{
            System.out.println("解析失败，非法token");
        }
    }
}
