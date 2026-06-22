package org.example;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {
        Healthplan healthplan1 = new Healthplan(1, "Aile Sağlık Planı", Plan.BASIC);
        System.out.println(healthplan1.toString());

        String[] employeeHealthPlans = new String[3];
        Employee employee = new Employee(101, "Ahmet Yılmaz", "ahmet@example.com", "pass123", employeeHealthPlans);
        System.out.println(employee.toString());

        employee.addHealthPlan(0, "BASIC");
        employee.addHealthPlan(0, "STANDARD");
        employee.addHealthPlan(5, "PREMIUM");
        System.out.println(employee.toString());

        String[] developers = new String[5];
        Company company = new Company(1, "Bluesense AI", 500000.0, developers);
        System.out.println(company.toString());

        Company company2 = new Company(2, "Test Şirket", -1000.0, new String[2]);
        System.out.println(company2.toString());

        company.addEmployee(0, "Mehmet Kaya");
        company.addEmployee(0, "Ali Veli");
        company.addEmployee(10, "Fatma Demir");
        System.out.println(company.toString());
    }
}