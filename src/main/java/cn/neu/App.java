package cn.neu;

import cn.neu.Dao.Calculation;
import cn.neu.Dao.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Calculation calculation = (Calculation) applicationContext.getBean("calculationImpl");
        int result = calculation.add(1, 2);
        System.out.println(result);
    }
}
