package Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);

        UserDao jdbcUserDao1 = applicationContext.getBean("jdbcUserDao", UserDao.class);
        UserDao jdbcUserDao2 = applicationContext.getBean("jdbcUserDao", UserDao.class);

        UserDao jdbcUserDao = applicationContext.getBean("jdbcUserDao", UserDao.class);
        System.out.println("userService: " + userService + "\n");
        System.out.println("userDao: " + jdbcUserDao + "\n");
        System.out.println("userDao1: " + jdbcUserDao1 + "\n");
        System.out.println("userDao2: " + jdbcUserDao2 + "\n");

        applicationContext.close();
        //Transfering beans to annotations

    }
}
