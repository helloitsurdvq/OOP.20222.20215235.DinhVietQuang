package AimsProject.src.hust.soict.dsai.aims.cart;
import AimsProject.src.hust.soict.dsai.aims.disc.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class Cart {
    private int qtyOrdered;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private List<DigitalVideoDisc> itemsOrdered;

    public Cart() {
        qtyOrdered = 0;
        itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);
    }

    public int getQtyOrdered(){
        return this.qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        } else {
            qtyOrdered++;
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
        }
        return;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc [] dvdList){ //method 1
        for (int i = 0; i < dvdList.length; i++){
            if (qtyOrdered <= MAX_NUMBERS_ORDERED){
                itemsOrdered.add(dvdList[i]);
                qtyOrdered++;
            } else {
                System.out.println("The cart is almost full");
                return false;
            }
        }
        System.out.println("The disc has been added");
        return true;
    }

    public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){ // method 2
        if(qtyOrdered <= MAX_NUMBERS_ORDERED){
            itemsOrdered.add(dvd1);
            qtyOrdered++;
            if(qtyOrdered <= MAX_NUMBERS_ORDERED){
                itemsOrdered.add(dvd2);
                qtyOrdered++;
                System.out.println("The disc has been added");
                return true;
            } else {
                System.out.println("The cart is almost full");
                return false;
            }
        } else {
            return false;
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int find = 0;
        String discName = disc.getTitle();
        for(DigitalVideoDisc item : itemsOrdered) {
            if(item.getTitle().equals(discName)) {
                find = 1;
                itemsOrdered.remove(item);
            }
        }
        if(qtyOrdered == 0) {
            System.out.println("Your cart is empty");
            return;
        }
        if(find == 0) {
            System.out.println("Unable to found disc in your cart");
        } else {
            System.out.println("Your item has been removed");
        }
        return;
    }

    public float totalCost() {
        float sum = 0f;
        for(DigitalVideoDisc item : itemsOrdered) {
            sum += item.getCost();
        }
        return sum;
    }

    public void displayCart() {
        int index = 0;
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (DigitalVideoDisc disc : itemsOrdered){
            if (disc != null) {
                index++;
                System.out.println(index + ". " + disc);
            }
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }

    public void sortCartByTitle() {
        Collections.sort(itemsOrdered, new Comparator<DigitalVideoDisc>() {
            @Override
            public int compare(DigitalVideoDisc o1, DigitalVideoDisc o2) {
                String title1 = o1.getTitle();
                String title2 = o2.getTitle();
                int sComp = title1.compareTo(title2);

                if (sComp != 0) {
                    return sComp;
                }
                Float cost1 = o1.getCost();
                Float cost2 = o2.getCost();
                return cost1.compareTo(cost2);
            }
        });
    }

    public void sortCartByCost() {
        Collections.sort(itemsOrdered, new Comparator<DigitalVideoDisc>() {
            @Override
            public int compare(DigitalVideoDisc o1, DigitalVideoDisc o2) {
                Float cost1 = o1.getCost();
                Float cost2 = o2.getCost();
                int sComp = cost1.compareTo(cost2);
                if (sComp != 0) {
                    return sComp;
                }
                String title1 = o1.getTitle();
                String title2 = o2.getTitle();
                return title1.compareTo(title2);
            }
        });
    }
}