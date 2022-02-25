public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private static int count = 0;
    private int number;
    
    public Ticket(Passenger passenger, Flight flight, double price){
        count++;
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        number = count;
    }
    
    public Passenger getPassenger(){    // getter and setter methods
        return this.passenger;
    }
    
    public void setPassenger(Passenger passenger){
        this.passenger = passenger;
    }
    
    public Flight getFlight(){
        return this.flight;
    }
    
    public void setFlight(Flight flight){
        this.flight = flight;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public int getCount() {
        return count;
    }
    
    public void setCount(int c) {
        count = c;
    }
    
    @Override
    public String toString(){
        String passname = passenger.getName() + ", Flight " + flight.getFlightnumber();
        String dest = ", " + flight.getOrigin() + " to " + flight.getDestination();
        String time = ", " + flight.getDeparturetime();
        String amount = ", original price: $" + flight.getOriginalprice() + ", ticket price: $" + getPrice();
        return passname + dest + time + amount;
    }
}
