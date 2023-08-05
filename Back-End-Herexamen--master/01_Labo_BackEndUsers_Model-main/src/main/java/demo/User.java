package demo;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private int age;
    private String email;
    private String password;
    private List<Integer> membershipYears = new ArrayList<Integer>();

    public User(String name, int age, String email, String password) {
        this.name = name;
        if (age >= 0) 
            this.age = age;
        this.email = email;
        this.password = password;
    }

    public int countMembershipYearsAfter1999 () {
        int result = 0;
        for(Integer year: membershipYears) {
            if (year > 1999)
                result++;
        }
        return result;
    }

    public int countYearsOfMembership () {
        return membershipYears.size();
    }

    public void addMembershipYear (int year) {
        membershipYears.add(year);
    }
    public int getFirstMembershipYear(){
        int length = membershipYears.size();
        
        if (length == 0){
            return 0;
        }
        int lowest = membershipYears.get(0);
        for(int year:membershipYears){
            if (year<lowest){
                lowest = year;
            }
        }return lowest;
    }
    public int getNumberOfMembershipYearsIn2000(){
        int counter = 0;
        if(membershipYears.contains(2000)){
            for(int year:membershipYears){
                if (year <= 2000){
                    counter += 1;
                }
            }return counter;
        }
        return counter;
    }

    public int getAge() {
        return this.age;
    }

    public String getName () {
        return name;
    }
    public String getEmail(){
        if(email.contains("@")){
            return email;
        }
        return null;
        
    }
    public String getPassword(){
        if(password.contains(" ")){
            password = "t";
        }
        return "@$-"+password+"&%#";
    }
    public String toString(){
        return name+" is "+age+" years old and has as email "+email;
    }
    public Boolean isPasswordCorrect(String password){
        if(password.contains("rara")){
            return false;
        }return true;
    }

}