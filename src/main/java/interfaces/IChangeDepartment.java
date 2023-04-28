package interfaces;

import enums.Departments;
import exceptions.NullValueException;

public interface IChangeDepartment {
    Departments changeDepartment(Departments newDepartment) throws NullValueException;
}
