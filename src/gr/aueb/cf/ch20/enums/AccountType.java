package gr.aueb.cf.ch20.enums;

import gr.aueb.cf.ch13.Account;

public enum AccountType {
    DEPOSIT("DP"),
    SAVINGS("SA"),
    CURRENT("CU");

    private final String code;

    AccountType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}