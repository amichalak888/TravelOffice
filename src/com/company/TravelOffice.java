package com.company;

import javax.swing.*;
import java.util.Arrays;

public class TravelOffice {

    public static void main(String[] args) {
        Address address = new Address("Weteranów 1 ", "62-510", "Konin");

        Customer customer = new Customer("Filip Michalak");
        Trip trip = new Trip(new Date(11,01,2019),new Date(30,11,2019),"Malta");
        customer.assignTrip(trip);
        System.out.println(customer.getInfo(customer,trip,address));


            }
int counter = 0;

    Customer [] customersTable = new Customer[2];
   // Customer [] temp = new Customer[customersTable.length+2];

    void addClient (Customer customer) {
        boolean canAdd = false;

        if (canAdd){
            customersTable[counter] = customer;
            counter++;
        } else
            Arrays.copyOf(customersTable,customersTable.length+2);
        counter++;

    }


}