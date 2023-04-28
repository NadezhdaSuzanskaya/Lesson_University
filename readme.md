Create a class hierarchy (15 classes min) for the University
Done for the class 04/21/2023:
- the hierarchy has been redone, the following classes have been added:
   -Lesson;
   - LectureLesson;
   - PracticeLesson;
   - Discipline;
   - EcomonicDiscipline;
   - InformationSecurityDiscipline
- the following methods were overrided
   - toString() (class Professor, MasterDegreeStudent, BachelorDergeeStudent , Assistant, AdministrativeStaff);
   - equals() (class EcomonicDiscipline and class InformationSecurityDiscipline);
   - calcBonus() (class Professor, Assistant, AdministrativeStaff);
- added new package for constants
- added final variable 'RATE' (class PersonConstants), final methods minSalary() and calcSalary() (class Employee)
- added readme file
- added .gitignore file
----------------------------------------------
Done for the class 04/25/2023:
- added 2 enums Departments (used in the classes Assistent, Professor, Students) and Semesters (used in the classes EcomonicDiscipline and InformationSecurityDiscipline);
- added 5 interfaces:
  -- IAskBonus (implements in the class Professor)
  -- IChangeClassRoom (implements in the classes  PracticeLesson, LectureLesson)
  -- IChangeCountOfLesson (implements in the classes  PracticeLesson, LectureLesson)
  -- IChangeDepartment  (implements in the classes  BachelorDergeeStudent, MasterDegreeStudent, Professor)
  -- ILeaveFeetback (implements in the classes  BachelorDergeeStudent, MasterDegreeStudent)
- created static variable (int count) in the class Professor
- created final class CalcSalary with the method calcMinSalary
----------------------------------------------
Done for the class 04/28/2023:
- created 5 custom exceptions:
   -- LargeNumberException (used in the class University in try-catch block)
   -- LongValueException (used in the class Professor method askBonusForCollege)
   -- NegativeValueException (used in the  University in try-catch block)
   -- NullValueException (used in the class Professor method askBonusForCollege)
   -- SpecificSymbolException (used in the class Professor method askBonusForCollege)
- handled exceptions in 2 ways
- used try-catch with resources
- logged messages to the console, file

