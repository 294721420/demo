package com.example.demo;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@Slf4j
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    public class HelloController{
        @RequestMapping("/hello")
        public String hello() throws UnknownHostException {
            InetAddress localHost = InetAddress.getLocalHost();
            log.info("{}{}{}",localHost.getHostAddress(),localHost.getCanonicalHostName(),localHost.getHostName());
            return "hello world!";
        }
    }

}
