import Builder.User;
import Fabric.Button.Button;
import Fabric.Button.ButtonFactory;
import Fabric.JdbcConnectionFactory;
import Fabric_method.Car;
import Fabric_method.JdbcConnection;
import Singleton.UserStorage;

import java.sql.Connection;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        UserStorage instance = UserStorage.getInstance();       //Singleton

        LocalDateTime now = LocalDateTime.now();        //Fabric method

        Integer value = Integer.valueOf("Hello");       //Fabric method


        //Fabric  method
        Car BMW = new Car("BMW");
        Car BMW2 = new Car("BMW");
        Car BMW3 = new Car("BMW");
        Car BMW4 = new Car("BMW");


        //Fabric method
        Connection connection = JdbcConnection.getConnection();
        Connection connectionwithotAutoCommit = JdbcConnection.getConnectionwithotAutoCommit();


        //Fabric.
        JdbcConnectionFactory jdbcConnectionFactory = new JdbcConnectionFactory();
        Connection connection1 = jdbcConnectionFactory.getConnection();
        Connection connection2 = jdbcConnectionFactory.getConnection();
        Connection connection3 = jdbcConnectionFactory.getConnection();
        Connection connection4 = jdbcConnectionFactory.getConnection();

        JdbcConnectionFactory jdbcConnectionFactory1 = new JdbcConnectionFactory(false);
        Connection connection5 = jdbcConnectionFactory1.getConnection();
        Connection connection6 = jdbcConnectionFactory1.getConnection();
        Connection connection7 = jdbcConnectionFactory1.getConnection();


        //Fabric.
        ButtonFactory buttonFactory = new ButtonFactory();
        Button button = buttonFactory.getButton(Button.Type.WINDOWS);
        Button button1 = buttonFactory.getButton(Button.Type.HTML);


        //Builder
        StringBuilder stringBuilder = new StringBuilder();
        String string = stringBuilder.append("bfd")
                .append("gnn")
                .append("bcvbxc")
                .toString();



        //Biulder
        User user = User.builder("3", "4", "5")
                .setTest1("1")
                .setTest7("7")
                .build();

    }
}
