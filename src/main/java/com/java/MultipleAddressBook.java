package com.java;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleAddressBook {
    ArrayList<AddressArray>arr=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public void add (){
        System.out.println("Enter Address book name:");
        String name=sc.next();
        boolean duplicate=arr.stream().anyMatch(a->a.name.equals(name));
        if (duplicate){
            System.out.println("Address book already exists!!");
        }
        else {
            arr.add(new AddressArray(name));
            System.out.println(arr);
        }
    }
    public void edit(){
        System.out.println("Enter the address book Name: ");
        String addName= sc.next();
        for (int i =0;i<arr.size();i++){
            if (arr.get(i).name.equals(addName)){
                arr.get(i).method();
            }
        }
    }
    public void view(){
        for (int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
    public void display(){
        while (true){
            System.out.println("1: Add address book\n2: Edit address book\n3: View address book\n4: Exit\nEnter Your option: ");
            int i = sc.nextInt();
            switch (i){
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid option!!");
                    break;
            }
        }
    }
}
