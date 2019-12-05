package com.company;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Address address = new Address("Weteranów 1 ", "62-510", "Konin");

        Customer customer = new Customer("Filip Michalak");
        Trip trip = new Trip(new Date(11, 01, 2019), new Date(30, 11, 2019), "Malta", 1999.99);
        customer.assignTrip(trip);
        System.out.println(customer.toString(customer, trip, address));

        Customer customer1 = new Customer("Ola Kowalska");
        Trip trip1 = new Trip(new Date(11, 01, 2019), new Date(30, 11, 2019), "Malta", 1999.99);
        customer.assignTrip(trip);
        System.out.println(customer.toString(customer, trip, address));


        trip.setFinalPrice(3000);
        System.out.println(trip.getFinalPrice());
        System.out.println(trip.getPrice());

        AboardTrip aboardTrip = new AboardTrip(new Date(2019,03,10),new Date(2019,04,01),"Maroko",3000,333);
        System.out.println("Cena wycieczki z ubezpieczeniem: "+aboardTrip.getPrice());
        int counter = 0;

        DomesticTrip domesticTrip = new DomesticTrip(new Date(2019,03,10),new Date(2019,04,01),"mkmds",4500,459);
        System.out.println("Cena wycieczki z obniżką "+domesticTrip.getOwnArrivalDiscount());

        Customer[] customersTable = new Customer[2];
       Customer [] temp = new Customer[customersTable.length+2];

     public void addClient (Customer customer){
           boolean canAdd = false;
           if (canAdd) {
               customersTable[counter] = customer;
             counter++;
          } else
              Arrays.copyOf(customersTable, customersTable.length + 2);
          counter++;
       }


    }
}
