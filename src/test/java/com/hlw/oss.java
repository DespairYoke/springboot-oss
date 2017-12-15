package com.hlw;

import com.hlw.zwd.oss.Main;
import com.hlw.zwd.oss.utils.OssUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Main.class})
public class oss {
    @Autowired
    OssUtil ossUtil;


    @Test
    public void testObject(){
        System.out.println(ossUtil.updateObject("huluwa-test","zwd/hhh","hello world"));
    }
    @Test
    public void TestFile(){
        System.out.println(ossUtil.updateFile("huluwa-test","zwd/pic.jpg","/Users/zwd-admin/Downloads/pic.jpg"));
    }
}
