# Exercise 3

## Inventory Management

A Java repository created to practice and demonstrate fundamental **Object-Oriented Programming (OOP)** concepts. This project simulates basic product control, highlighting encapsulation, access modifiers, inventory management methods, and business logic validation.

---

### Technologies Used

* **Java** (JDK 8+)
* Applied Concepts: Object-Oriented Programming (OOP), Encapsulation, Getters and Setters, Input Validation.

---

### Features & Business Logic

The `Produto` class implements the following operations:

1. **Constructor:** Initializes the product with a name, price, and initial stock level.
2. **Encapsulation:** Private attributes (`nome`, `preco`, `qtdEmEstoque`) safely accessed and updated via `getter` and `setter` methods.
3. **Add Stock (`adicionarEstoque`):** Increments inventory only when the added quantity is greater than zero.
4. **Sales Processing (`vender`):** Reduces inventory provided the requested quantity is valid (greater than zero) and sufficient stock is available.
5. **Display Summary (`exibirResumo`):** Outputs a formatted overview of the product's current state to the console.

---

### Project Structure

The project consists of two core classes:

* **`Produto.java`**: Defines attributes, constructor, accessors/mutators (`get`/`set`), and domain logic methods (`adicionarEstoque`, `vender`, `exibirResumo`).
* **`Main.java`**: The execution class that instantiates a `Produto` object and runs test scenarios for each method.

---

### How to Run

1. Ensure you have the **JDK** installed on your system.
2. Clone or download this repository.
3. Open your terminal or IDE (such as VS Code or Eclipse) and compile the source files:
   ```bash
   javac Main.java Produto.java