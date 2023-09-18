package Services;


import CalculatorHistory.History;
import CalculatorHistory.JDBCStorage.JDBCHistory;
import Objects.CalcOperation;
import Objects.CalculatorUser;

public class OperationService {
    History jdbcHistory = new JDBCHistory();           //!!!!!!!!!!!!!!!!!!!!! Changed from File storage

    public History getJdbcHistory(){
        return jdbcHistory;
    }

    //Method for realisation of operations with numbers
    public CalcOperation calculateResult(CalcOperation calcOperation, CalculatorUser calculatorUser) {            //Pass object calcOperation instead (double num1, double num2, String action)

        switch (calcOperation.getAction()) {
            case ("+") -> {
                double res1 = calcOperation.getNum1() + calcOperation.getNum2();
                CalcOperation calcOperation1 = new CalcOperation(calcOperation.getNum1(), calcOperation.getNum2(), calcOperation.getAction(), res1, calcOperation.getFormatDateTime(), calculatorUser.getUserID());                 //Create object of class CalcOperation
//                fileHistory.writeHistoryWithUser(calcOperation1, calculatorUser);

                jdbcHistory.writeHistoryWithUser(calcOperation1, calculatorUser);           //!!!!!!!!!!!!!!!!!!!!! Changed from File storage

//                inMemoryHistory.writeHistory(calcOperation1);
                return calcOperation;
            }
            case ("-") -> {
                double res2 = calcOperation.getNum1() - calcOperation.getNum2();
                CalcOperation calcOperation2 = new CalcOperation(calcOperation.getNum1(), calcOperation.getNum2(), calcOperation.getAction(), res2, calcOperation.getFormatDateTime(),  calculatorUser.getUserID());                 //Create object of class CalcOperation
//                fileHistory.writeHistoryWithUser(calcOperation2, calculatorUser);

                jdbcHistory.writeHistoryWithUser(calcOperation2, calculatorUser);           //!!!!!!!!!!!!!!!!!!!!! Changed from File storage

//                inMemoryHistory.writeHistory(calcOperation2);
                return calcOperation;
            }
            case ("*") -> {
                double res3 = calcOperation.getNum1() * calcOperation.getNum2();
                CalcOperation calcOperation3 = new CalcOperation(calcOperation.getNum1(), calcOperation.getNum2(), calcOperation.getAction(), res3, calcOperation.getFormatDateTime(),  calculatorUser.getUserID());                 //Create object of class CalcOperation
//                fileHistory.writeHistoryWithUser(calcOperation3, calculatorUser);

                jdbcHistory.writeHistoryWithUser(calcOperation3, calculatorUser);           //!!!!!!!!!!!!!!!!!!!!! Changed from File storage

//                inMemoryHistory.writeHistory(calcOperation3);
                return calcOperation;
            }
            case ("/") -> {
                double res4 = calcOperation.getNum1() / calcOperation.getNum2();
                CalcOperation calcOperation4 = new CalcOperation(calcOperation.getNum1(), calcOperation.getNum2(), calcOperation.getAction(), res4, calcOperation.getFormatDateTime(),  calculatorUser.getUserID());                 //Create object of class CalcOperation
//                fileHistory.writeHistoryWithUser(calcOperation4, calculatorUser);

                jdbcHistory.writeHistoryWithUser(calcOperation4, calculatorUser);           //!!!!!!!!!!!!!!!!!!!!! Changed from File storage

//                inMemoryHistory.writeHistory(calcOperation4);
                return calcOperation;
            }
        }

        throw new RuntimeException();
    }

}
