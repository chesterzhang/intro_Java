package indi.chester.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {
    @PostMapping("user_info_upload")
    public String userInfoUpload()  {
        return "用户权限已经通过";
    }

}
