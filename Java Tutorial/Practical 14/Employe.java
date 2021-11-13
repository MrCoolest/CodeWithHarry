package company;

public class Employe{
    public String Emname;
    public double basic;
    public Employe(String name, double basic_sal){
        Emname = name;
        basic = basic_sal;
    }
    
    public void get(){
        System.out.println("Employee name :"+Emname +"\nBasic Salary :"+basic);
    }
}