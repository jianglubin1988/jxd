package com.jxd.utils;

public class CommonUtils {

    private static final String CARD_PREFIX = "JXD";

    public static String getCardno() {
        return CARD_PREFIX + DateUtils.getCurrentTimeNo();
    }
}
