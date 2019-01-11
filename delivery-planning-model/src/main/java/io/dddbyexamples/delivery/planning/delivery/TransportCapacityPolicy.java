package io.dddbyexamples.delivery.planning.delivery;

public interface TransportCapacityPolicy {

    StorageUnitsAmounts calculateExceedingAmounts(
            Transport capacity,
            StorageUnitsAmounts payload
    );
}
