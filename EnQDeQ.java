package A1;

/*
 * Asa Murphy
 * Assignment 1
 * 2/07/2019
 * CS 3354
 */

public class EnQDeQ
{
    Pizza first = null;// First position in queue starts out as empty
    Pizza last = null; // last position in queue starts out as empty


    public void enqueue(Pizza p) // p is an object that contains the address
                                 // and ingredient information declared in the pizza class.
    {
        if(first == null) // if the first position is empty
        {
            first = p; //fill it with the first order that is placed.
        }
        else //otherwise
        {
            last.next = p; //the the next order is the last order in queue before its delivered
        }
        last = p; // regardless, the last position is to be filled with the last order placed.

    }

    Pizza Dequeue() //an instance method
    {

        Pizza deliv = null; //the "delivery car" has no pizzas to deliver
        if (this.first != null) // if the first position is not empty.
        {
            deliv = this.first; //place that pizza into the delivery car

            this.first = this.first.next; //then set the next pizza up to the first position,
                                          //so that it can be delivered next.
        }
        else //otherwise
        {
            this.last = null; //all orders have been taken out for delivery
        }
        return deliv; //return the status of whether or not there needs to be a pizza delivered.
    }

    public void Delivery()
    {
        Pizza p = Dequeue(); //calls the method and associates it with the actual pizza class
        if (p == null) //if there are no pizzas to deliver.
        {
            //Then all orders
            System.out.println("There are currently no deliveries pending.\n");
            return;
        }
        //otherwise there are pizzas to be made and delivered.
        System.out.println("Deliver a pizza with " + p.ingredients + " to " + p.address +
                           " within 30 minutes or it's FREE!! ");

    }

}
