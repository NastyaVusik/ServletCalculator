package CalculatorHistory.JDBCStorage;

import CalculatorHistory.History;
import Objects.CalcOperation;
import Objects.CalculatorUser;

import java.sql.*;
import java.util.ArrayList;

public class JDBCHistory implements History {

    CalculatorUser calculatorUser;
    public JDBCHistory(CalculatorUser calculatorUser){
        this.calculatorUser = calculatorUser;
    }

    public JDBCHistory() {

    }


//    private  Connection connection;
//   JDBCPostgresConnection jdbcPostgresConnection = new JDBCPostgresConnection();

    private final String URL1 = "jdbc:postgresql://localhost:5432/postgres";
    private final String USER1 = "postgres";
    private final String PASSWORD1 = "PGPangalin013$";



    @Override
    public void writeHistory(CalcOperation calcOperation) {

        try {
            Connection connection = DriverManager.getConnection(URL1, USER1, PASSWORD1);

//            connection = jdbcPostgresConnection.getPostgresConnection();

            PreparedStatement prepareStatement = connection.prepareStatement("insert into \"Calculation_history\" values (?, ?, ?, ?, ?)");
            prepareStatement.setDouble(1, calcOperation.getNum1());

            prepareStatement.setDouble(2, calcOperation.getNum2());

            prepareStatement.setString(3, calcOperation.getAction());
            prepareStatement.setDouble(4, calcOperation.getResult());
            prepareStatement.setString(5, calcOperation.getFormatDateTime());

            prepareStatement.execute();
            prepareStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



    @Override
    public void writeHistoryWithUser(CalcOperation calcOperation, CalculatorUser calculatorUser) {

        try {
            Connection connection = DriverManager.getConnection(URL1, USER1, PASSWORD1);

            PreparedStatement prepareStatement = connection.prepareStatement("insert into \"Calculation_historyWithUser\" values (?, ?, ?, ?, ?, ?)");
            prepareStatement.setDouble(1, calcOperation.getNum1());

            prepareStatement.setDouble(2, calcOperation.getNum2());

            prepareStatement.setString(3, calcOperation.getAction());
            prepareStatement.setDouble(4, calcOperation.getResult());
            prepareStatement.setString(5, calcOperation.getFormatDateTime());
            prepareStatement.setInt(6, calculatorUser.getUserID());

            prepareStatement.execute();
            prepareStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public ArrayList<String> getOperationHistory(){

        try {
            Connection connection = DriverManager.getConnection(URL1, USER1, PASSWORD1);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from \"Calculation_history\"");

            ArrayList <String> operationList = new ArrayList<>();

            while (resultSet.next()) {
                double num1 = resultSet.getDouble(1);
                double num2 = resultSet.getDouble(2);
                String action = resultSet.getString(3);
                double result = resultSet.getDouble(4);
                String date = resultSet.getString(5);
                Integer userID = resultSet.getInt(6);

                CalcOperation calcOperation = new CalcOperation(num1, num2, action, result, date, calculatorUser.getUserID());

                operationList.add(String.valueOf(calcOperation));

            }
            return operationList;

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
