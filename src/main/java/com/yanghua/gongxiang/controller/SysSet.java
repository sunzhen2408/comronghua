package com.yanghua.gongxiang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SysSet {
    //更改
    @RequestMapping("/sys/sysset")
    public String showSysSet(){
        return "sys-set";
    }

    @RequestMapping("/user/sysuser")
    public String showSysUser(){
        return "sys-users";
    }

    @RequestMapping("/role/sysrole")
    public String showSysRole(){
        return "sys-role";
    }

    @RequestMapping("/data/sysdata")
    public String showSysData(){
        return "sys-data";
    }
}
