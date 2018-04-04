package com.bridgelabz.DIwithSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.bean.Communication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("Spring-configration.xml");
    	BeanFactory beanFactory = new XmlBeanFactory(resource);
    	Communication communication = (Communication) beanFactory.getBean("communication");
    	communication.readMessage();
    
    }
}
