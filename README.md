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
-It is an anonymous function

    Nameless
    without return type
    without modifiers


How to write lambda expression?
----------------------------------
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

(int n) -> {return n * n;}
(int n) -> n * n;
n -> n * n;

without curly braces we cannot use return keyword
within curly braces if we want to return some value compulsory we should use return statement.  

---------------------------------------------------------

Functional Interface
---------------------
    - interface contains sinle abstract method (SAM)
    - it can have any number if default methods and static methods
    - @FunactionalInterface
eg.
Runnable    => run()
Comparable  => compareTo()
Comparator  => compare()
ActionListener  => actionPerformed()
Callable    => call()

--------------------------------------------------------

Anonymous inner class:
--------------------------------
    -can extend a normal class
    - can extend a abstract class
    - can implement an interface which contains any number of abstract class

Lambda expression can implement an interface which contains a single abstract method (Functional interface)

Anonymous inner class != Lambda expression

Anonymous inner class > Lambda expression

-----------------------------------------------------------------------

Default Methods:
-----------------------------------------
until java 1.7-
Every method present inside interface is always: public and abstract

Related methods:
1.8 V: default methods + static methods
1.9 v: private methods


Interface Variables:
-------------------------

public static final

--------------------------------------------------

Default method == Virtual extensions method == defender method:
--------------------------------------------------------------

Without effecting implementation classes if we want to add new method to interface  

----------------------------------------------------------------------------


class vs interface:
=====================

----------------------------------------------

static method:
--------------

From 1.8 v we can write static method in interface
to define general utility methods inside interface

---------------------------------------------------------

Predefined Functional Interfaces:
----------------------------------

https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

1. Predicate
2. Function
3. Consumer
4. Supplier

Two argument predefined functional interfaces:

1. BiPredicate
2. BiFunction
3. BiConsumer

Primitive Functional Interfaces:

1. IntPredicate
2. IntFunction
3. IntConsumer

----------------------------------------------

Predicate:
-----------
    -conditional check

take some input and perform some conditional check and returns boolean value

    @FunctionalInterface
    public interface Predicate<T> {
        boolean test(T t);
    }

    Eg.
    Predicate<Integer> t = i -> i % 2 == 0;
    System.out.println(t.test(10));
    System.out.println(t.test(13));
    System.out.println(t.test(500));
    Predicate joining:

p1.or(p2)
p1.and(p2)
p1.negate()

----------------------------------------

Function:
---------
take some input and perform some operation and return the result which is need not be boolean type

Interface Function<T,R>
Type Parameters:
T - the type of the input to the function
R - the type of the result of the function

    @FunctionalInterface
    public interface Function<T,R>

    Represents a function that accepts one argument and produces a result.
    This is a functional interface whose functional method is apply(Object).

     Function<Integer, Integer> f = i -> i * i;
     System.out.println(f.apply(5));
     System.out.println(f.apply(9));

Function chaining:

f1.andThen(f2).apply(i)
f1.compose(f2).apply(i)

-----------------------------------------------------------

Consumer:
----------

Accept some input and perform required operation and not required to return anything

    @FunctionalInterface
    public interface Consumer<T> {
        void accept(T t);
    }

Represents an operation that accepts a single input argument and returns no result. Unlike most other functional interfaces, Consumer is expected to operate via side-effects.
    
    Eg.
    Consumer<String> c = s -> System.out.println(s);
    c.accept("Sachin");
    c.accept("Monika");

-------------------------------------------------------------

Supplier:
---------

Just supply my required objects and it won't take any input

    interface Supplier<R>  {
        public R get();
    }
