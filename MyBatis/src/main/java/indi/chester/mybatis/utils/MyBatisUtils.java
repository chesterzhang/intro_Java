package indi.chester.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * MyBatisUtils 工具类, 创建全局唯一的SqlSessionFactory对象
 */

public class MyBatisUtils {
    private static SqlSessionFactory sqlSessionFactory=null;

    static {
        Reader reader= null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);//类初始化异常
        }
    }

    public static SqlSession openSession(){
        return sqlSessionFactory.openSession();
    }

    public static  void closeSession(SqlSession session){
        if (session!=null){
            session.close();
        }
    }
}
