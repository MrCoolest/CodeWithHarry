import company.Salary;
import company.Employe;
import company.Allowance;

class Company_main{
    public static void main(String[] args) {
        Salary obj = new Salary("Ankit",25000);
        obj.get();
        obj.call();   
        obj.put();
        obj.total_Sal();
        obj.display();
    }
}