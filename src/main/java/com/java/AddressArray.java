package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressArray {
    ArrayList<AddressBook>obj=new ArrayList<>();
    public void addContact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName=sc.next();
        System.out.println("Enter last name: ");
        String lastName=sc.next();
        System.out.println("Enter address: ");
        String address=sc.next();
        System.out.println("Enter city: ");
        String city=sc.next();
        System.out.println("Enter state: ");
        String state=sc.next();
        System.out.println("Enter zip: ");
        int zip=sc.nextInt();
        System.out.println("Enter phone number: ");
        int phone=sc.nextInt();
        System.out.println("Enter email: ");
        String email=sc.next();
        AddressBook ab=new AddressBook(firstName,lastName,address,city,state,zip,phone,email);
        AddressArray arr=new AddressArray();
        arr.obj.add(ab);
        System.out.println(ab);
    }
    public static void main(String[] args) {
        AddressArray arr=new AddressArray();
        arr.addContact();
    }
}
