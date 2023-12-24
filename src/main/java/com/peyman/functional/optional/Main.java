package com.peyman.functional.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.of("Hello"); // Creates an Optional with a non-null value
        Optional<String> emptyOptional = Optional.empty(); // Creates an empty Optional

        //Accessing the Value:
        optionalValue = Optional.of("Hello");
        String value = optionalValue.get(); // Retrieves the value, can throw NoSuchElementException if the value is not present

        //Checking if a Value is Present:
        optionalValue = Optional.of("Hello");
        if (optionalValue.isPresent()) {
            System.out.println("Value is present: " + optionalValue.get());
        } else {
            System.out.println("Value is not present");
        }

        //Using Default Value:
        optionalValue = Optional.empty();
        value = optionalValue.orElse("Default Value"); // Returns the value if present, otherwise returns the default value
        System.out.println(value); // prints "Default Value"

        //Using IFPresent
        optionalValue = Optional.of("Hello");
        optionalValue.ifPresent(val -> System.out.println("Value is present: " + val)); // Executes the consumer if a value is present

        optionalValue = Optional.of("Hello");
        Optional<String> filteredValue = optionalValue.filter(val -> val.length() > 5); // Filters the value based on a condition
        filteredValue.ifPresent(val -> System.out.println("Filtered Value: " + val)); // Prints "Filtered Value: Hello"
    }
}
