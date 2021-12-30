import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import indi.chester.mybatis.dto.GoodsDTO;
import indi.chester.mybatis.entity.Classroom;
import indi.chester.mybatis.entity.Goods;
import indi.chester.mybatis.entity.Student;
import indi.chester.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.ArrayList;
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
            //创建 SqlSession 对象, sqlSessionFactory 是 JDBC 的扩展类, 用于上节课交互
            sqlSession =sqlSessionFactory.openSession();
            //创建数据库连接对象
            Connection connection=sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (sqlSession!=null){
                //如果 mybatis-config.xml 里面 <dataSource type="POOLED">, 则是回收连接
                //如果 mybatis-config.xml 里面 <dataSource type="UNPOOLED">, 则是关闭连接
                sqlSession.close();
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
                System.out.println("{ title="+g.getGoods().getTitle() + ", category_name="+g.getCategoryName()+" }");
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
            System.out.println(goods.getGoodsId());
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
    public void testInsert2() throws Exception{
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
            int num =sqlSession.insert("goods.insert2",goods);
            System.out.println(num);
            //提交事务
            sqlSession.commit();
            System.out.println(goods.getGoodsId());
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
            Goods goods=sqlSession.selectOne("goods.selectById",2696);
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
            int num =sqlSession.delete("goods.delete",2695);
            sqlSession.commit();
            System.out.println(num);
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
            //尝试 SQL 注入攻击
            //parm.put("title", "'' or 1=1 or 1=''");

            //有的时候 使用原文
            parm.put("title", "亲润 孕妇护肤品豆乳大米盈润保湿胶原蚕丝面膜（18片装）");
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

    @Test
    public void testDynamicSQL() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Map parm = new HashMap();
            parm.put("categoryId",44);
            parm.put("currentPrice",500);

            List<Goods> goodsList=sqlSession.selectList("goods.dynamicSQL",parm);
            for (Goods g:goodsList) {
                System.out.println(g.getTitle()+" : "+g.getCategoryId()+ " : "+
                        g.getCurrentPrice());
            }

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    //一级缓存
    @Test
    public void testLv1Cache() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods1=sqlSession.selectOne("goods.selectById",1050);
            Goods goods2=sqlSession.selectOne("goods.selectById",1050);
            System.out.println("goods1.hashCode : "+goods1.hashCode());
            System.out.println("goods2.hashCode : "+goods2.hashCode());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods1=sqlSession.selectOne("goods.selectById",1050);
            Goods goods2=sqlSession.selectOne("goods.selectById",1050);
            System.out.println("goods1.hashCode : "+goods1.hashCode());
            System.out.println("goods2.hashCode : "+goods2.hashCode());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods1=sqlSession.selectOne("goods.selectById",1050);
            sqlSession.commit();
            Goods goods2=sqlSession.selectOne("goods.selectById",1050);
            System.out.println("goods1.hashCode : "+goods1.hashCode());
            System.out.println("goods2.hashCode : "+goods2.hashCode());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    //二级缓存
    @Test
    public void testLv2Cache() throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods1=sqlSession.selectOne("goods.selectById",1050);
            Goods goods2=sqlSession.selectOne("goods.selectById",1050);
            System.out.println("goods1.hashCode : "+goods1.hashCode());
            System.out.println("goods2.hashCode : "+goods2.hashCode());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods1=sqlSession.selectOne("goods.selectById",1050);
            Goods goods2=sqlSession.selectOne("goods.selectById",1050);
            System.out.println("goods1.hashCode : "+goods1.hashCode());
            System.out.println("goods2.hashCode : "+goods2.hashCode());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }


    @Test
    public void testPageHelper () throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            //查询第二页,每一页有10条数据
            PageHelper.startPage(2,10);
            Page<Goods> page = (Page) sqlSession.selectList("goods.selectPage");
            System.out.println("总页数 : "+page.getPages());
            System.out.println("总记录数 : "+page.getTotal());
            System.out.println("开始行号 : "+page.getStartRow());
            System.out.println("结束行号 : "+page.getEndRow());
            System.out.println("当前页码 : "+page.getPageNum());
            List<Goods> pageData = page.getResult();//当前页数据
            for (Goods g : pageData){
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
    public void testBatchInsert () throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List list=new ArrayList();
            for (int i = 0; i < 2; i++) {
                Goods g= new Goods();
                g.setTitle("批处理测试商品");
                g.setSubTitle("批处理测试子标题");
                g.setOriginalCost(100f);
                g.setCurrentPrice(50f);
                g.setDiscount(0.5f);
                g.setIsFreeDelivery(1);
                g.setCategoryId(43);
                list.add(g);
            }
            sqlSession.insert("goods.batchInsert", list);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

    }


    @Test
    public void testOneToMany () throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List<Classroom> list =sqlSession.selectList("classroom.selectOneToMany");

            for (Classroom c: list){
                for (Student s : c.getStudentList()){
                    System.out.println(s.getStudentName());
                }

            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

    }

    @Test
    public void testManyToOne () throws Exception{
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
//            List<Student> list =sqlSession.selectList("student.selectManyToOne");
//
//            for (Student s: list){
//                System.out.println(s.getClassroom().getClassroomId());
//
//            }
            Student s=sqlSession.selectOne("student.selectOne");
            System.out.println(s.getClassroomId());
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }

    }

}


