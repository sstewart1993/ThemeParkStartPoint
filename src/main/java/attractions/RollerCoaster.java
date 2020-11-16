package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public Boolean isAllowedToRide(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 145)
            return true;
        else{
            return false;
        }
    }


    @Override
    public double defaultPrice(double price) {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor price) {
        return 0;
    }

    public double payingNormalPrice(Visitor visitor){
        double wallet = visitor.getMoney() - defaultPrice(8.4);
        return wallet;
    }

    public double priceForTallPeople(Visitor visitor) {
        double wallet = visitor.getMoney();
        if (visitor.getHeight() >200){
            wallet -= defaultPrice(8.4)*2;
        }
        return wallet;
    }
}
