package com.byh.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.byh.demo.util.JsonUtil;
import io.lettuce.core.api.reactive.RedisHashReactiveCommands;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/administrative_region")
public class AdministrativeRegionController {

    @GetMapping("/test")
    public String test(){
        //返回的json
            JSONArray retust=new JSONArray();
            //解析全部数据
            String path = JsonUtil.class.getClassLoader().getResource("static/china_city_4_class.json").getPath();
            String jsonStr = JsonUtil.readJsonFile(path);
            JSONArray jobj = JSON.parseArray(jsonStr);
            JSONArray j1=new JSONArray();
        return jsonStr;
    }

}
