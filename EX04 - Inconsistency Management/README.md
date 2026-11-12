# Financial Inconsistency Detection System

## About the Project

The **Financial Inconsistency Detection System** is a Java application designed to simulate a banking transaction monitoring system, identifying potentially suspicious behavior and generating alerts for further analysis.

The project aims to apply fundamental concepts of Object-Oriented Programming (OOP), data structures, layered architecture, encapsulation, and business rule implementation.

Its purpose is to represent, in a simplified way, some of the challenges found in financial systems, particularly in monitoring and identifying potentially fraudulent transactions.

## Features

The system is being developed to provide the following functionalities:

### Account Management
- Representation of bank accounts.
- Storage of information such as account number, account holder, and balance.

### Transaction Management
- Registration of financial transactions.
- Identification of transaction types: deposits, withdrawals, and transfers.
- Recording of transaction date, time, amount, and status.
- Retrieval and management of registered transactions.

### Inconsistency Detection

Implementation of business rules to identify potentially suspicious behavior:

- **High-Value Transactions:** identifies transactions that exceed a predefined financial threshold.
- **Duplicate Transactions:** checks for repeated transactions.
- **Rapid Transactions:** identifies multiple transactions occurring within a short period of time, which may indicate suspicious activity.

### Alert Management
- Generation of alerts associated with suspicious transactions.
- Risk classification.
- Alert status management, allowing users to track their progress.
- Retrieval, updating, and deletion of alerts.

## Technologies and Concepts

- **Java** — primary programming language.
- **Object-Oriented Programming (OOP)** — encapsulation, classes, objects, and enums.
- **Java Collections Framework** — lists for data storage and manipulation.
- **BigDecimal** — accurate representation and comparison of monetary values.
- **LocalDateTime** — date and time manipulation.
- **Optional** — handling potentially absent values.
- **Git and GitHub** — version control and code management.

## Project Structure

The project follows a structure organized according to the responsibilities of each layer:

| Package | Responsibility |
|---|---|
| `model` | Represents the application's entities and their attributes. |
| `repository` | Handles data storage and management. |
| `rules` | Implements inconsistency detection rules. |
| `service` | Coordinates operations and applies business rules. |

### Main Entities

- `Account`: represents a bank account.
- `Transaction`: represents a financial transaction.
- `FraudAlert`: represents an alert generated from a suspicious transaction.

### Business Rules

- `HighValueRule`
- `DuplicateTransactionRule`
- `RapidTransactionRule`

## How to Run the Project

### Prerequisites

- Java JDK installed.
- An IDE of your choice (IntelliJ IDEA, Eclipse, or VS Code).
- Git installed (optional, for cloning the repository).

### Step-by-Step Instructions

**1. Clone the repository**

```bash
git clone https://github.com/annestefanie/OOP_CLASS_EXERCISES/
```

**2. Navigate to the project directory**

```bash
cd "EX04 - Inconsistency Management"
```

**3. Open the project in your IDE**

Open the project folder and wait for your IDE to recognize the Java project structure and source files.

**4. Run the application**

Locate the `Main.java` class and execute its `main()` method.

> Make sure the JDK is properly configured in your IDE.