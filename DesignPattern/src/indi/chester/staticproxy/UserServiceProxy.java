package indi.chester.staticproxy;

public class UserServiceProxy implements UserService {
    private UserService userService;
    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }


    @Override
    public void createUser() {
        System.out.println("执行 额外任务");
        userService.createUser();
    }
}
