package com.alianza.sip.impl;

import com.alianza.sip.Dialog;
import com.alianza.sip.SipCredentialProvider;
import com.alianza.sip.Softphone;

import java.io.IOException;

public class JainSoftphone implements Softphone {

    private final SipCredentialProvider credentials;
    private boolean initialized;

    public JainSoftphone(SipCredentialProvider credentials) {
        this.credentials = credentials;
        this.initialized = false;
    }

    private void init() {

    }

    @Override
    public synchronized Dialog callNumber(String telephoneNumber) {
        if (!initialized) { init(); }

        return null;
    }

    @Override
    public void close() throws IOException {

    }
}
