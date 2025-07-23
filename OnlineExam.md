=========================================
          Online Examination System
=========================================

Description:
-------------
This is a console-based Online Examination System developed in Java. 
It allows users to take a simple multiple-choice test and receive a final score.

How to Run:
------------
1. Compile: javac OnlineExam.java
2. Run: java OnlineExam

Features:
----------
- User input for name
- 5 multiple-choice questions
- Each question has 4 options
- User inputs option number (1 to 4)
- Score and PASS/FAIL displayed at the end

Sample Output:
---------------
Welcome to the Online Exam System
Enter your name: Prasad

Q1: Which keyword is used to define a class in Java?
1. class
2. def
3. struct
4. define
Your answer (1-4): 1

... (more questions)

Exam Over! Your Score: 4/5
Status: PASS

Developer Notes:
-----------------
- Add more questions by extending the `questions` array.
- You can integrate a timer or question shuffling for extra challenge.
