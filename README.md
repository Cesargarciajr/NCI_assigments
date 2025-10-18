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

| # | Assignment Title | Description |
|---|------------------|-------------|
| 1 | **Leap Year Checker** | Determines if a given year is a leap year using nested if-statements and logical operators. |
| 2 | **Rock Paper Scissors Game** | A simple game using `JOptionPane` dialogs, random numbers, and arrays for choices. |
| 3 | **Text Adventure Story** | Interactive story using nested if statements to control the narrative flow. |
| 4 | **Programme Code Venue Finder** | Validates user programme code (case-insensitive) and outputs a venue message. |

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
