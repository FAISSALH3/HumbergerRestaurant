package com.Faissal;

class BasicHamburger {
    private String breadRoll;
    private String meat;
    private int BasePrice;
    private boolean lettuce ;
    private boolean tomato;
    private boolean carrot ;
    private  boolean onion;
    private double lettucePrice;
    private double onionsPrice ;
    private double tomatoPrice;
    private double carrotsPrice;

    public BasicHamburger(String breadRoll, String meat, boolean lettuce, boolean tomato, boolean carrot, boolean onion) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        BasePrice = 10;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.onion = onion;
        if(isCarrot())
        {
            this.carrotsPrice = 1;
        }
        if(isLettuce())
        {
            this.lettucePrice = 1;
        }
        if(isOnion())
        {
            this.onionsPrice = 2;
        }
        if(isTomato())
        {
            this.tomatoPrice = 3;
        }
    }

    public boolean isLettuce() {
        return lettuce;
    }
    public boolean isTomato() {
        return tomato;
    }
    public boolean isCarrot() {
        return carrot;
    }
    public boolean isOnion() {
        return onion;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getOnionsPrice() {
        return onionsPrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getCarrotsPrice() {
        return carrotsPrice;
    }

    public int getBasePrice() {
        return BasePrice;
    }

    public  double priceTotal()
    {
        double additionsPrice =getCarrotsPrice()+getLettucePrice()+getOnionsPrice()+getTomatoPrice();
        return additionsPrice+getBasePrice();
    }
}
class healthy  extends BasicHamburger{
    private double addition1price;
    private double addition2price;
    private boolean addition1;
    private boolean addition2;

    public healthy( String meat, boolean lettuce, boolean tomato, boolean carrot, boolean onion, boolean addition1 , boolean addition2) {
        super("brown rye bread roll", meat, lettuce, tomato, carrot, onion);
        if(isAddition1())
        {
            this.addition1price = 0.25;
        }
        if(isAddition2())
        {
            this.addition2price = 0.75;
        }
    }

    public double getAddition1price() {
        return addition1price;
    }

    public double getAddition2price() {
        return addition2price;
    }

    @Override
    public double priceTotal() {
        double additionPrice=getAddition1price()+getAddition2price();
        return super.priceTotal()+additionPrice;
    }

    public boolean isAddition1() {
        return addition1;
    }

    public boolean isAddition2() {
        return addition2;
    }
}

class deluxe extends BasicHamburger{
    private boolean chips;
    private double chipsPrice;
    private boolean coke;
    private double cokePrice;

    public deluxe(String breadRoll, String meat, boolean chips, boolean coke) {
        super(breadRoll, meat ,false,false , false ,false);
        if(chips== true)
        {
            this.chipsPrice=1;
        }
        if(coke== true)
        {
            this.cokePrice =2;
        }
    }

    @Override
    public double priceTotal() {
        return super.priceTotal()+getCokePrice()+getChipsPrice();
    }
    public double getChipsPrice() {
        return chipsPrice;
    }

    public double getCokePrice() {
        return cokePrice;
    }

}


public class Main {

    public static void main(String[] args) {

        BasicHamburger regular = new BasicHamburger("brown", "chicken" ,true, true, true, false);
       System.out.println(regular.priceTotal());
       healthy newHealthy = new healthy("chicken",false, true, true,true, true, true);
        System.out.println(newHealthy.priceTotal());
        deluxe newDeluxe= new deluxe("brown","chicken", true , true);
        System.out.println(newDeluxe.priceTotal());
        System.out.println(newDeluxe.getChipsPrice());
    }
}
