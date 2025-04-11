package geVernova.classesandobject.bookingsystem;

public class BookingSystem {
    public static void main(String[] args){
        MovieTicket movieTicket=new MovieTicket();
        movieTicket.bookTicket("Matrix",69,45.23);
        movieTicket.displayTicket();
    }
}
