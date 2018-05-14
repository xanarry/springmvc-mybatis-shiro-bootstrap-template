package test;

import com.example.dao.bean.User;
import com.example.dao.mapper.UserDao;
import com.example.dao.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] argv) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");//得到spring容器
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");//获取这个bean
        User user = userDao.getUserByName("xy");
        System.out.println(user);

        List<User> userList = userDao.getUserList(0, 100);
        System.out.println(userList);

    }
}
