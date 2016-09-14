package com.alianza.sip;

import java.io.Closeable;

public interface Dialog extends Closeable {
    void hangup();
    void hold();
    void unhold();
    void transfer();
}
