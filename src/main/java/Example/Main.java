package Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main{
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);

        UserService userService = applicationContext.getBean("userService", UserService.class);
        UserService userService1 = applicationContext.getBean("userService", UserService.class);

        userService.save();

        TestLazyBean testLazyBean = applicationContext.getBean("testLazyBean", TestLazyBean.class);
        TestRecord testRecord = applicationContext.getBean("testRecord", TestRecord.class);
        System.out.println("userService: " + userService);
        System.out.println("testLazyBean: " + testLazyBean);
        System.out.println("testRecord: " + testRecord);

        applicationContext.close();


    }
}
