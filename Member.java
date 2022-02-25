public class Member extends Passenger {
    private int yearsOfMembership;
    
    public Member(int yearsOfMembership, String name, int age)
    {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }
    
    @Override
    public double applyDiscount(double p) 
    {
        if(yearsOfMembership > 5){
            return p = p/2;
        }
        
        else if(yearsOfMembership > 1 && yearsOfMembership <= 5){
            return p = (p * 9)/10; // 10% discount
        }
        
        else
            return p;
                
    }
    
    
}
