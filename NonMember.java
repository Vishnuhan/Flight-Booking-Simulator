public class NonMember extends Passenger{
    
    public NonMember(String name, int age)
    {
        super(name, age);
    }
    
    @Override
    public double applyDiscount(double p)
    {
        if(age > 65){
            return p = (p * 9)/10;
        }
        
        else
            return p;
    
    }   
}
