package indi.chester.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.Map;

@RestController
@RequestMapping("restful")
@Slf4j
public class RestfulController {

    @GetMapping("{zoneId}/get")
    public String getMethod(@PathVariable("zoneId") String zoneId, @RequestParam("id") String id){
        log.info(zoneId);
        log.info(id);
        return "查询操作";
    }

    @PostMapping("post")
    public String postMethod(@RequestBody Map<String, Object> requestBody,
                             @RequestHeader("token") String token,
                             @CookieValue("clientId") String clientId,
                             HttpServletRequest request){
        log.info("token="+ token);
        log.info("clientId="+ clientId);
        log.info("request body="+ requestBody);
        log.info("token="+ request.getHeader("token"));
        return "新增/保密查询操作";
    }

    @PutMapping("put")
    public String putMethod(){
        return "更改操作";
    }

    @DeleteMapping("delete")
    public String deleteMethod(){
        return "删除操作";
    }

}
