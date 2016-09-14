package com.alianza.sip.example;

import static org.assertj.core.api.Assertions.*;

import com.alianza.sip.JainFactories;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class ExampleSoftphoneSimpleCall {

    private JainFactories factories;
    private ExampleSipStackDetails sipStackDetails;

    @BeforeEach
    public void setup() {
        sipStackDetails = new ExampleSipStackDetails();
        factories = new JainFactories(sipStackDetails);
    }

    @Test
    @Disabled
    public void manuallyTestASingleCall() {
        assertThat(1+1).isEqualTo(2);
    }
}
