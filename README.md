# Library Management System

A simple Java console application for managing a library's books. The system allows users to add books, purchase available books, track the library's budget, and persist all data between application runs using a JSON file.

## Features

* **Add books** with a name, author, price, and number of copies.
* **Buy books** with availability and stock checks.
* **Stock management** by automatically decreasing the number of available copies after each purchase.
* **Budget tracking** by adding the price of each purchased book to the total budget.
* **Data persistence** using a `books.json` file.
* **Interactive console menu** for simple user interaction.
* **Automatic JSON handling** using the Gson library.

## Project Structure

| File               | Responsibility                                                            |
| ------------------ | ------------------------------------------------------------------------- |
| `Book.java`        | Represents a book with its name, author, price, and number of copies.     |
| `Budget.java`      | Manages the library's total budget and updates it after each sale.        |
| `JsonHandler.java` | Handles reading and writing book data using Gson.                         |
| `Repo.java`        | Acts as the data access layer for storing, searching, and updating books. |
| `Operations.java`  | Contains the application's business logic, such as purchasing books.      |
| `Main.java`        | Application entry point and handles the interactive console menu.         |

## Architecture

The project separates its responsibilities into different layers:

```text
Main
  ↓
Operations
  ↓
Repo
  ↓
JsonHandler
  ↓
books.json
```

* **Main** handles user interaction.
* **Operations** contains the business logic.
* **Repo** manages book-related data operations.
* **JsonHandler** handles persistence through Gson.
* **Budget** keeps track of the library's financial state.

This separation keeps the code organized and makes the project easier to maintain and extend.

## Requirements

* Java **JDK 8 or later**
* **Gson** library (`com.google.code.gson:gson`)

## How to Run

1. Open the project in **IntelliJ IDEA** or any Java-compatible IDE.
2. Add the **Gson** library to the project.
3. Run `Main.java`.
4. Use the console menu to interact with the system:

```text
1 - Buy a book
2 - Add a new book
3 - Exit
```

If `books.json` does not exist when the application starts, the system initializes with an empty book list. The file is created automatically when book data is saved.

## Data Persistence

The application stores the library's books in a `books.json` file using the **Gson** library.

Example:

```json
[
  {
    "BookName": "Clean Code",
    "Author": "Robert C. Martin",
    "price": 250,
    "copies": 3
  }
]
```

When the application starts, existing book data is loaded from the file. Changes are automatically saved so that the data is preserved between runs.

## Example Workflow

A typical interaction with the application is:

```text
1 - Buy a book
2 - Add a new book
3 - Exit

Enter your choice: 2

Enter book name: Clean Code
Enter author: Robert C. Martin
Enter price: 250
Enter number of copies: 3

Book added successfully.

Enter your choice: 1

Enter book name: Clean Code

Book purchased successfully.
```

After the purchase, the number of available copies is decreased and the book's price is added to the total budget.

## Technologies Used

* **Java**
* **Gson**
* **JSON**
* **Object-Oriented Programming (OOP)**

## Project Status

This project is a completed implementation of a simple library management system designed to demonstrate Java OOP, separation of responsibilities, file persistence, and basic business logic.
