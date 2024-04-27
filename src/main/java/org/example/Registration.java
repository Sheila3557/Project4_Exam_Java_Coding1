package org.example;

public class Registration {
    private String email;
    private String userName;
    private String password;

    private void displayUserName(){
        System.out.println(userName);
    }
    public void printName(){
        System.out.println(email);
    }

    public static void main(String[] args) {
        Registration reg =new Registration();
        reg.userName= "Buttons123";
        reg.password= "pass123";
        reg.displayUserName();
        reg.email= "spvgn123@yahoo.com";
        reg.printName();

    }
}



