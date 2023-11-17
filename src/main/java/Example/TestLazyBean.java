package Example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
//@Lazy
@Scope("prototype")
public class TestLazyBean {

    @PreDestroy
    public void destroy(){
        System.out.println("Destroy");
    }
}
