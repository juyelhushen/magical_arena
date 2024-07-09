# Magical Arena Game

### Description
This is a Java implementation of a turn-based magical arena game where two players fight until one of them loses all health.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven

#### Compile the code:
   ```bash
   mvn compile
   ```

#### Run the Game
   ```bash
   java -cp target/classes com.swiggy.App
   ```
#### Run all the Unit test cases
   ```bash
   mvn test
```

## Project Structure

- `src/main/java/com/swiggy/`: Contains main Java source files.
   - `Player.java`: Defines the Player class with attributes and methods for the game.
   - `MagicalArena.java`: Implements the MagicalArena class where players fight.
   - `App.java`: Main class to start the game.

- `src/test/java/com/swiggy/`: Contains unit test Java source files.
   - `PlayerTest.java`: Tests for the Player class including health, strength, attack, and dice roll methods.
   - `AppTest.java`: Tests for the MagicalArena class to verify game mechanics and outcomes.

- `pom.xml`: Maven Project Object Model (POM) file defining project configuration, dependencies, and build settings.

## Note: 
 This project requires Maven for dependency management and build automation. Make sure to have Maven installed and configured on your system to compile, run, and test the project.
