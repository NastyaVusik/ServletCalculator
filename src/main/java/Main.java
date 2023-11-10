import Adapter.SpecialAdapter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //Adapter
        SpecialAdapter specialAdapter = new SpecialAdapter();

        String method = specialAdapter.method("xml");


        //Facade

        //Decorator
        FileReader fileReader = new FileReader(new File("path"));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();



    }
}