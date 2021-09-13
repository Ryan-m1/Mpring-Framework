package org.mryan;

import org.mryan.factory.DefaultListableBeanFactory;
import org.mryan.factory.xml.XmlBeanDefinitionReader;

/**
 * @description： AbstractXmlApplicationContext
 * @Author MRyan
 * @Date 2021/9/13 21:19
 * @Version 1.0
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    protected abstract String[] getConfigLocations();
}
