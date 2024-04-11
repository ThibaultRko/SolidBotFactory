- SolidBotFactory is a simple exercise that allows for the synthesis and practical application of the 5 principles of the SOLID method.



- **Adhere to the Single Responsibility Principle (SRP)**: Each class should have a single responsibility. For instance, in the shared code, the `Worker`, `Warrior`, and `Transporter` classes each have a single `job()` method that defines their specific work.

- **Adhere to the Open/Closed Principle (OCP)**: Classes should be open for extension but closed for modification. For instance, in the shared code, `SolidBot` is an abstract class that can be extended by other classes (`Worker`, `Warrior`, and `Transporter`), but it is not modified itself.

- **Adhere to the Liskov Substitution Principle (LSP)**: Subtypes must be substitutable for their base types. For instance, in the shared code, `Worker`, `Warrior`, and `Transporter` are all substitutable for `SolidBot`.

- **Adhere to the Interface Segregation Principle (ISP)**: Clients should not be forced to depend on interfaces they do not use. For instance, in the shared code, the `WalkingBot` and `RollingBot` traits are defined separately, meaning that classes that do not need the functionality of `RollingBot` do not have to depend on this interface.

- **Adhere to the Dependency Inversion Principle (DIP)**: High-level modules should not depend on low-level modules. Both should depend on abstractions. For instance, in the shared code, `SolidBot` depends on the `QuoteRepository` abstraction rather than a specific implementation (`JsonQuoteRepository`).
