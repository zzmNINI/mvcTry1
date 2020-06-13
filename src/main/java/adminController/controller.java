package adminController;

import adminEntity.Admin;
import adminService.IService;
import adminService.impl.ServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import adminDao.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("/controller")
public class controller {
    @Autowired
    private IService IService;


    @RequestMapping("/login")
    public void login (HttpServletRequest request, HttpServletResponse response) throws Exception{
        Admin admin=new Admin();
        admin.setAid(request.getParameter("Aid"));
        admin.setPwd(request.getParameter("pwd"));
        admin=IService.login(admin);
        if(admin!=null){
            admin=null;
            response.sendRedirect(request.getContextPath()+"/controller/findAll");

        }
        else {
            //request.setAttribute("message", "error");
            response.sendRedirect(request.getContextPath()+"/index.jsp?message=error");

        }
        return;
    }
    @RequestMapping("/findAll")
    public String findAll(Model model) throws Exception {
        List<Admin> ads=null;
        ads=IService.findAll();
        model.addAttribute("listAdmin",ads);
        return "listAdmin";
    }

    @RequestMapping("/update")
    public void update(HttpServletRequest request,HttpServletResponse response) throws Exception{
        Admin admin= new Admin();
        admin.setPwd(request.getParameter("pwd"));
        admin.setGender(request.getParameter("gender"));
        admin.setAge(Integer.parseInt(request.getParameter("age")));
        admin.setQq(request.getParameter("qq"));
        admin.setEmail(request.getParameter("email"));
        admin.setPhone(request.getParameter("phone"));
        admin.setId(Integer.parseInt(request.getParameter("id")));
        IService.update(admin);
        admin=null;
        response.sendRedirect(request.getContextPath()+"/controller/findAll");
        return;

    }
    @RequestMapping("/delete")
    public void delete(HttpServletResponse response,HttpServletRequest request) throws Exception{
        IService.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect(request.getContextPath()+"/controller/findAll");
        return;
    }

    @RequestMapping("/add")
    public void add(HttpServletResponse response,HttpServletRequest request) throws Exception{
        Admin admin= new Admin();
        admin.setPwd(request.getParameter("pwd"));
        admin.setGender(request.getParameter("gender"));
        admin.setAge(Integer.parseInt(request.getParameter("age")));
        admin.setQq(request.getParameter("qq"));
        admin.setEmail(request.getParameter("email"));
        admin.setPhone(request.getParameter("phone"));
        admin.setAid(request.getParameter("Aid"));
        admin.setName(request.getParameter("name"));
        IService.add(admin);
        admin=null;
        response.sendRedirect(request.getContextPath()+"/controller/findAll");
        return;
    }
    @RequestMapping("/updateView")
    public String updateView(HttpServletRequest request,Model model){
        model.addAttribute("updateAdmin",IService.findById(Integer.parseInt(request.getParameter("id"))));
        return "updateAdmin";
    }
    @RequestMapping("/addView")
    public String addView(){
        return "addAdmin";
    }

    @RequestMapping("/end")
    public void end(HttpServletResponse response,HttpServletRequest request)throws Exception{
        response.sendRedirect(request.getContextPath());
        return;
    }

}
