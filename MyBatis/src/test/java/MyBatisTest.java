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

    @Test
    public void testInsert() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods= new Goods();
            goods.setTitle("MyBatis测试商品");
            goods.setSubTitle("MyBatis测试商品子标题");
            goods.setOriginalCost(200f);
            goods.setCurrentPrice(100f);
            goods.setDiscount(0.5f);
            goods.setIsFreeDelivery(1);
            goods.setCategoryId(43);


            //insert 方法返回代表本次成功插入的记录总数
            int num =sqlSession.insert("goods.insert",goods);
            System.out.println(num);
            //提交事务
            sqlSession.commit();

        }catch (Exception e){
            if (sqlSession!=null){
                sqlSession.rollback();
            }
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testUpdate() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",2693);
            goods.setTitle("更新测试商品");
            int num =sqlSession.update("goods.update", goods);
            System.out.println(num);
            sqlSession.commit();
        }catch (Exception e){
            if (sqlSession!=null){
                sqlSession.rollback();
            }
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testDelete() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            int num =sqlSession.delete("goods.delete",2693);

            sqlSession.commit();
        }catch (Exception e){
            if (sqlSession!=null){
                sqlSession.rollback();
            }
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectByTitle() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Map parm = new HashMap();
            //原文传值 SQL 注入攻击
            //WHERE title='' or 1=1 or title='亲润 孕妇护肤品豆乳大米盈润保湿胶原蚕丝面膜（18片装）'
            //parm.put("title", "'' or 1=1 or title='亲润 孕妇护肤品豆乳大米盈润保湿胶原蚕丝面膜（18片装）'");

            //使用预编译
            //WHERE title="'' or 1=1 or title='亲润 孕妇护肤品豆乳大米盈润保湿胶原蚕丝面膜（18片装）'"
            parm.put("title", "亲润 孕妇护肤品豆乳大米盈润保湿胶原蚕丝面膜（18片装）");

            //有的时候 使用原文
            parm.put("order", "ORDER BY goods_id DESC");
            List<Goods> goodsList= sqlSession.selectList("goods.selectByTitle", parm);
            for (Goods g: goodsList){
                System.out.println(g.getGoodsId() +" " + g.getTitle());
            }

        }catch (Exception e){
            if (sqlSession!=null){
                sqlSession.rollback();
            }
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

}
