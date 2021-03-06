package cn.wormholestack.mpring.context.test.processor;

import cn.wormholestack.mpring.espression.BeansException;
import cn.wormholestack.mpring.context.test.beans.UserService;
import cn.wormholestack.mpring.beans.factory.BeanPostProcessor;

/**
 * @description： MyBeanPostProcessor
 * @Author MRyan
 * @Date 2021/9/13 23:51
 * @Version 1.0
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setName("更改之前：M");
            System.out.println("postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setName("更改之后：M");
            System.out.println("postProcessAfterInitialization");
        }
        return bean;
    }

}