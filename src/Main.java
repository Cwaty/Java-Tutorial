public class Main {
    public static void main(String[] args) {
        /*
        Employee employee = new Employee();
        employee.email = "tamercanwinchester@gmail.com";
        employee.id = 2000;
        employee.name = "Esma Pekun";

        System.out.println("Email: "+employee.email+" ID: "+employee.id+" Name: "+employee.name+"");
         */


        /*
        ---> Employee fonksiyonu kullanıyoruz.
         */
        Employee employee = new Employee(1 , "esma pekun" , "tamercanwinchester@gmail.com");
        employee.thisInfo();

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.add(employee);

    }
}
