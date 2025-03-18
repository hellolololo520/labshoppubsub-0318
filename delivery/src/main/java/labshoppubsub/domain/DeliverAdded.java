package labshoppubsub.domain;

import java.time.LocalDate;
import java.util.*;
import labshoppubsub.domain.*;
import labshoppubsub.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliverAdded extends AbstractEvent {

    private Long id;
    private String customerid;
    private String address;

    public DeliverAdded(Delivery aggregate) {
        super(aggregate);
    }

    public DeliverAdded() {
        super();
    }
}
//>>> DDD / Domain Event
