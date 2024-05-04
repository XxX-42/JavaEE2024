package com.myt.demoems01.controller;

import com.myt.demoems01.entity.User;
import com.myt.demoems01.service.UserService;
import com.myt.demoems01.utils.ValidateImageCodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("logout")
    public String logout(HttpSession session){
//        session.removeAttribute("user");
        session.invalidate(); // 失效处理
        return "redirect:/login.jsp";

    }

    //开发用户登录
    @RequestMapping("login")
    public String login(String username,String password,HttpSession session){
        User user = userService.login(username, password);
//        System.out.println(user.toString());
        //判断  user 为空  用户户名密码错误
        //不为空  登录成功
        if(user!=null){
            // 存作用域
            session.setAttribute("user",user);
            // 防止抖动登录，成功后重定向到主管理界面
            return "redirect:/emp/findAll";//查询员工的所有
        }else{
            return "redirect:/login.jsp";
        }

    }


    //开发用户注册
    @PostMapping("regist")
    public String regist(User user,String code,HttpSession session){
        System.out.println("user = " + user);
        System.out.println(code);
        System.out.println(session.getAttribute("code").toString());
        //1.判断验证码是否通过
        if(session.getAttribute("code").toString().equalsIgnoreCase(code)){
            //2.通过之后注册
            userService.save(user);
            // 更新操作后，一定是重定向
            return "redirect:/login.jsp";
        }else{//3.验证码不通过 直接回到注册页面
            return "redirect:/regist.jsp";
        }
    }

    //生成验证码
    @GetMapping("getImage")
    public void getImage(HttpSession sesssion, HttpServletResponse response) throws IOException {
        // 1 生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        // 2 将验证码方式session
        sesssion.setAttribute("code",securityCode);
        // 3 生成图片
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        // 4 输出图片  通过响应方式输出
        ServletOutputStream os = response.getOutputStream();
        // 5 调用工具类,推流给出响应
        ImageIO.write(image,"png",os);
    }
}