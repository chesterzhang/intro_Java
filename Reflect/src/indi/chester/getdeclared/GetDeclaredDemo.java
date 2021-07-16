package indi.chester.getdeclared;





import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;


public class GetDeclaredDemo {
    public static void main(String[] args) {


        try {
            //将 指定 类加载到 JVM, 并返回Class 对象
            Class empClass = Class.forName("indi.chester.getdeclared.Employee");
            // 通过 Class 对象.getConstructor() 获得 Constructor 对象
            Constructor empConstructor= empClass.getConstructor(new Class[]{int.class, String.class});

            //通过Constructor对象.newInstance() 调代参构造函数 创建对象
            Employee emp1=(Employee) empConstructor.newInstance( new Object[] {20200189,"Tom"});


            // 通过 Class 对象.getDeclaredFields() 获得 Fields 列表
            Field[] fileds=empClass.getDeclaredFields();

            for (Field field: fileds){

                if (field.getModifiers()==1){//public
                    Object val=field.get(emp1);
                    System.out.println(field.getName()+" :"+val);
                }else if (field.getModifiers()==2){
                    String methodName="get"+field.getName().substring(0,1).toUpperCase()+field.getName().substring(1);
                    Method getMethod=empClass.getMethod(methodName);
                    System.out.println(field.getName()+" :"+getMethod.invoke(emp1));
                }
            }
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
