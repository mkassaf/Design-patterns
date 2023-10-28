package edu.najah.cap.designpattern.adapter.exercise;

public class ProxySQLDatabase implements Database {

        private String userType;
        private SQLDatabase sqlDatabase;

        public ProxySQLDatabase() {
            this.sqlDatabase = new SQLDatabase();
        }

        @Override
        public void insert() {
            if (userType.equals("admin")) {
                sqlDatabase.insert();
            } else {
                System.out.println("You are not authorized to perform this operation");
            }
        }

        @Override
        public void update() {
            sqlDatabase.update();
        }
}
