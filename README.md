<p align="center">
  <a href="https://www.ncirl.ie">
    <img src="https://www.ncirl.ie/Portals/0/NCI_Logo_Colour-01.png?ver=2024-11-11-111228-410" 
         alt="National College of Ireland Logo" width="180">
  </a>
</p>

<h1 align="center">🧠 Java Programming Assignments</h1>
<h3 align="center">Software Development Coursework – National College of Ireland</h3>

This repository contains my Java assignments and mini-projects completed as part of my **Software Development** coursework at [National College of Ireland](https://www.ncirl.ie).
Each program demonstrates fundamental programming concepts such as conditionals, loops, arrays, classes, and GUI (Swing).

---

## 📚 Table of Contents
- [About the Repository](#about-the-repository)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Assignments Overview](#assignments-overview)
- [Example: Rock Paper Scissors Game](#example-rock-paper-scissors-game)
- [Author](#author)

---

## 🧩 About the Repository
This repo serves as a collection of small Java programs and assignments that I’ve built during my software development course.  
Each folder or `.java` file represents a specific lab or project topic, such as:
- Control structures (if/else, loops)
- Arrays and functions
- Classes and objects
- GUI programming with `JOptionPane`
- Logical and nested conditionals
- Random number generation
- Simple game logic

---

## 🧰 Technologies Used
- **Language:** Java 17+  
- **IDE:** IntelliJ IDEA / NetBeans / VS Code *(choose yours)*  
- **GUI Library:** Swing (`javax.swing`)  
- **Version Control:** Git & GitHub

---

## 🏃 How to Run

1. **Clone this repository:**
   ```bash
   git clone https://github.com/your-username/java-assignments.git
   cd java-assignments
   ```

2. **Compile and run** any `.java` file:
   ```bash
   javac FileName.java
   java FileName
   ```

   Or open the project folder in your preferred IDE and run the file directly.

---

## 🧪 Assignments Overview

This section summarizes the main topics and example programs created week-by-week.

| Week | Key programs / topics | Notes |
|---:|:---------------------|:-----|
| Week 1 | `MyFirstProgram`, `SimpleAddition`, debug exercises | Intro to Java syntax, printing, variables and arithmetic. |
| Week 2 | `EggBox`, `MonthlyWage`, `SimpleAddition` | User input (console & JOptionPane), parsing numeric types, simple calculations. |
| Week 3 | `MonthlyWageApp`, `EggBoxApp`, `Rectangle`, `Salary` | Introducing classes/objects, setters/getters, small app drivers. |
| Week 4 | `IfStatements` labs, `Cinema`, `Random`, `PositiveOrNegative`, `OddOrEven` | Conditionals, modulo, branching logic and simple GUIs. |
| Week 5 | `CinemaNest`, advanced lab exercises | Nested loops, control flow and program structuring. |
| Week 6 | Week 6 lab exercises | Continued practice with methods, arrays and small apps. |
| Week 7 | `GuessNumber` games, lab assignments | Random numbers, loops, user input validation, game logic. |
| Week 8 | `grid`, lab assignments | 2D arrays, formatted output and printing patterns. |
| Week 9 | `Reverse`, `StringChecker`, `CountLetters`, `CountVowels`, `SecondLetter`, `ExaclamationString` | String manipulation, character processing and small utility classes. |

---

## 🎮 Example: Rock Paper Scissors Game

```java
String[] options = {"🪨", "📄", "✂️"};
int computerInput = (int)(Math.random() * 3);
int userInput = JOptionPane.showOptionDialog(
    null, 
    "Choose one of the options!", 
    "Rock Paper Scissors", 
    JOptionPane.DEFAULT_OPTION, 
    JOptionPane.QUESTION_MESSAGE, 
    null, 
    options, 
    options[0]
);
```

Features:
- Randomized computer choice  
- GUI via `JOptionPane`  
- Keeps score across multiple rounds  

---

## 👨‍💻 Author
**Cesar Garcia**  
📧 *cesargarcia.elder@gmail.com*  
🎓 *Software Development Student*  
💼 [GitHub Profile](https://github.com/Cesargarciajr)

---

## 📜 License
This repository is for educational purposes only.  
Feel free to explore and learn from the code — but please **do not plagiarize** for academic submissions.
