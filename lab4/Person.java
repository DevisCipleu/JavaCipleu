package lab4;

import java.util.Scanner;

public class Person {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String email;



    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
