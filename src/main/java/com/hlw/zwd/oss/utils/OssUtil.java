package com.hlw.zwd.oss.utils;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectResult;
import com.hlw.zwd.oss.config.Account;
import com.hlw.zwd.oss.config.OssConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.File;

    @Service
    @Import({OssConfig.class})
    public class OssUtil {

    @Autowired
    private Account account;


        public String updateObject(String buckName, String fileName, Object object) {
            OSSClient ossClient = new OSSClient(account.getEndpoint()
                    , account.getAccessKeyId(), account.getAccessKeySecret());
            PutObjectResult putObjectResult = ossClient.putObject(buckName, fileName, new ByteArrayInputStream(object.toString().getBytes()));
            ossClient.shutdown();
            return putObjectResult.getETag();

    }

    public String updateFile(String buckName, String fileName, String localFileName) {
        OSSClient ossClient = new OSSClient(account.getEndpoint()
                , account.getAccessKeyId(), account.getAccessKeySecret());
        PutObjectResult putObjectResult = ossClient.putObject(buckName, fileName, new File(localFileName));
        ossClient.shutdown();
        return putObjectResult.getETag();
    }

}
