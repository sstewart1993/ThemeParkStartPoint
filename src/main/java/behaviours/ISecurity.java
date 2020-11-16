package behaviours;

import people.Visitor;

public interface ISecurity {

    default Boolean isAllowedTo(Visitor visitor) {
        if((visitor.getAge() > 18))
            return true;
        else{
            return false;
        }
    }
}
