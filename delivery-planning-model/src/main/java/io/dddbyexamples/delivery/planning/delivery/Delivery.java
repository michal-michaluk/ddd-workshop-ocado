package io.dddbyexamples.delivery.planning.delivery;

import java.util.UUID;

class Delivery {

    private final UUID id;
    private Transport transport;
    private Payload payload;

    private final TransportCapacityPolicy policy;

    Delivery(UUID id, Transport transport, Payload payload, TransportCapacityPolicy policy) {
        this.id = id;
        this.transport = transport;
        this.payload = payload;
        this.policy = policy;
    }

    void edit(EditDelivery command) {
        checkTransportCapacityExceeded(command);

        // update payload

        // emit DeliveredAmountsChanged
    }

    private void checkTransportCapacityExceeded(EditDelivery command) {
        StorageUnitsAmounts exceedingAmounts = policy.calculateExceedingAmounts(
                command.getTransport(),
                command.getPayload().calculateStorageUnitsAmounts()
        );

        // if (exceedingAmounts.any()) {
        //     calculateSugestion();
        // }
    }

    void cancel(CancelDelivery command) {

    }
}