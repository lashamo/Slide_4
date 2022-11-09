package com.learn.slide4.custom;

public class User {

    private String personalId;

    public User(String personalId) throws NotValidPersonalIdException {
        if (personalId.length() != 11) {
            throw new NotValidPersonalIdException("Personal Id must be 11 character");
        }

        this.personalId = personalId;
    }
}
