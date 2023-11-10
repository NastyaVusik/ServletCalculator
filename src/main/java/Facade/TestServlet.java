package Facade;

public class TestServlet {
    UserServiceFacade userServiceFacade = new UserServiceFacade();

    private void doGet(){
        userServiceFacade.process();
    }
}
