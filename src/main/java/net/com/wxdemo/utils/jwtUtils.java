package net.com.wxdemo.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import net.com.wxdemo.domain.User;

import java.util.Date;

public class jwtUtils {
    public static final String SUBJECT = "zmy niubi";
    //设置过期时间时长
    public static final long EXPIRE = 1000*60*60*24*7;
    //秘钥
    public static final String APPSERCET = "ZMY niubi";
    //生成Jwt
    public static String jsonWebJWT(User user){
        if(user == null || user.getId() == null || user.getName() == null || user.getHeadImg() == null){
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id",user.getId())
                .claim("name",user.getName())
                .claim("img",user.getHeadImg())
                .setIssuedAt(new Date())//开始时间
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))//过期时间
                .signWith(SignatureAlgorithm.HS256,APPSERCET).compact();
        return token;
    }

    public static Claims checkJWT(String token){
        try{
           final Claims claims = Jwts.parser().setSigningKey(APPSERCET).parseClaimsJws(token).getBody();
           return claims;
        }catch(Exception e){

        }
        return null;
    }
}
