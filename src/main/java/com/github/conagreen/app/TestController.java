package com.github.conagreen.app;

import com.github.conagreen.core.Controller;
import com.github.conagreen.core.RequestMapping;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public void sayHello(HttpServletRequest request, HttpServletResponse response) {

    }
}
