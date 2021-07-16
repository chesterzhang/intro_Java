package indi.chester.methoddemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo {

    public static void main(String[] args) {

        try {
            //将 指定 类加载到 JVM, 并返回Class 对象
            Class empClass = Class.forName("indi.chester.methoddemo.Employee");

            // 通过 Class 对象.getConstructor() 获得 Constructor 对象
            Constructor empConstructor= empClass.getConstructor(new Class[]{int.class, String.class,int.class});

            //通过Constructor对象.newInstance() 调代参构造函数 创建对象
            Employee emp1=(Employee) empConstructor.newInstance( new Object[] {20200189,"Tom",10000});

            //通过 Class 对象.getMethod() 获得 Method
            Method updateSalMethod= empClass.getMethod("updateSal",new Class[]{int.class});

            //通过Method 对象.invoke 可以执行某个对象的函数
            updateSalMethod.invoke(emp1,new Object[]{2000});
            System.out.println(emp1);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
