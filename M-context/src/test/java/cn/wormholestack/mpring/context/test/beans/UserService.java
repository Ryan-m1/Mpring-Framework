package cn.wormholestack.mpring.context.test.beans;

import cn.wormholestack.mpring.context.aware.ApplicationContextAware;
import cn.wormholestack.mpring.espression.BeansException;
import cn.wormholestack.mpring.context.ApplicationContext;
import cn.wormholestack.mpring.beans.factory.BeanFactory;
import cn.wormholestack.mpring.beans.support.DisposableBean;
import cn.wormholestack.mpring.beans.factory.InitializingBean;
import cn.wormholestack.mpring.beans.factory.aware.BeanClassLoaderAware;
import cn.wormholestack.mpring.beans.factory.aware.BeanFactoryAware;
import cn.wormholestack.mpring.beans.factory.aware.BeanNameAware;

/**
 * @description： UserService
 * @Author MRyan
 * @Date 2021/9/12 18:46
 * @Version 1.0
 */
public class UserService implements InitializingBean, DisposableBean, BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {

    private String name;

    private UserDao userDao;

    public void queryUser() {
        System.out.println("【查询用户信息】:" + userDao.queryUser(name));
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getName() {
        return name;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【执行：UserService.destroy】");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【执行：UserService.afterPropertiesSet】");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) throws BeansException {
        System.out.println("【ClassLoader】:" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("【BeanFactory】:" + beanFactory);
    }

    @Override
    public void setBeanName(String beanName) throws BeansException {
        System.out.println("【BeanName】:" + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("【ApplicationContext:】" + applicationContext);
    }
}
