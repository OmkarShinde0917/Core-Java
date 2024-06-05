public class Employee extends Person {
    int salary;
    public Employee(String firstName, String lastName, int salary) { //constructor
        super(firstName, lastName);
        this.salary = salary;
    }
    public int getSalary() { //getter
        return salary;
    }

    public static void main(String[] args) {
        // Single Inheritance only inherit from person
        Employee emp = new Employee("Omkar", "Shinde", 3);
        System.out.println("Employee Name: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Salary: " + emp.getSalary()+"LPA");
        System.out.println();
    }
}


class Manager extends Employee {
    String post;
    public Manager(String firstName, String lastName, int salary, String post) { //Constructor
        super(firstName, lastName, salary);
        this.post = post;
    }

    public String getPost() { //getter
        return post;
    }
    public static void main(String[] args) {
        // Multi-Level Inheritance extended from Employee and Person
        Manager manager = new Manager("Omkar ","Shinde ",6,"General manager");
        System.out.println("Manager Name "+manager.firstName+""+manager.lastName);
        System.out.println("Salary: " + manager.getSalary()+"LPA");
        System.out.println("Post: " + manager.getPost());
        System.out.println();
    }
}

class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName) { //Constructor
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() { //getter
        return firstName;
    }
    public String getLastName() { //getter
        return lastName;
    }
}