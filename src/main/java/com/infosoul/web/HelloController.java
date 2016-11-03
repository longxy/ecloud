package com.infosoul.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * spring boot demo
 *
 * @author longxy
 * @version V1.0
 * @date 2016-11-01 14:31
 */
//@RestController // 用户接口
@Controller  // 用于页面渲染
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map){
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板的名称，对应 src/main/resources/templates/index.html
        return "index";
    }
}
