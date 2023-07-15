package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class chap09 {

    @RequestMapping("/chap09")
    @ResponseBody
    public String sayHello(@RequestParam("name") String name) {
        return "인사말: 안녕하세요, " + name;
    }
}