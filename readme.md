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
----------------------------------------------
Done for the class 05/05/2023:
- added all class objects to the collection (9 collections) in the University.java
- build jar file and deploy to the local repository
- added and used 2 Plugins
- build shade-jar file
----------------------------------------------
Done for the class 05/12/2023:
- all blocks try-catch from main class moved to related classes:
  -- checkNumberOfProfessors() in the Professor,
  -- checkNumberOfLecture() in the LectureLesson
- created MyLinkedList with the methods getMyLinkedList, addMyLinkedList, printMyLinkedList
  and use it in the class BachelorDergeeStudent
- created 2 more Enums and use them as parameters in the class Lesson:
  -- NumberOfClassRoom with field and  static block,
  -- TypeOfClassRoom with field and abstract method getClassRoomTitle()
- created 1 custom Lambda functions with generics:
  -- ICalcBonus use it in the class Professor in the method calcProfessorBonus() and in the class Assistant in the method calcAssistantBonus()
- used  5 lambda functions from the java.util.function package:
  -- roundToNearestInt in the class Assistant in the method calcAssistantBonus()
  -- sum class Professor in the method calcProfessorSalary()
  -- isGreaterThan in the class Professor in the method compareSalaryWithOverage()
  -- printUpperCase  in the class BachelorDergeeStudent in the method leaveComplain()
  -- printString in the class University
-----------------------------------------------
 Done for the class 05/16/2023:
 - created 2 more enums "Marks" and "Disciplines"
 - created one more class "AcademicPerformance"
 - created 6 methods in the class BachelorDergeeStudent with 7 collection streaming
   -- in method 'calcAverageMark()'
   -- in method 'calcAverageMarksForAllDisciplines()'
   -- in method 'calcGeneralAverage()'
   -- in method 'filterDisciplineByName()'
   -- in method 'getListOfGoodMarks()'
   -- in method 'getHighestMarkForEachDiscipline()'

