# ☕ Java Basics – Concept Explanations & Code Guide

This folder contains practical Java programs designed to help beginners understand fundamental programming concepts through implementation.

Each program focuses on a specific concept, explains how it works, and demonstrates how Java executes the code.

The goal is not just to learn Java syntax but to understand the logic behind every program.

---

# 📚 1. Variables

**File:** `Variables.java`

## What are Variables?

A variable is a named memory location used to store data that can be accessed and modified during program execution.

In Java, every variable must have a declared data type.

### Basic Syntax

```java
dataType variableName = value;
```

### Example

```java
public class Variables {
    public static void main(String[] args) {

        int age = 21;
        double salary = 25000.50;
        char grade = 'A';
        String name = "Sneha";

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(grade);
    }
}
```

### Code Explanation

- `int age = 21;` – Creates an integer variable named `age`.
- `double salary = 25000.50;` – Stores a decimal value.
- `char grade = 'A';` – Stores a single character.
- `String name = "Sneha";` – Stores a sequence of characters.
- `System.out.println()` – Displays the values on the console.

### Important Points

- Variables store data that programs use.
- Every variable has a name and a data type.
- Local variables must be initialized before they are used.
- Java is a statically typed language.

**Key Learning:** Understand how Java stores, accesses, and manipulates data using variables.

---

# 📚 2. Data Types

**File:** `DataTypes.java`

## What are Data Types?

Data types specify the kind of value a variable can store.

Java data types are broadly divided into two categories:

### A. Primitive Data Types

Java has eight primitive data types.

| Data Type | Description | Example |
|---|---|---|
| byte | Small integer | `byte a = 10;` |
| short | Short integer | `short b = 100;` |
| int | Integer | `int c = 500;` |
| long | Large integer | `long d = 10000L;` |
| float | Single-precision decimal | `float e = 10.5f;` |
| double | Double-precision decimal | `double f = 20.55;` |
| char | Single character | `char g = 'A';` |
| boolean | True or false | `boolean h = true;` |

### B. Non-Primitive Data Types

These include:

- String
- Arrays
- Classes
- Interfaces
- Objects

### Example

```java
public class DataTypes {
    public static void main(String[] args) {

        int number = 100;
        float price = 25.5f;
        double value = 123.456;
        char letter = 'S';
        boolean isJavaEasy = true;
        String language = "Java";

        System.out.println(number);
        System.out.println(price);
        System.out.println(value);
        System.out.println(letter);
        System.out.println(isJavaEasy);
        System.out.println(language);
    }
}
```

### Code Explanation

- `int` stores whole numbers.
- `float` stores decimal numbers and uses the `f` suffix.
- `double` stores decimal numbers with greater precision than `float`.
- `char` stores one character using single quotes.
- `boolean` stores either `true` or `false`.
- `String` stores text using double quotes.

**Key Learning:** Understand the eight primitive data types and how Java represents different kinds of information.

---

# 📚 3. Type Casting

**File:** `TypeCasting.java`

## What is Type Casting?

Type casting is the process of converting a value from one data type to another.

Java supports two major types of type conversion.

### A. Widening Casting (Implicit)

Converting a smaller data type into a larger compatible data type.

Example:

```java
int number = 100;
double result = number;

System.out.println(result);
```

Here, Java automatically converts the integer into a double.

Common widening order:

`byte → short → int → long → float → double`

### B. Narrowing Casting (Explicit)

Converting a larger data type into a smaller data type.

Example:

```java
double price = 99.99;
int result = (int) price;

System.out.println(result);
```

Output:

```text
99
```

The decimal portion is removed because an integer cannot store fractional values.

### Important Points

- Widening casting is generally automatic.
- Narrowing casting requires explicit conversion.
- Narrowing may cause data loss.
- Casting does not guarantee that the converted value will fit without overflow.

**Key Learning:** Understand automatic and manual data type conversion and when to use each.

---

# 📚 4. Operators

**File:** `Operators.java`

## What are Operators?

Operators are special symbols used to perform operations on variables and values.

Java provides several categories of operators.

### A. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning |
|---|---|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (remainder) |

Example:

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

### B. Relational Operators

Used to compare two values.

| Operator | Meaning |
|---|---|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

### C. Logical Operators

Used to combine or reverse boolean conditions.

| Operator | Meaning |
|---|---|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

### D. Assignment Operators

Used to assign or update values.

Examples: `=`, `+=`, `-=`, `*=`, `/=`, `%=`.

### E. Unary Operators

Operate on a single operand.

Examples:

- `++` – Increment
- `--` – Decrement

### F. Ternary Operator

A shorthand way of writing a simple conditional expression.

```java
int age = 21;

String result = (age >= 18) ? "Adult" : "Minor";

System.out.println(result);
```

### Important Concept: Pre-increment vs Post-increment

- `++a` increments the value before using it in the expression.
- `a++` uses the current value first, then increments it.

**Key Learning:** Understand how operators perform calculations, comparisons, logical operations, and value assignments.

---

# 📚 5. Conditional Statements

**File:** `ConditionalStatements.java`

## What are Conditional Statements?

Conditional statements allow a program to make decisions based on whether a condition is true or false.

### A. if Statement

