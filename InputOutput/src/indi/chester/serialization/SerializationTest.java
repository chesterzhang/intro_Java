package indi.chester.serialization;

import java.io.*;

// 对 Student 进行 序列化 和 反序列化
public class SerializationTest {

    public static void main(String[] args) {
        Student stu1=new Student(20210010,"Tom");

        //序列化
        try {
            FileOutputStream fos = new FileOutputStream("Tom.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(stu1);
            //清空缓冲,关闭窗口
            fos.flush();
            oos.flush();
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //反序列化
        try {
            FileInputStream fis=new FileInputStream("Tom.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stu2 = (Student)ois.readObject();
            //关闭窗口
            fis.close();
            ois.close();
            System.out.println(stu2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

