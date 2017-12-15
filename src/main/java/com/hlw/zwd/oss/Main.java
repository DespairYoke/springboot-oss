package com.hlw.zwd.oss;

import com.hlw.zwd.oss.config.OssConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication(scanBasePackages = {"com.hlw.zwd"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
