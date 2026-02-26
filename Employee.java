public class Employee {
    String Ename;
    int Eid;
    float Salary;


    public Employee(String Ename, int Eid, float Salary) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Salary = Salary;

    }

    void printDetails() {
        System.out.println("Employee name is " + Ename);
        System.out.println("Employee ID is" + Eid);
        System.out.println("Salary of Employee is" + Salary);
    }
}

    class emp {
        public static void main (String[]args){
            Employee E1 = new Employee("Sinchana", 104, 100000);
            Employee E2 = new Employee("Likhitha", 60, 100000);
            E1.printDetails();
            E2.printDetails();
        }
    }
