package AimsProject;

import AimsProject.hust.soict.dsai.aims.cart.Cart;
import AimsProject.hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args){
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        anOrder.addDigitalVideoDisc(dvd1, dvd2);
//        anOrder.removeDigitalVideoDisc(dvd2);
//      Display cart
//        System.out.println();
//        anOrder.displayCart();

        // Display total cost
//        System.out.printf("Total Cost: %.2f \n", anOrder.totalCost());

        //Sort cart by title
//        anOrder.sortCartByTitle();
//        System.out.println();
//        System.out.println("--- Sort cart by title ---");
//        anOrder.displayCart();

        //Sort cart cost
//        anOrder.sortCartByCost();
//        System.out.println();
//        System.out.println("--- Sort cart by Cost ---");
//        anOrder.displayCart();

        //Remove dist from cart
//        System.out.println();
//        System.out.println("-- Remove " + dvd2.getTitle() + "from cart --");
//        anOrder.removeDigitalVideoDisc(dvd2);
//        anOrder.displayCart();

//        DigitalVideoDisc [] dvdList = {dvd2, dvd3};
//        anOrder.addDigitalVideoDisc(dvd1);
//        anOrder.addDigitalVideoDisc(dvdList);
//        anOrder.displayCart();
    }
}