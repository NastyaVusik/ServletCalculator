package Example;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class RootConfiguration {

    @Bean
    @Primary
    public String myName(){
        return "Test";
    }


    @Bean
    public String myName2(){return "Test2";}

    @Bean
    public Gson gson(){
        return new Gson();
    }



//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public UserDao jbdcUserDao(String name){
//        return new JdbcUserDao(name);
//    }



//    @Bean
//    public UserDao jdbcUserDao(){
//        return new JdbcUserDao();
//    }

//    @Bean
//    public UserService userService(UserDao userDao){
//        return new UserService(userDao);
//    }

}
