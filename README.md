# Docrob's Intro to Java

1. output hello world

2. declare and init a variable

3. output the variable

4. assign a random number to the variable

5. use an if statement to compare the random variable

6. add an else to the if

7. put it in a function to keep things clean

8. use a loop to do it 5 times 

9. get input from the user 

10. make a get user input function 

11. sketch out an algorithm for the guessing game

12. make the game

------------------

## Old Notes

## Brief language rundown

- Origin
- Compiled
- Object-oriented
- CLI vs IDE
- The future of Java

## Hello World
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
```
BRIEFLY explain the parts:
- package
- Class and filename
- `main()`
- methods, functions, etc.
- public, static, void
- parameters
- `System`
- `out`
- `println`
- a String literal

**Run from the IDE:**

- Compiling (look in target/classes folder)
- Execution (the Java VM)

**Run from the command line:**
`java -cp target/classes done.HelloWorld`

## Guessing Game

### Make a new class

### Make `main()`

### Explain algorithm 

### Come up with an algorithm for the guessing game

1. determine a random number from 1 to 10
2. give the user 5 guesses
3. for each guess, the user enters a # from 1 to 10
4. if the guess is too high or too low, tell the user
5. if the guess is right, tell the user and end the program
6. after 5 guesses, if the user has not guessed correctly, tell the user game over and end the program

### step 1: introduce the Random class and making a Random object
- declaring a variable `rnd`
- initializing to a new object
- declaring an `int` variable
- initializing to the return value of a function

### step 2:
- create a loop that iterates 5 times
- initialize, test, increment

### step 3: get input from the user
- declare a Scanner variable with global scope
- explain `Scanner`
- explain `in`
- explain `private`
- create a function that returns an int from the scanner
- be sure to call `scanner.nextLine();` after getting the int

### step 4: 
- the `if` conditional
- explain `continue`
- explain `else` and `else if`

### step 5:
- explain `System.exit`