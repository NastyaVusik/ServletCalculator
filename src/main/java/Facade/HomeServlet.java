package Facade;

public class HomeServlet {
    UserServiceFacade userServiceFacade = new UserServiceFacade();
    protected void doGet(){
        userServiceFacade.process();
    }
}
