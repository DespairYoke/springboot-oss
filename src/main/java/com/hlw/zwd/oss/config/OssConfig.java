package com.hlw.zwd.oss.config;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.ByteArrayInputStream;
import java.io.File;

@Configuration
public class OssConfig {
    @Bean
    @ConfigurationProperties(prefix = "zwd.oss")
    public Account account() {
        return new Account();
    }

}