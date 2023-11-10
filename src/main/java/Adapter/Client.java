package Adapter;

public class Client{

    private ClientInterface clientInterface = new SpecialAdapter();

    public void process(){
        String xml;
        clientInterface.method(xml);

    }

    }

