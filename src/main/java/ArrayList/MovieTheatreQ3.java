package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MovieTheatreQ3 {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    // Constructor to initialize the theatre name and seats
    public MovieTheatreQ3(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        // Generate seat numbers based on rows and seats per row
        for (int row = 1; row <= numRows; row++) {
            for (int seat = 1; seat <= seatsPerRow; seat++) {
                seats.add(new Seat("Row " + row + " Seat " + seat));
            }
        }

        printSeatingChart();  // Print initial seating chart
    }

    // Method to get the theatre name
    public String getTheatreName() {
        return theatreName;
    }

    // Method to reserve a seat
    public boolean reserveSeat(String seatNum) {
        for (Seat seat : seats) {
            if (seat.getSeatNum().equals(seatNum)) {
                return seat.reserve();
            }
        }
        System.out.println("Seat " + seatNum + " does not exist.");
        return false;
    }

    // Method to cancel a seat reservation
    public boolean cancelSeat(String seatNum) {
        for (Seat seat : seats) {
            if (seat.getSeatNum().equals(seatNum)) {
                return seat.cancel();
            }
        }
        System.out.println("Seat " + seatNum + " does not exist.");
        return false;
    }

    // Method to print the seating chart
    public void printSeatingChart() {
        System.out.println("Seating chart for " + theatreName + ":");
        for (Seat seat : seats) {
            System.out.print(seat.getSeatNum() + (seat.isReserved() ? " (Reserved)" : "") + " ");
        }
        System.out.println();
    }

    // Inner class representing a seat
    private class Seat {
        private final String seatNum;
        private boolean reserved = false;

        public Seat(String seatNum) {
            this.seatNum = seatNum;
        }

        // Method to reserve a seat
        public boolean reserve() {
            if (!reserved) {
                reserved = true;
                System.out.println("Seat " + seatNum + " reserved.");
                return true;
            } else {
                System.out.println("Seat " + seatNum + " is already reserved.");
                return false;
            }
        }

        // Method to cancel a reservation
        public boolean cancel() {
            if (reserved) {
                reserved = false;
                System.out.println("Seat " + seatNum + " reservation canceled.");
                return true;
            } else {
                System.out.println("Seat " + seatNum + " is not reserved.");
                return false;
            }
        }

        // Getter for seat number
        public String getSeatNum() {
            return seatNum;
        }

        // Check if the seat is reserved
        public boolean isReserved() {
            return reserved;
        }
    }

    public static void main(String[] args) {
        // Simulate a theatre with 3 rows and 5 seats per row
        MovieTheatreQ3 theatre = new MovieTheatreQ3("Galaxy Cinema", 3, 5);

        // Reserve and cancel seat reservations
        theatre.reserveSeat("Row 1 Seat 2");
        theatre.reserveSeat("Row 2 Seat 4");
        theatre.cancelSeat("Row 1 Seat 2");
        theatre.reserveSeat("Row 1 Seat 6");  // Seat does not exist

        // Print final seating chart
        theatre.printSeatingChart();
    }
}
