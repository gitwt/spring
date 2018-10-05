package cn.neu.aop.xml;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import java.util.List;


public class CalculationAnnotation {

    public void before(JoinPoint join){
        //获得方法名
        String methodName = join.getSignature().getName();
        //获得参数列表
        List<Object> args = Arrays.asList(join.getArgs());
        System.out.println("前置通知方法名："+methodName+"\t参数列表："+args);
    }

    public void after(){
        System.out.println("后置通知");
    }


}
