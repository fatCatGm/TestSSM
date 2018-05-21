package com.springmvc.controller;

import com.springmvc.pojo.Admin;
import com.springmvc.service.AdminService;
import com.springmvc.utilis.Result;
import com.springmvc.utilis.ResultUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class main {

    @Resource
    AdminService adminService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "hello world";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.POST)
    @ResponseBody
    public int insertUser(Admin admin) {
        return adminService.insertAdmin(admin);

    }

    @RequestMapping(value = "/admin/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Admin getUser(@PathVariable Integer id) {
        System.out.println(adminService.getAdmin(id).getName());
        return adminService.getAdmin(id);




    }

    @RequestMapping(value = "/admin/user", method = RequestMethod.GET)
    @ResponseBody
    public List<Admin> getAllUser() {

        System.out.println(adminService.selectAllUser());
        return adminService.selectAllUser();
    }

    @RequestMapping(value = "admin/usermap", method = RequestMethod.GET)
    @ResponseBody
    public Result  userMap(){
        List<Admin> resultadmin=adminService.selectAllUser();
//        Result result=Result.success(resultadmin);
        Result result=ResultUtil.success(resultadmin);
        return result;

    }
}
