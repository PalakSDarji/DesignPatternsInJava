package com.palak.designpatterns.structural.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.book(TravelFacade.BookingType.Flight, "Palak");
        travelFacade.book(TravelFacade.BookingType.Train, "Dhara");
        travelFacade.book(TravelFacade.BookingType.Hotel, "Hiya");
        travelFacade.book(TravelFacade.BookingType.FlightAndHotel, "Vihani");
        travelFacade.book(TravelFacade.BookingType.TrainAndHotel, "Ajay");
    }
}
