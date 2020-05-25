package com.prottonne.library.constant;

public enum CharacterEnum {

    CHAR_A('A'),
    CHAR_B('B');

    private final Character data;

    CharacterEnum(Character data) {
        this.data = data;
    }

    public Character getData() {
        return data;
    }
}
