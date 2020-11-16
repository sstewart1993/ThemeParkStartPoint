package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }


    @Override
    public double defaultPrice(double price) {
        return 4.5;
    }

    @Override
    public double priceFor(Visitor price) {
        return 0;
    }


    public double payingNormalPrice(Visitor visitor){
        double wallet = visitor.getMoney() - defaultPrice(4.5);
        return wallet;
    }

    public double priceForTallPeople(Visitor visitor) {
        double wallet = visitor.getMoney();
        if (visitor.getAge() < 12){
            wallet -= defaultPrice(4.5)/2;
        }
        return wallet;
    }


}
