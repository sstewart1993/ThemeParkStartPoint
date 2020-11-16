package behaviours;

import people.Visitor;

public interface ITicketed {

    double defaultPrice(double price);

    double priceFor(Visitor price);
}
