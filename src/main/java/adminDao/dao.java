package adminDao;

import adminEntity.Admin;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface dao {
    @Insert("insert into Admin(Aid,name,pwd,age,gender,qq,email,phone) values(#{Aid},#{name},#{pwd},#{age},#{gender},#{qq},#{email},#{phone})")
    void add(Admin admin) ;
    @Update("update Admin set pwd=#{pwd},age=#{age},gender=#{gender},qq=#{qq},email=#{email},phone=#{phone} where id=#{id}")
    void update(Admin admin);
    @Delete("delete from Admin where id=#{int}")
    void delete(int id);
    @Select("select * from Admin where Aid=#{Aid} and pwd=#{pwd}")
    Admin findByName(Admin admin);
    @Select("select * from Admin where id=#{int}")
    Admin findById(int id);
    @Select("select * from Admin")
    List<Admin> findAll() ;


}
