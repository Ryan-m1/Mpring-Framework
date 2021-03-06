package cn.wormholestack.mpring.beans.support;

import cn.wormholestack.mpring.espression.BeansException;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import cn.wormholestack.mpring.beans.factory.BeanFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @description： CGLIB简单InstantiationStrategy实现 使用CGLIB动态生成子类
 * @Author MRyan
 * @Date 2021/9/12 13:25
 * @Version 1.0
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {


    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }

    @Override
    public Object instantiate(BeanDefinition bd, String beanName, Constructor<?> ctor, Object... args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(bd.getBeanClass());
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        if (null == ctor) return enhancer.create();
        return enhancer.create(ctor.getParameterTypes(), args);
    }

    @Override
    public Object instantiate(BeanDefinition bd, String beanName, BeanFactory owner) throws BeansException {
        return null;
    }

    @Override
    public Object instantiate(BeanDefinition bd, String beanName, BeanFactory owner, Object factoryBean, Method factoryMethod, Object... args) throws BeansException {
        return null;
    }
}
