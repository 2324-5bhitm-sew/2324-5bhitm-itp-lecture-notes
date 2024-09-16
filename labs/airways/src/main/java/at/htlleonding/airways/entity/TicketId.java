package at.htlleonding.airways.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class TicketId implements Serializable {

    private Long customerId;
    private Long flightId;

    public TicketId(Long customerId, Long flightId) {
        this.setCustomerId(customerId);
        this.setFlightId(flightId);
    }

    public TicketId() {

    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }
}
