package indi.chester.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MethodChecker {
    //ProceedingJoinPoint 是 JoinPoint 的升级版, 在原有功能外, 还可以控制目标方法是否执行
    public Object check(ProceedingJoinPoint pjp) throws  Throwable{
        try {
            long startTime = new Date().getTime();
            Object ret = pjp.proceed();//执行目标方法
            long endTime = new Date().getTime();
            long duration = endTime - startTime;
            if (duration>=1000){
                String className = pjp.getTarget().getClass().getName();//获取目标类的名称
                String methodName = pjp.getSignature().getName();//获取目标方法的名称
                SimpleDateFormat sdt= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
                String now = sdt.format(new Date());
                System.out.println("========"+now + " : "+ className+" : "+methodName+ " ( "+ duration +" ms)"+"========");
            }
            return ret;
        } catch (Throwable throwable) {
            System.out.println("Exception message : "+ throwable.getMessage());
            throw throwable;
        }
    }
}
