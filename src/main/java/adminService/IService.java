package adminService;

import adminEntity.Admin;

import java.util.List;

public interface IService {
    Admin login(Admin admin) throws Exception;
    void add(Admin admin) throws Exception;
    void update(Admin admin) throws Exception;
    void delete(int id) throws Exception;
    //Admin findByAid(Admin admin);
    List<Admin> findAll() throws Exception;
    Admin findById(int id);




}
