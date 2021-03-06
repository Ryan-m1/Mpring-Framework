package cn.wormholestack.mpring.core.test;

import cn.hutool.core.io.IoUtil;
import cn.wormholestack.mpring.core.io.DefaultResourceLoader;
import cn.wormholestack.mpring.core.io.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description： ResourceLoaderTest
 * @Author MRyan
 * @Date 2021/9/12 23:16
 * @Version 1.0
 */
public class ResourceLoaderTest {

    @Test
    public void TEST_RESOURCE_LOADER() throws IOException {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        //加载classpath下的资源
        Resource resource = resourceLoader.getResource("classpath:Mpring.txt");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);

        //加载文件系统资源
        resource = resourceLoader.getResource("src/test/resources/Mpring.txt");
        inputStream = resource.getInputStream();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);

        //加载url资源
        resource = resourceLoader.getResource("http://www.mryan.xyz");
        inputStream = resource.getInputStream();
        content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
}
