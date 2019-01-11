package io.dddbyexamples.delivery.planning.delivery;

import lombok.Value;

@Value
public class ScheduleDelivery {
    Transport transport;
    Payload payload;
}
