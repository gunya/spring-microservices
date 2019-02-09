package com.hepexta;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

interface MessageChannels {

    @Input
    SubscribableChannel input();
}
