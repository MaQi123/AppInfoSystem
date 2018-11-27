package cn.appsys.controller.develop;

import cn.appsys.service.developer.DevUserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


@Controller
@RequestMapping(value = "/dev")
public class DevUserController {
    @Resource
    private DevUserService service;
    private Logger logger=Logger.getLogger(DevUserController.class);

    @RequestMapping(value = "/login")
    public String login(){
        logger.debug("=============跳转devuser登陆界面=============");
    return "devlogin";
    }


}
