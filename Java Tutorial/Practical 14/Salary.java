package company;

public class Salary extends Allowance{
    public double total;
    public Salary(String a, double b){
        super(a,b);
    }
    
    public void total_Sal(){
        total = basic+hra+da;
    }
    
    public void display(){
        System.out.println("Total Salary :"+total);
    }
}