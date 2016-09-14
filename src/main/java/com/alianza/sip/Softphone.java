package com.alianza.sip;

import java.io.Closeable;

public interface Softphone extends Closeable {
    Dialog callNumber(String telephoneNumber);
}
