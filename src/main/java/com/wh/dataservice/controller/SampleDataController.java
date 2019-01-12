package com.wh.dataservice.controller;

import com.wh.dataservice.entity.User;
import jdk.nashorn.internal.parser.JSONParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/sample")
@RestController
public class SampleDataController {

    @RequestMapping(value = {"", "/test"})
    public String testRequest(HttpServletRequest request) {
        return "SampleDataController: your request is " + request.getRequestURL();
    }

    @RequestMapping("/one-string")
    public String getSampleString() {
        return "this is a sample string.";
    }

    @RequestMapping("/one-jsonObject")
    public Object getSampleJosn() {
        return User.builder()
                .uid(1L)
                .userName("李云龙")
                .passWord("123456")
                .role("独立团团长啊")
                .build();

    }

    @RequestMapping("/one-number")
    public Integer getSampleNumber() {
        return 1;
    }

    @RequestMapping("/list-string")
    public List<String> getSampleListString() {
        return new ArrayList<>(Arrays.asList("1", "2", "3", "4"));
    }

}
