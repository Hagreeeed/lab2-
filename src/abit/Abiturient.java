package abit;
import java.util.ArrayList;
import java.util.Collections;

public class Abiturient implements Comparable<Abiturient> {

    private int index;
    private String surname;
    private String name;
    private String middleName;
    private String adress;
    private String phoneNumber;
    private double everygRate;

    public Abiturient(int index, String Surname, String Name, String MiddleName, String Adress, String PhoneNumber, double EverygRate){
        this.index = index;
        this.surname = Surname;
        this.name = Name;
        this.middleName = MiddleName;
        this.adress = Adress;
        this.phoneNumber = PhoneNumber;
        this.everygRate = EverygRate;
    }
    public int getIndex(){
        return index;
    }
    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getAdress(){
        return adress;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public double getEverygRate(){
        return everygRate;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public void setSurname(String Surname){
        this.surname = Surname;
    }

    public void setName(String Name){
        this.name = Name;
    }

    public void setMiddleName(String MiddleName){
        this.middleName = MiddleName;
    }

    public void setAdress(String Adress){
        this.adress = Adress;
    }

    public void setPhoneNumber(String PhoneNumber){
        this.phoneNumber = PhoneNumber;
    }

    public void setEverygRate(double EverygRate){
        this.everygRate = EverygRate;
    }

    @Override
    public String toString(){
        return "Abiturient{" +
                "index=" + index +
                ", Surname='" + surname + '\'' +
                ", Name='" + name + '\'' +
                ", MiddleName='" + middleName + '\'' +
                ", Adress='" + adress + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                ", EverygRate=" + everygRate +
                '}';
    }

    public boolean SearchToName(String Name){
        return this.name.equals(Name);
    }

    public boolean SearchToRateUp(double Rate){
        return this.everygRate > Rate;
    }

    @Override
    public int compareTo(Abiturient other) {
        return Double.compare(this.everygRate, other.everygRate);
    }
}
