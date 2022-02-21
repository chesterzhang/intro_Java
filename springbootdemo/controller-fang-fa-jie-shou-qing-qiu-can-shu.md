---
description: 如何在后台接受来自前端请求中的参数
---

# Controller 方法接受请求参数

## 编写前端请求页面

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <h1> Parameter sending ! </h1>

    <h2> Using get method ! </h2>
    <form action="/recv_parm/g" method="get">
        <input name="username"> <br>
        <input name="password"> <br>
        <input type="submit" value="提交" >
    </form>

    <h2> Using post method auto unpack ! </h2>
    <form action="/recv_parm/p1" method="post">
        <input name="username"> <br>
        <input name="password"> <br>
        <input type="submit" value="提交" >
    </form>

    <h2> Using post method and object auto unpack ! </h2>
    <form action="/recv_parm/p2" method="post">
        <input name="username"> <br>
        <input name="password"> <br>
        <input type="submit" value="提交" >
    </form>

</body>
</html>
```



## 编写后端 Controller

通常后端接收前端的请求参数有两种方法：

* 直接在响应方法参数列表中进行解析，使用 @RequestParm 注解进行 参数名称映射，不用 @RequestParm 也行，但考虑到前端的命名规则是下划线，java 命名规则是驼峰，还是建议使用@RequestParm 注解
* 在响应方法参数列表中用一个对象进行接收，对象的成员属性名要与前端的请求相应参数名称一致

```java
@Controller
public class RecvParmController {

    @GetMapping("/recv_parm/g") // "http://localhost:8080/recv_parm/g"
    @ResponseBody
    public String getMapping(@RequestParam("username") String username, @RequestParam("password") String password ){//使用 @RequestParam 对 下划线命名 和 驼峰命名进行映射
        System.out.println(username + " : "+password);
        return "<h1>" + "username : "+ username + " , "+ "password : "+ password +  "</h1>";
    }

    @PostMapping("/recv_parm/p1") // "http://localhost:8080/recv_parm/p1"
    @ResponseBody
    public String postMapping1(@RequestParam("username") String username, @RequestParam("password") String password ){
        return "<h1>" + "username : "+ username + " , "+ "password : "+ password +  "</h1>";
    }

    @PostMapping("/recv_parm/p2") // "http://localhost:8080/recv_parm/p2"
    @ResponseBody
    public String postMapping2(User user){//只要成员属性名与 前端name 相同,就可以直接创建对象
        return "<h1>" + "username : "+ user.getUsername() + " , "+ "password : "+ user.getPassword() +  "</h1>";
    }

}
```



