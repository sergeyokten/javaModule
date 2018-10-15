package demo52_JWT;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String token = Jwts.builder()
                .setSubject("room 404")
                .signWith(SignatureAlgorithm.HS512, "keyword".getBytes())
                .setExpiration(new Date(System.currentTimeMillis() + 4000))
                .compact();

        System.out.println(token);

        Thread.sleep(1000);

        String subject = Jwts.parser()
                .setSigningKey("keyword".getBytes())
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
        System.out.println(subject);

    }
}
