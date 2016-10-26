package com.alianza.sip.example;

import com.alianza.sip.SipStackDetails;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ExampleSipStackDetails implements SipStackDetails {
    @Override
    public String stackName() {
        return "ExampleStack";
    }

    @Override
    public String ipAddress() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return null;
        }
    }

    @Override
    public Integer port() {
        return 5605;
    }
}
