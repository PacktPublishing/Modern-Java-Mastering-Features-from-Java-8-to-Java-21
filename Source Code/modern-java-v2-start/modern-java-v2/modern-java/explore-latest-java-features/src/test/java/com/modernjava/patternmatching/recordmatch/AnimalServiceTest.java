package com.modernjava.patternmatching.recordmatch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalServiceTest {

    AnimalService animalService = new AnimalService();

    @ParameterizedTest()
    @MethodSource("input")
    void retrieveName(Animal animal, String expectedResult) {
        var name = animalService.retrieveName(animal);
        assertEquals(expectedResult, name);
    }

    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new Cat("Kitty", "Black"), "Kitty"),
                Arguments.of(new Dog("Scooby", "Black"), "Scooby"),
                Arguments.of(null, "")
        );
    }
}