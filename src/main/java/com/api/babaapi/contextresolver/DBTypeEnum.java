package com.api.babaapi.contextresolver;

public enum DBTypeEnum {
    LOGIN; // configurar o banco que vamos usar

    private String tenet;

    public static DBTypeEnum get(String tenetId) {
        if (tenetId == null) {
            throw new IllegalArgumentException("tenetId cannot be null");
        }

        for (DBTypeEnum type : values()) {
            if (type.name().equalsIgnoreCase(tenetId)) {
                return type;
            }
        }

        throw new IllegalArgumentException("No enum constant with value: " + tenetId);
    }
}
