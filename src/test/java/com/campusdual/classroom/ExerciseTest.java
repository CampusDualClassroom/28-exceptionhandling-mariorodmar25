package com.campusdual.classroom;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ExerciseTest {
    @Test
    @DisplayName("Test if main method does not throws any exception")
    void testDoesNotLaunchAnyException() {
        assertDoesNotThrow(() -> Exercise.main(null), "Exception throwed");
    }
}
