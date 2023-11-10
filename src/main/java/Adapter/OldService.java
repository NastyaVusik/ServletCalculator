package Adapter;

public class OldService implements ClientInterface{

    @Override
    public String method(String xml) {
        return xml;
    }
}
