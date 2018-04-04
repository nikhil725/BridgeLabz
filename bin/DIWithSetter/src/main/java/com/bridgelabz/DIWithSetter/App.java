package com.bridgelabz.DIWithSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bridgelabz.dto.Communication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource resource = new ClassPathResource("spring-config.xml");
    	BeanFactory factory = new XmlBeanFactory(resource);
    	Communication communication = (Communication) factory.getBean("communication");
    	communication.communicate();
    	
    }
}
