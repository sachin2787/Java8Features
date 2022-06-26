# Java8Features #18th March 2014
Java 8 Features:

1. Lambda Expressions
2. Functional Interface
3. Default methods and static methods
4. Predefined Functional Interfaces
    Predicate
    Function
    Consumer
    Supplier
5. Double colon operator (::)
    Method reference
    Constructor reference
6. Streams
7. Date and Time API
8. Optional class
9. Nashorn Javascript engine

---------------------------------------------
What is Lambda expression?
----------------------------
It is an anonymous function
    Nameless
    without return type
    without modifiers

Eg.

public void m1() {
    System.out.println("Hello");
}

same as

() ->  System.out.println("Hello");

-----------------------------------------

eg 2

public void m1(int a, int b) {
    System.out.println(a+b);
}

same as

(a, b) -> System.out.println(a+b);

----------------------------------------------

eg3

public in squareIt(int n) {
    return n * n ;
}

same as

(int n) -> return n * n;
(int n) -> n * n;
n -> n * n;

---------------------------------------------------------

Functional Interface
---------------------
    - interface contains sinle abstract method (SAM)
eg.
Runnable    => run()
Comparable  => compareTo()
Comparator  => compare()
ActionListener  => actionPerformed()
Callable    => call()
