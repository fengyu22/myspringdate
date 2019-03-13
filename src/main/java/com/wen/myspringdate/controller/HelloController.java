package com.wen.myspringdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author wenhua
 * @date 2019/2/28 - 13:00
 */
@RestController
public class HelloController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/hello")
    public String selectdep(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        System.out.println(maps.get(0));
        return "success";
    }
}
