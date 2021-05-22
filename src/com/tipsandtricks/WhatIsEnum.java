package com.tipsandtricks;

public enum WhatIsEnum {
    // Enum is a constant that doesn't change, like Date
    PURPLE("Purple"), RED("Red"), GREEN("Green"), YES("Yes"), NO("No");

    private String value;

    WhatIsEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
