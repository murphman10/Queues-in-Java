package A1;

/*
 * Asa Murphy
 * Assignment 1
 * 2/07/2019
 * CS 3354
 */

public class Pizza
{
    String address, ingredients; // data types needed to define pizza.
    Pizza next = null; //instance of pizza but there is nothing in it.
                       //works as a transporter between the first and last queue position.

    Pizza(String ingredients, String address) //constructor
    {
        // Links variables from Pizza class to variables that are used when the class
        // is instantiated
        this.address = address;
        this.ingredients = ingredients;
        /*
        "this.address" and "this.ingredients" represent the variables defined in the pizza
        class. they are linked to the address and ingredients variables defined by the
        constructor. When you create and instance of Pizza to be used, it will hold
        information for ingredients and the address.
         */
    }
}
