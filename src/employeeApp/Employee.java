package employeeApp;

import java.util.Arrays;

public class Employee {
    private long id;
    private  String fullName;
    private  String email;
    private  String password;
    private  String[] healthplans;

    public void addHealthPlan(int index, String name){
        if(index < 0 || index >= healthplans.length){
            System.out.println("Yanlış index değeri girdiniz!");
        }
        if(healthplans[index] != null){
            System.out.println("Index dolu!");
        }
        else{
            healthplans[index] = name;
            System.out.println(name + " İlgili indexe eklendi!");
        }
    }

    public Employee(long id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
