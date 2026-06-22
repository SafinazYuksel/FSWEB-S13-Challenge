package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;  // Double → double (primitive)
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {  // Double → double
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getGiro() { return giro; }  // double autoboxing ile Double döner
    public void setGiro(double giro) {  // Double → double
        if (giro < 0) {
            System.out.println("Hata: Giro negatif olamaz! 0 olarak ayarlandı.");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hata: Geçersiz index değeri!");
            return;
        }
        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println(name + " developerNames dizisine eklendi.");
        } else {
            System.out.println("Hata: " + index + " indexi dolu! Mevcut değer: " + developerNames[index]);
        }
    }

    @Override
    public String toString() {
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developerNames=" + java.util.Arrays.toString(developerNames) + "}";
    }
}