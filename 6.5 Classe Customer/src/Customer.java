import java.time.LocalDate;

public class Customer {

    //parametri
    private String name;
    private String surname;
    private int birthYear;

    public void setbirthYear(int birthYear){
        checkAge(birthYear);
    }
    public int getbirthYear(){
        return birthYear;
    }
    //costruttori
    public Customer(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = checkAge(birthYear);
    }

    public Customer(String surname, int birthYear, String name) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        LocalDate data = LocalDate.now();
        this.birthYear = data.getYear();
    }

    //metodi
    private int calculateAge(){
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void showCustomerInfo(){
        System.out.println("Il cliente " + this.name+" "+this.surname+" ha "+calculateAge());
    }

    private int checkAge(int birthYear){
        if(birthYear > LocalDate.now().getYear()){
            return birthYear = LocalDate.now().getYear();
        }
        else if (calculateAge()> 120) {
            return birthYear = LocalDate.now().getYear()-120;
        }
        else{
            return birthYear;
        }
    }
}
