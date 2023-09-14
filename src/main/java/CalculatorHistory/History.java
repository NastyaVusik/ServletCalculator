package CalculatorHistory;

import Objects.CalcOperation;
import Objects.CalculatorUser;

import java.util.ArrayList;

    public interface History {
        void writeHistory(CalcOperation calcOperation);
        void writeHistoryWithUser(CalcOperation calcOperation, CalculatorUser calculatorUser);
        ArrayList<String> getOperationHistory();

    }

