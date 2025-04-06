package com.avishka.ShinyResort.service.interfac;

import com.avishka.ShinyResort.dto.Response;
import com.avishka.ShinyResort.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
