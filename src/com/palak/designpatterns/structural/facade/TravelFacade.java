package com.palak.designpatterns.structural.facade;

public class TravelFacade {

    enum BookingType{
        Flight, Train, Hotel, FlightAndHotel, TrainAndHotel
    }

    FlightBooking flightBooking;
    TrainBooking trainBooking;
    HotelBooking hotelBooking;

    public TravelFacade() {
        flightBooking = new FlightBooking();
        trainBooking = new TrainBooking();
        hotelBooking = new HotelBooking();
    }

    public void book(BookingType bookingType, String custName){
        switch (bookingType){
            case Flight:
                flightBooking.bookFlight(custName);
                return;
            case Train:
                trainBooking.bookTrain(custName);
                return;
            case Hotel:
                hotelBooking.bookHotel(custName);
                return;
            case FlightAndHotel:
                flightBooking.bookFlight(custName);
                hotelBooking.bookHotel(custName);
                return;
            case TrainAndHotel:
                trainBooking.bookTrain(custName);
                hotelBooking.bookHotel(custName);
                return;
        }
    }
}
