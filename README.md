## Reflection

### How can I ensure that my code, program, or software is functional and secure?
I ensure functionality by writing comprehensive unit tests using JUnit to validate individual methods and behaviors. This allows me to catch bugs early and confirm that all use cases are handled. To maintain security, I validate inputs, follow clean coding practices, and minimize exposure of sensitive data. For example, in Project One, I implemented constraints to prevent invalid contact data such as null or overly long values.

### How do I interpret user needs and incorporate them into a program?
I begin by analyzing user requirements and identifying what features or constraints are necessary. These are translated into testable code components. During Project One, I used the specification to ensure that contact details like phone number length and unique IDs met the required criteria, then created corresponding test cases to verify them.

### How do I approach designing software?
My approach involves using object-oriented principles to break down the system into manageable classes and services. I typically start by outlining responsibilities, followed by writing pseudocode or class diagrams if needed. I often follow a test-driven development mindset, writing tests alongside implementation. This helped me design `ContactService` in a modular and testable way, making the program easier to maintain and extend.
