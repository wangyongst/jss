package com.alianza.sip.exceptions;

public class JainWrappedException extends SoftphoneException {
    public JainWrappedException(String message, Exception baseException) {
        super(message, baseException);
    }
}
