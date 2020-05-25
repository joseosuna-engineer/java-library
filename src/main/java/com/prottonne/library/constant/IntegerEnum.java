package com.prottonne.library.constant;

public enum IntegerEnum {

    INTEGER_ONE(1),
    INTEGER_TWO(2);

    private final Integer data;

    IntegerEnum(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }
}
