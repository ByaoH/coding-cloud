package com.l.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author luliangyu
 * @date 2021-07-09 10:09
 */
@RestController
public class HelloController {

    @GetMapping
    public String hello() {
        return "hello";
    }
}
