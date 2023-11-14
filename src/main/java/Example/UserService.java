package Example;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component      //creating bean through annotation
public class UserService {
   // @Autowired
//    @Qualifier("jdbcUserDao")
    private UserDao dao;


   @Autowired
    public UserService(UserDao dao, UserDao dao1, UserDao dao2, Gson gson) {
        this.dao = dao;
        this.dao1 = dao1;
        this.dao2 = dao2;
        this.gson = gson;
    }

    private UserDao dao1;
    private UserDao dao2;


    //   @Autowired
    private Gson gson;

    public UserService() {
    }

//    @Autowired
//    public UserService(@Qualifier("jdbcUserDao") UserDao  dao, Gson gson) {
//        this.dao = dao;
//        this.gson = gson;
//    }


    @Autowired
    public void setDao(UserDao dao) {
        this.dao = dao;
    }


//    @Autowired
//    public void setDao(Gson gson, UserDao jdbcUserDao) {
//        this.gson = gson;
//        this.dao = jdbcUserDao;
//    }


//    @Autowired
//    public void setGson(Gson gson) {
//        if(gson == null){
//            throw new IllegalArgumentException();
//        }
//        this.gson = gson;
//    }

    @Autowired      //цепочка в конструкторе
    public UserService setGson(Gson gson) {
        if(gson == null){
            throw new IllegalArgumentException();
        }
        this.gson = gson;
        return this;
    }

    public void registration(User user){
//        log.info("");
        String json = gson.toJson(user);
        dao.save(user);
    }
}
