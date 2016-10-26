package com.alianza.sip.sdp;

public interface SdpDecoder {
    SessionDescription decode(String content);
}
