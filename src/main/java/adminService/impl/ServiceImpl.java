package adminService.impl;

import adminDao.dao;
import adminEntity.Admin;
import adminService.IService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
@Service("IService")
public class ServiceImpl implements IService {
    @Autowired
    private dao dao;



    /*private SqlSession session;
    private InputStream in;
    private dao Dao;
    public void start() throws Exception{
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        dao Dao = session.getMapper(dao.class);
    }
    public void end() throws Exception{
        // 关闭资源
        session.close();
        in.close();
    }
*/
    public Admin login(Admin admin) {
        System.out.println("用户登录中");

        Admin admin1= dao.findByName(admin);

        return admin1;


    }


    public void add(Admin admin) {
        System.out.println("添加用户...");

        dao.add(admin);


    }


    public void update(Admin admin) {
        System.out.println("更改用户...");

        dao.update(admin);

    }


    public void delete(int id)  {
        System.out.println("删除用户...");

        dao.delete(id);

    }

    public List<Admin> findAll() {
        System.out.println("查询所有用户...");

        List<Admin> ads=dao.findAll();

        return ads;
    }
    public Admin findById(int id){
        System.out.println("查询某个用户");
        Admin admin=dao.findById(id);
        return admin;
    }
}
