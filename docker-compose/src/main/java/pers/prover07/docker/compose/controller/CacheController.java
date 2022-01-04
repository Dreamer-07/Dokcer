package pers.prover07.docker.compose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Prover07
 * @classname cacheController
 * @description TODO
 * @date 2022/1/4 14:18
 */

@RestController
public class CacheController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/getCache")
    public String getCache() {
        Long views = stringRedisTemplate.opsForValue().increment("views");
        return "test docker compose:" + views;
    }
}
