package com.prottonne.library.constant;

public enum StringEnum {
    STRING_AAA("AAA"),
    STRING_BBB("BBB");

    private final String data;

    private StringEnum(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
