package com.github.conagreen;

import com.github.conagreen.core.ComponentScan;
import com.github.conagreen.mvc.SpringApplication;

@ComponentScan(
        basePackage = "com.github.conagreen.app"
)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
