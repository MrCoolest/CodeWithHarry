package company;

public class Allowance extends Employe{
    public double hra, da;
    
    public Allowance(String a, double b){
        super(a,b);
    }
    
    public void call(){
        hra = (basic*7.5)/100;
        da = (basic*4)/100;
    }
    
    public void put(){
        System.out.println("HRA :"+hra+"\nDA"+da);
    }
}