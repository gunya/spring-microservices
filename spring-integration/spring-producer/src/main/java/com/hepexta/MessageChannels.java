package com.hepexta;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

interface MessageChannels {

    @Output
    MessageChannel output();
}
