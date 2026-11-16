# ☕ Java Methods – Complete Concept Guide & Practical Implementations

![Java](https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk)
![Topic](https://img.shields.io/badge/Topic-Methods-blue?style=for-the-badge)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-success?style=for-the-badge)
![Status](https://img.shields.io/badge/Focus-Practical%20Learning-brightgreen?style=for-the-badge)

> **Write reusable code. Understand method execution. Build stronger programming logic.**

Welcome to the **Java Methods** module!

Methods are one of the most important building blocks of Java programming. They allow us to divide a large program into smaller, manageable, reusable blocks of code.

This module contains five practical Java programs that explain method declaration, parameter passing, return values, method overloading, and recursion.

The objective is to understand not only how to write methods but also how Java executes them and how they make programs more structured and maintainable.

---

# 📑 Table of Contents

1. [Introduction to Methods](#1-introduction-to-methods)
2. [Method Declaration and Calling](#2-method-declaration-and-calling)
3. [Methods with Parameters](#3-methods-with-parameters)
4. [Methods with Return Values](#4-methods-with-return-values)
5. [Method Overloading](#5-method-overloading)
6. [Recursion](#6-recursion)
7. [Important Java Concepts](#7-important-java-concepts)
8. [Difference Between Important Method Concepts](#8-difference-between-important-method-concepts)
9. [Common Beginner Mistakes](#9-common-beginner-mistakes)
10. [Practice Questions](#10-practice-questions)
11. [Learning Outcomes](#11-learning-outcomes)

---

# 1. Introduction to Methods

## What is a Method in Java?

A **method** is a block of code that performs a particular task. It executes when it is called.

Instead of writing the same instructions repeatedly, we can define a method once and call it whenever required.

### Why Do We Use Methods?

Methods help us to:

- Avoid unnecessary code repetition.
- Improve code reusability.
- Divide complex problems into smaller tasks.
- Make programs easier to read and understand.
- Simplify debugging and maintenance.
- Organize program logic efficiently.

### Real-Life Example

Think of a calculator.

A calculator performs different operations:

- Addition
- Subtraction
- Multiplication
- Division

Each operation can be implemented as a separate method.

Instead of writing all the logic inside `main()`, we can create separate methods for each operation.

### General Syntax of a Method

```java
accessModifier static returnType methodName(parameters) {

    // Method body

    return value;
}
```

### Understanding the Syntax

| Component | Explanation |
|---|---|
| Access Modifier | Defines where the method can be accessed |
| `static` | Allows calling the method through the class without creating an object |
| Return Type | Specifies the type of value returned by the method |
| Method Name | The name used to call the method |
| Parameters | Inputs received by the method |
| Method Body | Contains the statements to be executed |
| `return` | Sends a value back to the caller when required |

**Note:** A method can also be an instance method, without the `static` keyword. The examples in this module primarily use static methods for simplicity.

---

# 2. Method Declaration and Calling

**File:** `01-MethodDeclaration.java`

## Concept: What is Method Declaration?

Method declaration means defining a method with its name, return type, parameters, and body.

Method calling means requesting Java to execute that method.

### Example Program

```java
public class MethodDeclaration {

    static void greet() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    public static void main(String[] args) {

        greet();

    }
}
```

### Output

```text
Hello! Welcome to Java Methods.
```

### Detailed Code Explanation

**Step 1: Class Declaration**

```java
public class MethodDeclaration {
```

Creates a class named `MethodDeclaration`.

In Java, the public class name must match the filename.

**Step 2: Method Declaration**

```java
static void greet() {
```

- `static`: The method belongs to the class.
- `void`: The method does not return any value.
- `greet()`: The name of the method.
- `{ }`: Defines the method body.

**Step 3: Method Body**

```java
System.out.println("Hello! Welcome to Java Methods.");
```

This statement executes whenever the `greet()` method is called.

**Step 4: Main Method**

```java
public static void main(String[] args) {
```

This is the entry point of a standard Java application launched by the Java launcher.

**Step 5: Method Calling**

```java
greet();
```

Calls the `greet()` method.

When Java encounters this statement, execution transfers to the method body, executes its statements, and then returns to the calling code.

### Understanding the Execution Flow

1. Java starts executing `main()`.
2. It encounters `greet()`.
3. Control transfers to the `greet()` method.
4. The message is printed.
5. The method finishes.
6. Control returns to `main()`.

### Important Points

- A method does not execute just because it is declared.
- It must be called to execute.
- A `void` method does not return a value.
- A static method can be called directly from another static method in the same class.

**Key Learning:** Understand how to declare, define, and call a method in Java.

---

# 3. Methods with Parameters

**File:** `02-MethodWithParameters.java`

## Concept: What are Parameters?

Parameters are variables declared in a method definition that receive values when the method is called.

They allow a method to work with different inputs instead of using fixed values.

### Example Program

```java
public class MethodWithParameters {

    static void add(int a, int b) {

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        add(10, 20);

        add(50, 30);

    }
}
```

### Output

```text
Sum = 30
Sum = 80
```

### Detailed Code Explanation

**Step 1: Define the Method**

```java
static void add(int a, int b)
```

Here:

- `add` is the method name.
- `int a` is the first parameter.
- `int b` is the second parameter.
- `void` means no value is returned.

**Step 2: Perform the Operation**

```java
int sum = a + b;
```

Adds the values received through the parameters.

**Step 3: Print the Result**

```java
System.out.println("Sum = " + sum);
```

Displays the calculated sum.

**Step 4: Call the Method**

```java
add(10, 20);
add
