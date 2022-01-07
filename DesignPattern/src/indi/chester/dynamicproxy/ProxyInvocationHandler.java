package indi.chester.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyInvocationHandler implements InvocationHandler {
    private Object target;//被代理的对象
    public ProxyInvocationHandler(Object target){
        this.target = target;
    }

    /**
     * 对目标方法进行增强
      * @param proxy 代理类对象
     * @param method 目标方法对象
     * @param args 目标方法实参
     * @return 目标方法运行后的返回值
     * @throws Throwable 目标方法抛出的异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行 额外任务");
        Object ret = method.invoke(target,args);//调用目标方法
        return ret;
    }
}
