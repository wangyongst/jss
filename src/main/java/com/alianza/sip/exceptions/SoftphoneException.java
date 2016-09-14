package com.alianza.sip.exceptions;

public class SoftphoneException extends Exception {
    public SoftphoneException(String message, Exception baseException) {
        super(message, baseException);
    }
}
