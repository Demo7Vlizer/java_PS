public class TypeConversion {
    public static void main(String[] args) {

        //-- Implicit Conversion_
        float myFloat = 5;
        System.out.println(myFloat);

        //-- Explicit Conversion_
        int myInt = (int) 5.47f;
        System.out.println(myInt);
    }
}

/*
    Type Conversion
    - Implicit Conversion or Coercion
    - Explicit Conversion or Casting

    ------------------------------------
    // implicit
    long big = 45;
    float dec = 3;
    double d = 3.4f;
    ( In there what's happening our Literals are small and our containers are big )

    --------------------------------------
    // explicit
    float eDec = (float) 3.4;
    long eBig = (long) 3.4;
    int eInt = (int) 3.4;

    ------------------------------------------------------------------------------

# Answer in True/False:
1. In Java, a variable's name can start with a number — **False**
2. `char` in Java can store a single character — **True**
3. Class names in Java typically start with a lowercase letter — **False**
4. `100L` is a valid long literal in Java — **True**
5. `\d` is an escape sequence in Java for a digit character — **False**
6. `Scanner` class is used for reading console input — **True**
7. In Java, an `int` can be automatically converted to a `byte` — **False**
8. Java variable names are case-sensitive — **True**
9. `Scanner` class can be used to read both primitive data types and strings — **True**
10. Explicit casting is required to convert a `double` to an `int` — **True**

*/