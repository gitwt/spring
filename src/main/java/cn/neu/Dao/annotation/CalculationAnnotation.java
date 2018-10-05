package cn.neu.Dao.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;
import java.util.List;

@Aspect
public class CalculationAnnotation {

    @Before("execution(* cn.neu.Dao.annotation.CalculationImpl.*(..))")
    public void before(JoinPoint join){
        //获得方法名
        String methodName = join.getSignature().getName();
        //获得参数列表
        List<Object> args = Arrays.asList(join.getArgs());
        System.out.println("前置通知方法名："+methodName+"\t参数列表："+args);
    }

    @After("execution(* cn.neu.Dao.annotation.CalculationImpl.*(..))")
    public void after(){
        System.out.println("后置通知");
    }


}
