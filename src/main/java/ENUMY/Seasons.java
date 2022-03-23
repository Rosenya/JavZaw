package ENUMY;

public enum Seasons implements Comment {

        // privte, static, final
        SPRING(21, "marzec"),
        SUMMER(22, "czerwiec"),
        AUTUMN(23, "wrzesień"){
            @Override
            public void comment() {
                System.out.println("Standard comment for autumn");
            }
        },
        WINTER(21, "grdzień");

        private int day;
        private String month;

        Seasons(int day, String month) {
            this.day = day;
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        @Override
        public void comment() {
            System.out.println("Standard comment");
        }
    }

