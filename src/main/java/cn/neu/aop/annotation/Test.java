package cn.neu.aop.annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Calculation calculation = (Calculation) applicationContext.getBean("calculationImpl");
        int result = calculation.add(1, 2);
        System.out.println(result);
    }
}
