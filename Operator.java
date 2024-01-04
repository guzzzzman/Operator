// Name: Jose Guzman
// Date: 9/3/2023
// Description: Example of ++ and += operators
// File Name: Operator.java
// To Compile in terminal type: javac Operator.java
// To Run the program in terminal type: java Operator
class Operator
{
  // VARIABLE
  int num; 

  // CONSTRUCTOR
  Operator() // make num equal to 0 initially
  {
    num = 0;
  }

  // Mutator Method 1: increase num by 1
  void increment() 
  {
    num++; //num = num + 1
  }

  // Mutator Method 2: increase num by anotherNum
  void incrementBy(int anotherNum) 
  {
    num += anotherNum; // num = num + anotherNumber
  }
  
  //Accessor Method (shows the value)
  public String toString()
  {
    return "num is equal to " + num;
  }

  //the main(...) is where the Java program starts
  public static void main(String[] args)
  {
    // make a new Operator names op
    Operator op = new Operator(); 
    //                ^^^^^^^^^^ call Operator() constructor
    System.out.println( op );	
    //                  ^^ call toString() method

    op.increment(); // call increment() method
    System.out.println ( op );	
    op.incrementBy(10); // call incrementBy(...) method
    System.out.println ( op );	
  }
}

/*

num is equal to 0
num is equal to 1
num is equal to 11

*/