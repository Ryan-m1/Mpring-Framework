package cn.wormholestack.mpring.context.aware;

import cn.wormholestack.mpring.espression.BeansException;
import cn.wormholestack.mpring.context.ApplicationContext;
import cn.wormholestack.mpring.beans.factory.Aware;

/**
 * @description： 实现此接口，既能感知到所属的 ApplicationContext
 * @Author MRyan
 * @Date 2021/9/16 22:47
 * @Version 1.0
 */
public interface ApplicationContextAware extends Aware {


    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;

}
