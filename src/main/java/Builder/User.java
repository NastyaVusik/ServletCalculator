package Builder;

public class User {
    private String test1;
    private String test2;

    private String test3;

    private String test4;

    private String test5;

    private String test6;

    private String test7;
    private String test8;

    private String test9;
    private String test10;

    private String test11;

    private String test12;

    private String test13;
    private String test14;

    private String test15;


    public User(String test2, String test3, String test4) {
        this.test2 = test2;
        this.test3 = test3;
        this.test4 = test4;
    }


    public static Builder builder(String test2, String test3, String test4) {
        return new User(test2, test3, test4).new Builder();
    }


    public class Builder {
        private Builder() {
        }


        public Builder setTest1(String test1) {
            User.this.test1 = test1;
            return this;
        }

        public Builder setTest5(String test5) {
            User.this.test5 = test5;
            return this;
        }

        public Builder setTest6(String test6) {
            User.this.test6 = test6;
            return this;
        }

        public Builder setTest7(String test7) {
            User.this.test7 = test7;
            return this;
        }

        public Builder setTest8(String test8) {
            User.this.test8 = test8;
            return this;
        }

        public Builder setTest9(String test9) {
            User.this.test9 = test9;
            return this;
        }

        public Builder setTest10(String test10) {
            User.this.test10 = test10;
            return this;
        }

        public Builder setTest11(String test11) {
            User.this.test11 = test11;
            return this;
        }

        public Builder setTest12(String test12) {
            User.this.test12 = test12;
            return this;
        }

        public Builder setTest13(String test13) {
            User.this.test13 = test13;
            return this;
        }

        public Builder setTest14(String test14) {
            User.this.test14 = test14;
            return this;
        }

        public Builder setTest15(String test15) {
            User.this.test15 = test15;
            return this;
        }


        public User build() {
            return User.this;
        }
    }
}


