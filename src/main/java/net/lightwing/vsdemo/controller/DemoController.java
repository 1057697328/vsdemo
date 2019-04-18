package net.lightwing.vsdemo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 */
@RestController
public class DemoController{
    @RequestMapping("/hello")
    public Map<String,Object> Hello(){
        Map<String,Object> map = new HashMap<>();
        map.put("name", "Visual Studio Code");
        map.put("data", "nothing");
        return map;
    }
}
