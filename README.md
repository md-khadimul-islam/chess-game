# ♟ Chess Game – Object Oriented Design in Java

A console-based chess engine built using clean Object-Oriented Design principles.  
This project focuses on modelling the domain correctly rather than building a UI.

It is ideal for learning Low Level Design (LLD) and preparing for coding interviews & university viva.

---

## 🚀 Overview

The system simulates a two-player chess game.  
It maintains board state, validates moves using polymorphism, and tracks move history.

The design emphasizes separation of concerns and extensibility.

---

## 🧠 High Level Architecture

```
Main → Game → Board → Square → Piece
```

- **Main** starts the application  
- **Game** controls the flow  
- **Board** maintains current positions  
- **Square** represents a cell  
- **Piece** defines movement rules  

---

## 📁 Project Structure

```
src/
 ├── app/
 │   └── Main.java
 │
 ├── game/
 │   ├── Game.java
 │   ├── Board.java
 │   ├── Square.java
 │   ├── Player.java
 │   └── Move.java
 │
 ├── enums/
 │   ├── Color.java
 │   └── GameStatus.java
 │
 └── pieces/
     ├── Piece.java
     └── Knight.java
```

---

## ✨ Features

- Two-player turn-based gameplay  
- 8×8 board representation  
- Each piece controls its own movement logic  
- Move validation  
- Capture handling  
- Move history tracking  
- Clean and extendable design  

---

## ⚙️ How the System Works

When a player makes a move:

1. Game receives source & destination.
2. It checks if a piece exists.
3. Confirms the correct player's turn.
4. Calls `piece.canMove()`.
5. If valid → board updates.
6. Move is stored.
7. Turn switches.

---

## 🧩 OOP Concepts Demonstrated

### Encapsulation
Each object manages its own data.

### Abstraction
Movement rules are hidden behind `canMove()`.

### Polymorphism
Game treats all pieces uniformly.

### Single Responsibility Principle
Each class has one clear job.

---

## ▶️ How to Run

From project root:

```bash
cd src
javac app/*.java game/*.java enums/*.java pieces/*.java
java app.Main
```

---

## 🧪 Example Output

```
Chess Game Started
Move 1 success: true
Move 2 success: true
```

---

## 🔮 Future Enhancements

- Add remaining pieces  
- Path blocking logic  
- Check / Checkmate detection  
- Special moves (castling, en passant, promotion)  
- GUI or web interface  
- AI opponent  
- Persistence & replay  

---

## 🎯 Why This Project Matters

This implementation mirrors real interview problems where the goal is to design maintainable, extendable systems.

It demonstrates understanding of:
- domain modelling  
- responsibility separation  
- scalable architecture  

---

## 👨‍💻 Author

**Md. Khadimul Islam**

---

## 📜 License

For educational purposes.
