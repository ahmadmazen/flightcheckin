package com.mazen.flightcheckin.integration;

import com.mazen.flightcheckin.integration.dto.Reservation;
import com.mazen.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);

}
