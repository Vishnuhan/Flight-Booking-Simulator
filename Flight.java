public class Flight {
    private int flightnumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int flightnumber, String origin, String destination, String departureTime, int capacity, double orginalprice){
        
        if(origin.equals(destination)){
            throw new IllegalArgumentException("The destination and origin are the same.");
        }
        
        this.flightnumber = flightnumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
    }
    
    public boolean bookASeat(){ 
        if(this.numberOfSeatsLeft > 0){
            this.numberOfSeatsLeft = this.numberOfSeatsLeft - 1;
        return true;
        }
        else
            return false;
    }

    public int getFlightnumber(){
        return this.flightnumber;
    }
    
    public void setFlightnumber(int fn){
        this.flightnumber = fn;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public void setOrigin(String o){
        this.origin = o;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public void setDestination(String d){
        this.destination = d;
    }
    
    public String getDeparturetime(){
        return this.departureTime;
    }
    
    public void setDepartureTime(String dt){
        this.departureTime = dt;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public void setCapacity(int c){
        this.capacity = c;
    }
    
    public double getOriginalprice(){
        return this.originalPrice;
    }
    
    public void setOriginalPrice(int op){
        this.originalPrice = op;
    }
    
    public int getNumberOfSeatsleft(){
        return this.numberOfSeatsLeft;
    }
    
    public void setNumberOfSeatsLeft(int numseats){
        this.numberOfSeatsLeft = numseats;
    }
    
    @Override
    public String toString() {
        String one = "Flight " + flightnumber;
        String two = "," + origin + " to " + destination;
        String three = "," + departureTime;
        String four = ", original price: " + originalPrice + "$";
        return one + two + three + four;
    }
}
    
  