Executes a block when a condition is true.

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

### B. if-else Statement

Chooses between two alternatives.

```java
int number = 7;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### C. else-if Ladder

Checks multiple conditions in sequence.

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 50) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

### D. Nested if

An if statement placed inside another if statement.

It is useful when one condition should be checked only after another condition is satisfied.

### E. switch Statement

Used when one expression needs to be compared against multiple possible cases.

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    default:
        System.out.println("Invalid day");
}
```

The `break` statement prevents execution from falling through into subsequent cases.

**Key Learning:** Understand how to control program execution using decision-making statements.

---

# 📚 6. Loops

**File:** `Loops.java`

## What are Loops?

Loops are used to execute a block of code repeatedly as long as a specified condition is satisfied.

Java provides three main types of loops.

### A. for Loop

Used when the number of iterations is generally known.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Execution:

1. `int i = 1` – Initialization.
2. `i <= 5` – Condition checking.
3. `System.out.println(i)` – Loop body.
4. `i++` – Update.
5. The process repeats until the condition becomes false.

### B. while Loop

Checks the condition before executing the loop body.

```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

If the condition is initially false, the loop body will not execute.

### C. do-while Loop

Executes the loop body first and checks the condition afterward.

```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

A do-while loop always executes at least once.

### Comparison

| Loop | Condition Checked | Minimum Executions |
|---|---|---|
| for | Before execution | 0 |
| while | Before execution | 0 |
| do-while | After execution | 1 |

**Key Learning:** Understand repetitive execution and choose the appropriate loop based on the problem.

---

# 📚 7. Nested Loops

**File:** `NestedLoops.java`

## What are Nested Loops?

A nested loop is a loop placed inside another loop.

The inner loop executes completely for every iteration of the outer loop.

### Example: Pattern Printing

```java
public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
```

### Output

```text
*
* *
* * *
* * * *
```

### Code Explanation

**Outer Loop:**

```java
for (int i = 1; i <= 4; i++)
```

Controls the number of rows.

**Inner Loop:**

```java
for (int j = 1; j <= i; j++)
```

Controls the number of stars printed in each row.

**print():** Prints stars on the same line.

**println():** Moves the cursor to the next line after each row.

### Execution Understanding

| Outer Loop (`i`) | Inner Loop Executions (`j`) | Stars |
|---|---|---|
| 1 | 1 | * |
| 2 | 2 | * * |
| 3 | 3 | * * * |
| 4 | 4 | * * * * |

### Applications

- Pattern printing
- Matrix traversal
- Two-dimensional arrays
- Multiplication tables
- Nested comparisons

**Key Learning:** Understand how multiple loops work together and how to develop pattern-based programming logic.

---

# 📚 8. Jump Statements

**File:** `JumpStatements.java`

## What are Jump Statements?

Jump statements change the normal flow of program execution.

Java mainly provides three jump statements.

### A. break

Terminates the nearest enclosing loop or switch statement.

Example:

```java
for (int i = 1; i <= 10; i++) {

    if (i == 5) {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

When `i` becomes 5, the loop terminates immediately.

### B. continue

Skips the current iteration and proceeds to the next iteration.

Example:

```java
for (int i = 1; i <= 5; i++) {

    if (i == 3) {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

The value 3 is skipped.

### C. return

Terminates the execution of the current method and optionally returns a value to the calling method.

Example:

```java
public class ReturnExample {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        System.out.println(result);
    }
}
```

Output:

```text
30
```

### Difference Between break, continue, and return

| Statement | Purpose |
|---|---|
| break | Terminates the nearest loop or switch |
| continue | Skips the current loop iteration |
| return | Exits the current method |

**Key Learning:** Understand how to control execution flow and terminate or skip particular operations.

---

# 📚 9. Methods

**Folder:** `05-Methods/`

## What are Methods?

A method is a block of code designed to perform a specific task. Methods help make programs reusable, modular, and easier to maintain.

This folder contains five practical implementations.

| No. | Program | Main Concept |
|---|---|---|
| 01 | `01-MethodDeclaration.java` | Method declaration and calling |
| 02 | `02-MethodWithParameters.java` | Passing arguments |
| 03 | `03-MethodWithReturnValue.java` | Returning values |
| 04 | `04-MethodOverloading.java` | Compile-time polymorphism |
| 05 | `05-Recursion.java` | Recursive method calls |

For detailed explanations and implementations, visit:

[Explore Methods Documentation](./05-Methods/)

---

# 🎯 Final Learning Outcomes

After completing these programs, learners should be able to:

- Understand Java variables and data types.
- Perform operations using different operators.
- Convert values between compatible data types.
- Apply decision-making statements.
- Use loops for repetitive execution.
- Understand nested iteration and pattern printing.
- Control program flow using jump statements.
- Create reusable methods and understand recursion.

## 🚀 Practice Suggestions

After studying each program:

1. Run the code yourself.
2. Change the input values and observe the output.
3. Try modifying the conditions and loop limits.
4. Write a similar program without looking at the original code.
5. Explain the logic in your own words.

**Remember:** The best way to learn programming is to understand the logic, experiment with code, and practice consistently.

---

**✨ Understand the concept. Trace the execution. Write the code. Build the logic. ✨**
