import java.io.*;

class Employee implements Serializable {
    int employeeId;
    String name;
    String department;
    double salary;

    Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class EmployeeData {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee(101, "Janvi", "IT", 50000);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.txt"));
        out.writeObject(e);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("emp.txt"));
        Employee emp = (Employee) in.readObject();

        System.out.println(emp.employeeId);
        System.out.println(emp.name);
        System.out.println(emp.department);
        System.out.println(emp.salary);
    }
}