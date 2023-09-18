package Objects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalcOperation {

    //Create variables
    private double num1;
    private double num2;
    private String action;
    private double result;
    private Integer userID;

    //Date and time
    private String formatDateTime;

    public CalcOperation() {

    }

    public CalcOperation(double num1, double num2, String action) {
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
    }

    public CalcOperation(double num1, double num2, String action, Integer userID) {
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
        this.userID = userID;
    }


    public CalcOperation(double num1, double num2, String action, double result, String formatDateTime) {
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
        this.result = result;
        this.formatDateTime = formatDateTime;
    }

    public CalcOperation(double num1, double num2, String action, double result, String formatDateTime, Integer userID) {
        this.num1 = num1;
        this.num2 = num2;
        this.action = action;
        this.result = result;
        this.formatDateTime = formatDateTime;
        this.userID = userID;
    }


    //Method to get Date and time
    public String getFormatDateTime() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formatDateTime = now.format(formatter);

        return formatDateTime;
    }

    //Getters and setters

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


    public void setFormatDateTime(String formatDateTime) {
        this.formatDateTime = formatDateTime;
    }

    @Override
    public String toString() {
        return "Operation { " + "num1 = " + num1 + "  " +
                ", num2 = " + num2 + "  " +
                ", action = " + action + "  " +
                ", result = " + result + "  " +
                ", date is " + formatDateTime +
                ", user ID is " + userID + " }";
    }

}
