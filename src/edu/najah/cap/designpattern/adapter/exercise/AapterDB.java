package edu.najah.cap.designpattern.adapter.exercise;

public class AapterDB implements Database {

    private final LegacyDB legacyDB;

    public AapterDB(LegacyDB legacyDB) {
        this.legacyDB = legacyDB;
    }

    @Override
    public void insert() {
        legacyDB.insertRecord(false);
    }

    @Override
    public void update() {
        System.out.println("Update operation in progress...");
        legacyDB.insertRecord(true);
    }
}
