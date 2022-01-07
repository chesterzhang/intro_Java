package indi.chester.staticproxy;

public class UserServiceImpl implements UserService {
    @Override
    public void createUser() {
        System.out.println("执行 创建用户 业务逻辑");
    }
}
