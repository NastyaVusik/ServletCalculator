package Objects;

import Services.RegistrationDate;

public class CalculatorUser {

        //Object of new visitor, which will register the first time
        private String username;
        private String userEmail;
        private String userPassword;
        private Integer userID;


        public CalculatorUser() {
            this.username = null;
            this.userEmail = null;
            this.userPassword = null;
            this.userID = 0;
        }

        public CalculatorUser(String username, String userEmail, String userPassword) {
            this.username = username;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
        }

        public CalculatorUser(String username, String userPassword) {
            this.username = username;
            this.userPassword = userPassword;
        }

        public CalculatorUser(String username, String userEmail, String userPassword, Integer userID) {
            this.username = username;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
            this.userID = userID;
        }

        public CalculatorUser(Integer userID, String username, String userEmail, String userPassword, String formatDateTime) {
            this.username = username;
            this.userEmail = userEmail;
            this.userPassword = userPassword;
            this.userID = userID;
        }


//    public CalculatorUser(Integer userID, String username, String userEmail, String userPassword, String formatDateTime) {
//        this.username = username;
//        this.userEmail = userEmail;
//        this.userPassword = userPassword;
//        this.userID = userID;
//        this.formatDateTime = formatDateTime;
//    }


        //Getters and Setters

        public int getUserID(){
            return userID;
        }

        public void setUserID(Integer userID) {
            this.userID = userID;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }




        @Override
        public String toString() {

            //Create object of class RegistrationDate
            RegistrationDate registrationDate = new RegistrationDate();

            return "\nNew user's common information:\n" +
                    "1) username is " + getUsername() + ";\n" +
                    "2) ID is " + getUserID() + ";\n" +
                    "3) Email is " + getUserEmail() + ";\n" +
                    "4) Password is " + getUserPassword() + ";\n" +
                    "5) Date and time of registration is " + registrationDate.getFormatDateTime() + "\n";
        }


    }
