package A1;

/*
 * Asa Murphy
 * Assignment 1
 * 2/07/2019
 * CS 3354
 */

public class Main
{
    public static void main(String[] args)
    {
        EnQDeQ q = new EnQDeQ(); //object declaration for the EnQDeq class
        /*
        q has access to the methods in the EnqDeq class based on the instantiation above. and we can place things inside
        the parameters of enqueue because inside the enqueue method, an object Pizza p has places for that information
        to be stored.
         */
        q.enqueue(new Pizza("pepperoni", "1234 Bobcat Trail"));
        q.enqueue(new Pizza("sausage", "2345 University Drive"));
        q.Delivery();
        q.enqueue(new Pizza("extra cheese", "3456 Rickster Road"));
        q.enqueue(new Pizza("everything", "4567 King Court"));
        q.enqueue(new Pizza("coffee beans", "5678 Java Circle"));
        q.Delivery();
        q.Delivery();
        q.Delivery();
        q.Delivery();
        q.Delivery(); // look back at the delivery method, since it handles the dequeue-ing and whether or not pizzas
                      // need to be delivered, we can just use q to call the method in main.
        return;
    }

}