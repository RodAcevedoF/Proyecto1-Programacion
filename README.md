# Patient Triage Console App

A simple Java console application that simulates a basic patient triage system. It validates user input, allows selection of symptoms and specific examinations, and displays a summary.

## Features

- **NUSS Code Input**: Prompts for a 6-digit NUSS identifier.
- **Symptom Selection**: Choose from Pain, Traumatic Injury, High Fever, or Confusion/Disorientation.
- **Examination Type**: Provides detailed sub-options based on selected symptom.
- **Temperature & Priority**: Enter body temperature (27–45°C) and priority level (0–5).
- **Summary Table**: Displays all inputs in a formatted table.

## Project Structure

```
preWork/
└── Proyecto1/
    └── Proyecto1.java    # Main application
```

## How to Run

1. **Clone or download** the project.
2. **Compile**:
   ```bash
   javac -d out src/preWork/Proyecto1/Proyecto1.java
   ```
3. **Run**:
   ```bash
   java -cp out preWork.Proyecto1.Proyecto1
   ```

## Example Session

```
Enter NUSS:
123456

Select your symptom:
0. Pain
1. Traumatic Injury
2. High Fever
3. Confusion/Disorientation

Choose option: 0

Select examination type:
0. Chest pain
1. Abdominal pain
2. Headache
3. Migraine

Choose option: 2

Enter Temperature (27-45):
38

Enter Priority Level (0-5):
3

Your Input Summary:
NUSS       SYMPTOM                       EXAMINATION                    PRIORITY            TEMPERATURE
123456     Pain                          Headache                       3                   38
```

## Requirements

- Java 11 or higher

---
