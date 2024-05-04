package com.myt.demoems01.controller;

import com.myt.demoems01.entity.Emp;
import com.myt.demoems01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    // 1 增：保存员工
    @PostMapping("save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    // 2 删：删除一个员工根据id
    @GetMapping("delete")
    public String delete(String id){
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    // 3 改：更新员工信息的方法
    @PostMapping("update")
    public String  update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }

    // 4 查全：查询所有
    @GetMapping("findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "/emp/emplist";
    }

    // 5 查一：根据id查询员工信息
    @GetMapping("findOne")
    public  String  findOne(String id,Model model){
        Emp emp = empService.findById(id);
        model.addAttribute("emp",emp);
        return "/emp/updateemp";
    }
}
