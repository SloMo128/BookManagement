# BookManagement 📚

A beginner-friendly Java project that demonstrates **managing a list of books** and sorting them in various ways.

This project creates a list of `Book` objects, prints them, and demonstrates sorting using different criteria such as publication year and title length.

---

## 📂 Project Structure
```
BookManagement/
│
├── Book.java
├── BookManagement.java
└── README.md
```

---

## ✨ Features

- Defines a **Book class** with title, author, and publication year  
- Stores books in an `ArrayList`  
- Sorts books by **publication year**  
- Sorts books by **title length**  
- Demonstrates multiple ways to use **`Comparator`** and **lambda expressions**  
- Prints the list of books before and after sorting  
- Clean and beginner-friendly code

---

## 🧠 How the Program Works

1. A list of books is created using `ArrayList<Book>`  
2. Three books are added with title, author, and publication year  
3. The program sorts the books in different ways:
   - By publication year using method reference
   - By title length using lambda
   - Alternative ways using lambda or `Comparator.comparingInt`
4. After each sort, the program prints the sorted list

---

## ▶ Example Output
```
Books sorted by publication year:
Title: I PROMESSI SPOSI, Author: A. Manzoni, Publication Year: 1840
Title: IL SIGNORE DEGLI ANELLI, Author: J.R.R. Tolkien, Publication Year: 1954
Title: HARRY POTTER, Author: J.K. Rowling, Publication Year: 1997

Books sorted by title length:
Title: HARRY POTTER, Author: J.K. Rowling, Publication Year: 1997
Title: I PROMESSI SPOSI, Author: A. Manzoni, Publication Year: 1840
Title: IL SIGNORE DEGLI ANELLI, Author: J.R.R. Tolkien, Publication Year: 1954

Books sorted by publication year (alternative example):
Title: I PROMESSI SPOSI, Author: A. Manzoni, Publication Year: 1840
Title: IL SIGNORE DEGLI ANELLI, Author: J.R.R. Tolkien, Publication Year: 1954
Title: HARRY POTTER, Author: J.K. Rowling, Publication Year: 1997

Books sorted by title length (alternative example):
Title: HARRY POTTER, Author: J.K. Rowling, Publication Year: 1997
Title: I PROMESSI SPOSI, Author: A. Manzoni, Publication Year: 1840
Title: IL SIGNORE DEGLI ANELLI, Author: J.R.R. Tolkien, Publication Year: 1954
```

---

## 🎯 Learning Goals

This project is designed for beginners who want to practice:

- Creating **classes and objects** in Java  
- Using **ArrayList** to store objects  
- Using **getters** to access object properties  
- Sorting lists with **Comparator** and **lambda expressions**  
- Printing and formatting output with `toString()`  
- Understanding multiple ways to sort objects in Java

---

## ⏱ Time and Space Complexity

| Complexity | Value |
|-----------|-------|
| Time      | O(n log n) (uses **TimSort** internally) |
| Space     | O(n) for internal operations  |

---
## 🚀 How to Run

1. Make sure you have **Java 8 or higher** installed.  
2. Compile the files:
   ```
   javac Book.java BookManagement.java
   ```
3. Run the program:
   ```
   java BookManagement
   ```
