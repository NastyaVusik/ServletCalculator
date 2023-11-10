package Adapter;

public class SpecialAdapter implements ClientInterface{

    private NewService service = new NewService();


    @Override
    public String method(String xml) {
        //convert xml to json
        return service.serviceMethod(xml);

    }
}
