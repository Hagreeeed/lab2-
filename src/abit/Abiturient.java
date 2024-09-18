package abit;
import java.util.ArrayList;
import java.util.Collections;

public class Abiturient implements Comparable<Abiturient> {

    private int index;
    private String Surname;
    private String Name;
    private String MiddleName;
    private String Adress;
    private String PhoneNumber;
    private double EverygRate;

    public Abiturient(int index, String Surname, String Name, String MiddleName, String Adress, String PhoneNumber, double EverygRate){
        this.index = index;
        this.Surname = Surname;
        this.Name = Name;
        this.MiddleName = MiddleName;
        this.Adress = Adress;
        this.PhoneNumber = PhoneNumber;
        this.EverygRate = EverygRate;
    }

    public int getIndex(){
        return index;
    }

    public String getSurname(){
        return Surname;
    }

    public String getName(){
        return Name;
    }

    public String getMiddleName(){
        return MiddleName;
    }

    public String getAdress(){
        return Adress;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }

    public double getEverygRate(){
        return EverygRate;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public void setSurname(String Surname){
        this.Surname = Surname;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setMiddleName(String MiddleName){
        this.MiddleName = MiddleName;
    }

    public void setAdress(String Adress){
        this.Adress = Adress;
    }

    public void setPhoneNumber(String PhoneNumber){
        this.PhoneNumber = PhoneNumber;
    }

    public void setEverygRate(double EverygRate){
        this.EverygRate = EverygRate;
    }

    @Override
    public String toString(){
        return "Abiturient{" +
                "index=" + index +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", Adress='" + Adress + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", EverygRate=" + EverygRate +
                '}';
    }

    public boolean SearchToName(String Name){
        return this.Name.equals(Name);
    }

    public boolean SearchToRateUp(double Rate){
        return this.EverygRate > Rate;
    }

    @Override
    public int compareTo(Abiturient other) {
        return Double.compare(this.EverygRate, other.EverygRate);
    }
}
