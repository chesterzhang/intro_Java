package indi.chester.constructordemo;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo {

    public static void main(String[] args) {

        try {
            //将 指定 类加载到 JVM, 并返回Class 对象
            Class empClass = Class.forName("indi.chester.constructordemo.Employee");

            // 通过 Class 对象.getConstructor() 获得 Constructor 对象
            Constructor empConstructor= empClass.getConstructor(new Class[]{int.class, String.class});

            //通过Constructor对象.newInstance() 调行代参构造函数
            Employee  emp1=(Employee ) empConstructor.newInstance( new Object[] {20200189,"Tom"});
            System.out.println(emp1);

        } catch (ClassNotFoundException e) {// 找不到类 异常
            e.printStackTrace();
        } catch (NoSuchMethodException e) {// 找不到方法 异常
            e.printStackTrace();
        } catch (InstantiationException e) {// 无法实例化 异常
            e.printStackTrace();
        } catch (IllegalAccessException e) {// 无法访问 异常
            e.printStackTrace();
        } catch (InvocationTargetException e) {// 调用方法内部出现异常
            e.printStackTrace();
        }


    }
}
