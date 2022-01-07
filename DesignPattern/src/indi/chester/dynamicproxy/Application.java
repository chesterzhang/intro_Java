package indi.chester.dynamicproxy;

import java.lang.reflect.Proxy;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl()  ;
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler(userService);

        //动态创建代理类
        UserService userServiceProxy = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                invocationHandler);
        userServiceProxy.createUser();
    }
}
