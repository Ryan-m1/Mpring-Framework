package cn.wormholestack.mpring.beans.support;

import cn.wormholestack.mpring.core.io.Resource;
import cn.wormholestack.mpring.core.io.ResourceLoader;
import cn.wormholestack.mpring.espression.BeansException;


/**
 * @description： 读取bean定义信息的抽象接口
 * @Author MRyan
 * @Date 2021/9/12 23:26
 * @Version 1.0
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

     void loadBeanDefinitions(String[] locations) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

}
