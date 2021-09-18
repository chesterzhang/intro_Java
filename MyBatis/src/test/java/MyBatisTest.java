import indi.chester.mybatis.dto.GoodsDTO;
import indi.chester.mybatis.entity.Goods;
import indi.chester.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyBatisTest {

    @Test
    public void testSqlSessionFactory() throws IOException {
        //导入配置文件
        Reader reader=Resources.getResourceAsReader("mybatis-config.xml");
        //创建 SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        //创建 SqlSession 对象
        SqlSession sqlSession =null;
        try{
            sqlSession =sqlSessionFactory.openSession();
            //创建 Connection 对象
            Connection connection=sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                sqlSession.close();//关闭连接池, 或者将连接回收
            }
        }

    }

    @Test
    public void testMyBatisUtils() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession = MyBatisUtils.openSession();
            Connection connection = sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

    }

    @Test
    public void testSelectAll() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List<Goods> GoodsList =sqlSession.selectList("goods.selectAll");
            for(Goods g: GoodsList){
                System.out.println(g.getTitle());
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectById() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods good=sqlSession.selectOne("goods.selectById",1000);
            System.out.println(good.getTitle());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectByPriceRange() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            HashMap<String, Integer> parmsMap=new HashMap<String, Integer>();
            parmsMap.put("min",100);
            parmsMap.put("max",500);
            parmsMap.put("limit",10);
            List<Goods> goodsList=sqlSession.selectList("goods.selectByPriceRange",parmsMap);
            for (Goods g: goodsList){
                System.out.println(g.getTitle());
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectGoodsMap() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();

            List<Map> goodsListMap=sqlSession.selectList("goods.selectGoodsMap");
            for (Map map: goodsListMap){
                System.out.println(map);
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectGoodsDTO() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List<GoodsDTO> goodsDTOList=sqlSession.selectList("goods.selectGoodsDTO");
            for (GoodsDTO g : goodsDTOList){
                System.out.println(g.getGoods().getTitle());
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

}
