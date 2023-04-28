package interfaces;

import exceptions.LongValueException;
import exceptions.NullValueException;
import exceptions.SpecificSymbolException;

public interface IAskBonus {
    double askPersonalBonus();

    String askBonusForCollege(String name) throws NullValueException, LongValueException, SpecificSymbolException;

}
