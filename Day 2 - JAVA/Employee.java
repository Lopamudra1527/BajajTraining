public class Employee {
    int eId=0;
    String name=" ";
    int salary=0;
    String company=" ";
    static int c=0;
    Employee(int eId, String name,int salary,String company)
    {
        c++;
        this.eId=eId;
        this.name=name;
        this.salary=salary;
        this.company=company;
        if(salary>20000)
        System.out.println("Name: "+name+" eId: "+eId+" salary: "+salary+" company: "+company);
    }

    public static void main(String[] args)
    {
      Employee e1=new Employee(1, "Lopa", 70000, "BFDL");
      Employee e2=new Employee(2, "Mukesh", 35000, "BFDL");
      Employee e3=new Employee(3, "Joshita", 90000, "BFDL");
      System.out.println("Number of objects created: "+c);
    }
}
