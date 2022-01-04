package pers.prover07.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Prover07
 * @classname HelloController
 * @description TODO
 * @date 2022/1/4 8:55
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

}
