package Example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

    @Pointcut("execution(* Example.UserService.save())")
    void testPointCut(){

    }

//    @Before("testPointCut()")
//    @After("testPointCut()")
@Around("testPointCut()")
public Object test(ProceedingJoinPoint proceedingJoinPoint){

    System.out.println("Before");
Object object;
    try {
        object = proceedingJoinPoint.proceed();
    } catch (Throwable e) {
        throw new RuntimeException(e);
    }

    System.out.println("After");

    return object;
}

}
