class Employee{
    int employeeId;
    String employeeName,position;
    double salary;
    Employee(int id,String name,String pos,double sal){
        employeeId=id;
        employeeName=name;
        position=pos;
        salary=sal;
    }
}
public class EmployeeManagement {
    static Employee[] em = new Employee[5];
    
    static void add(Employee e){
        for(int i=0;i<5;i++){
            if(em[i]==null) {
                em[i]=e;
                return;
            }
        }
        System.out.println("Memory full!");
    }
    static Employee search(int id){
        for(int i=0;i<5;i++){
            if(em[i]!=null && em[i].employeeId==id) return em[i];
        }
        return null;
    }
    static void traverse(){
        for(int i=0;i<5;i++){
            if(em[i]!=null) 
            System.out.println("ID : "+em[i].employeeId+" name : "+em[i].employeeName+" Position : "+em[i].position+" Salary : "+em[i].salary);
        }
    }
    static void delete(int id){
        for(int i=0;i<5;i++){
            if(em[i]!=null && em[i].employeeId==id) {
                System.out.println("Employee "+em[i].employeeName+" deleted");
                em[i]=null;
            }
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            em[i]=null;
        }
        add(new Employee(1, "abc", "mngr", 50000));
        add(new Employee(2, "def", "asstmngr", 35000));
        add(new Employee(3, "ghi", "asstmngr", 35000));
        add(new Employee(4, "jkl", "tmngr", 25000));
        add(new Employee(5, "mno", "clk", 25000));

        Employee a=search(2);
        if(a!=null) {
            System.out.println("employee details are :");
            System.out.println("ID : "+a.employeeId+" name : "+a.employeeName+" Position : "+a.position+" Salary : "+a.salary);
        }
        else System.out.println("Employee not found");
        System.out.println();
        delete(3);
        System.out.println("\nAvailable employees");
        traverse();
    }
}
