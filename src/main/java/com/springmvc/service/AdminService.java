package com.springmvc.service;

import com.springmvc.dao.AdminMapper;
import com.springmvc.pojo.Admin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("AdminService")

public class AdminService {
    @Resource
    private AdminMapper adminMapper;


    public Admin getAdmin(int id) {
        Admin a = this.adminMapper.selectByPrimaryKey(id);
        if (a != null) {
            return a;
        }
        return null;
    }

    public int insertAdmin(Admin admin) {
        return this.adminMapper.insert(admin);
    }
 /**
    *
    * @params:
    * @return:  返回全部数据
    * @date: 2018/5/17 11:11
    */
    public List<Admin> selectAllUser() {
       List<Admin> all = this.adminMapper.selectAllUser();
        if (all != null) {
            return all;
        }
        return null;
    }
}
