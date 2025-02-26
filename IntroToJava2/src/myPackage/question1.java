package myPackage;

import java.awt.desktop.SystemEventListener;

public class question1 {

    enum house{
        Small_house(100),
        Medium_house(200),
        Large_house(700);
        private int price;
        house(int price){}
        public int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        for(house h : house.values()){
            System.out.println(h+" price is "+h.getPrice());
        }
        house  h1 = house.Large_house;
        System.out.println(h1+" "+h1.getPrice());
    }
}
