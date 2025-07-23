==============================
       Tic Tac Toe Game
==============================

Description:
-------------
This is a two-player Tic Tac Toe game that runs in the terminal.
Players take turns entering coordinates to place their mark ('X' or 'O') on a 3x3 grid.

How to Run:
------------
1. Compile: javac TicTacToe.java
2. Run: java TicTacToe

Features:
----------
- 3x3 game board
- Turn-based player logic (X and O)
- Input validation for already filled cells
- Win/draw detection

Instructions:
--------------
- The board has rows and columns numbered 0 to 2.
- On your turn, enter two numbers (row and column) to place your mark.
- First player to get 3 in a row (horizontal, vertical, or diagonal) wins.
- If all cells are filled and no winner, the game is a draw.

Sample Input:
---------------
Player X, enter row and column (0-2): 0 1
Player O, enter row and column (0-2): 1 1

... and so on

Developer Notes:
-----------------
- You can enhance it by adding a single-player mode with AI.
- Consider converting it to a GUI using Java Swing for better UX.
