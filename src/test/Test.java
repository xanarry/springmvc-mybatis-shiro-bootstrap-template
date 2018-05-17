package test;

import com.example.dataBase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    UserService userService;
    public String getlist() {
        return userService.getUserList(0, 100).toString();
    }
}
