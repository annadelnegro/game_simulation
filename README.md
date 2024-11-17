# **Game Simulation Project**

This project consists of a Java-based game simulation, accompanied by a Python script for testing its functionality. The main purpose of the project is to simulate a game between two players and evaluate the outcomes based on specific criteria.

## **Project Structure**

### **Java Files**
- **`Game.java`**
  - Core logic for the game simulation.
  - Handles game mechanics such as player turns, decision-making, and win conditions.

- **`GameDriver.java`**
  - Entry point of the Java application.
  - Responsible for setting up the game and managing the interaction between players and the `Game` class.

### **Python Files**
- **`p1testscript.py`**
  - Automated test script written in Python.
  - Runs simulations with multiple random seeds to verify if Player 1 consistently wins the game under predefined conditions.

### **Sample Solution**
- **`samplesolutionp1.txt`**
  - Contains the results of the test script.
  - Demonstrates that Player 1 consistently wins the game across 10 test scenarios.

---

## **Getting Started**

### **Prerequisites**
- Java Development Kit (JDK) 8 or later.
- Python 3.x.
- A text editor or IDE for Java development (e.g., IntelliJ IDEA, Eclipse).
- Python package manager (`pip`) for running the test script.

### **Setup**
1. Clone or download this repository.
2. Place the Java files (`Game.java` and `GameDriver.java`) into a project folder in your Java IDE.
3. Ensure the Python script (`p1testscript.py`) and sample solution (`samplesolutionp1.txt`) are in the same directory.

---

## **Usage**

### **Running the Game**
1. Compile the Java files:
   ```bash
   javac Game.java GameDriver.java
