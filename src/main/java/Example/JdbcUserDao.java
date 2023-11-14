package Example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component      //creating bean through annotation
//@ComponentScan      //creating bean through annotation
@Scope("prototype")
public class JdbcUserDao implements UserDao{

    private String a;

//   @Value("#{systemProperties.user.country}")
//    private String b;

    public JdbcUserDao(String name){
        this.a = name;
    }

    @Override
    public void save(User user){

    }

@PostConstruct
    public void init(){
    System.out.println("Init jdbc");
    }

@PreDestroy
    public void destroy(){
    System.out.println("Destroy jdbc");

    }

}
