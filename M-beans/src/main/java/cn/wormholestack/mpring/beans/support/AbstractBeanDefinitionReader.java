package cn.wormholestack.mpring.beans.support;

import cn.wormholestack.mpring.core.io.DefaultResourceLoader;
import cn.wormholestack.mpring.core.io.ResourceLoader;


/**
 * @description： AbstractBeanDefinitionReader
 * @Author MRyan
 * @Date 2021/9/12 23:35
 * @Version 1.0
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {


    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

}
