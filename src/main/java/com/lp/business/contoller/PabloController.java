package com.lp.business.contoller;

import com.lp.business.model.entity.User;
import com.lp.business.json.ResultJson;
import com.lp.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 */
@RestController
public class PabloController {

    @Autowired
    private UserService userService;
    @GetMapping("/pablo")
    public ResultJson helloPablo(){
        User user =  userService.queryUser("lipeng");
        return ResultJson.success(user);
    }
}
