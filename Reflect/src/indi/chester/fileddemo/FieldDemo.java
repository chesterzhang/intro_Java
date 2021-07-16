package indi.chester.fileddemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldDemo {

    public static void main(String[] args) {

        try {
            //将 指定 类加载到 JVM, 并返回Class 对象
            Class empClass = Class.forName("indi.chester.fileddemo.Employee");
            // 通过 Class 对象.getConstructor() 获得 Constructor 对象
            Constructor empConstructor= empClass.getConstructor(new Class[]{int.class, String.class,String.class});

            //通过Constructor对象.newInstance() 调行代参构造函数
            Employee emp1=(Employee) empConstructor.newInstance( new Object[] {20200189,"Tom","sales"});

            // Class对象.getField 获取公有的成员变量对应的 Field对象
            Field dnameField = empClass.getField("dname");

            //field 对象.get(obj) 获得指定对象的 成员变量
            String empDname = (String) dnameField.get(emp1);
            System.out.println("Tom 部门为: "+ empDname);

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
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

    }

}
