package io.dddbyexamples.delivery.planning.delivery;

import lombok.Value;

@Value
public class EditDelivery {
    Transport transport;
    Payload payload;
}
