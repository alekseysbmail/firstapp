package com.testapp.firstapp.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        String res = "<html><body><table border='1'>";
        for (int i=0; i<10; i++)
        {
            res += "<tr><td>" + i + "</td></tr>";
        }
        res += "</table></body></html>";
        return (res);

    }

}


