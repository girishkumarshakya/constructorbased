package core.example.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("java/config.xml");
        SimpleMovieLister simpleMovieLister = context.getBean("simpleMovieLister",SimpleMovieLister.class);
        System.out.println(simpleMovieLister);
    }
}
