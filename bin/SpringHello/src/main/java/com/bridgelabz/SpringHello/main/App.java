package com.bridgelabz.SpringHello.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.SpringHello.dto.HelloWordImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Resource resource=new ClassPathResource("helloworld-config.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	HelloWordImpl helloWordImpl = (HelloWordImpl) beanFactory.getBean("helloWorldBean");
    	helloWordImpl.sayHello("Nikhil");
    }
}
