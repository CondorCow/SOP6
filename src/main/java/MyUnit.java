public class MyUnit {

    private Employee employee;
    public String concatenate(String one, String two){
        return one + two;
    }

    public MyUnit() {
        employee = new Employee("Henk", 30);
    }

    public void giveMoney(double amount){
        employee.setSalary(amount);
        //TEST
        //hoi
    }

    public String getEmployeeInfo(){
        return employee.getName() + " - " + employee.getAge() + " " + employee.getSalary();
    }

    public double getEmployeeSalary(){
        return employee.getSalary();
    }
}
