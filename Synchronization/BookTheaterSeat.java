package Synchronization;

public class BookTheaterSeat {
    int total_seats = 10;
    void bookSeats(int seats){
        if(total_seats >= seats){
            System.out.println(seats +"Seats booked succesfully");
            total_seats = total_seats - seats;
            System.out.println("seats left :"+total_seats);
        }
        else{
            System.out.println("Sorry, seats cannot be booked...");
            System.out.println("seats left :"+total_seats);
        }
    }
}

class movieBookApp extends Thread {
    static BookTheaterSeat b; // Create reference
    int seats;

    public void run(){
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterSeat();

        movieBookApp x = new movieBookApp();
        x.seats = 7;
        x.start();

        movieBookApp y = new movieBookApp();
        y.seats = 6;
        y.start();
    }
}
