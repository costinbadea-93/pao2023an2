package model;

public class Student{

    private String nume;
    private String prenume;
    private String grupa;
    private double medie;

    public Student(String nume, String prenume, String grupa, double medie) {
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.medie = medie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", grupa='" + grupa + '\'' +
                ", medie=" + medie +
                '}';
    }
}
