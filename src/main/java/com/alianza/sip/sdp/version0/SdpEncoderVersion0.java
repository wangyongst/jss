package com.alianza.sip.sdp.version0;

import com.alianza.sip.sdp.SdpEncoder;
import com.alianza.sip.sdp.SessionDescription;

public class SdpEncoderVersion0 implements SdpEncoder {
    @Override
    public String encode(SessionDescription description) {
        return description.toString();
    }
}
