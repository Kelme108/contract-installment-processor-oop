# Contract Installment Processor

This project is a simple Java application designed to simulate the processing of contracts and the generation of monthly installments using clean Object-Oriented Programming principles.

The main goal of this project is not just to calculate installments, but to demonstrate **good software design**, such as separation of concerns, use of interfaces, and dependency injection.

---

## 🧠 Project Idea

A company wants to automate the processing of its contracts.  
Each contract is divided into monthly installments, and the payment is handled by an online payment service (initially, PayPal).

Each installment:
- Has a due date (one per month)
- Applies monthly interest
- Applies a payment fee
- Is generated automatically based on the contract data

The system was built in a way that allows new payment services to be added without changing the core logic.

---

## 🏗️ Project Structure


```text
src
├── application
│   └── Program.java
│
├── entities
│   ├── Contract.java
│   └── Installment.java
│
└── services
    ├── OnlinePaymentService.java
    ├── PaypalService.java
    └── ContractService.java

---

## ⚙️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Interfaces & Polymorphism
- Dependency Injection
- Git & GitHub
- IntelliJ IDEA

---

## 🧩 Design Highlights

- **Entities** are responsible only for data representation
- **Services** handle business logic
- **Interfaces** allow easy replacement of payment services
- **Low coupling** between components
- **High cohesion** in each class
- Easy to extend (Open/Closed Principle)

---

## 💡 Example Scenario

Contract value: `600.00`  
Number of installments: `3`

Generated installments:
07/25/2018 - 206.04
08/25/2018 - 208.08
09/25/2018 - 210.12

---

## 🔄 How to Extend This Project

You can easily add new payment methods by creating new implementations of the `OnlinePaymentService` interface:

- CreditCardService
- PixService
- BankSlipService

No changes are required in the core contract logic.

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/contract-installment-processor.git
Open the project in IntelliJ IDEA

Run the Program class

🎯 Purpose
This project was built for learning purposes and to practice:

Clean code

Object-oriented design

Real-world modeling

Professional Git workflow
