package com.example.android3lesson6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathApp {
    Math math;


        @Before
        public void init() {
            math = new Math();
        }


        @Test
        public void addTest() {
            assertEquals("17", math.add("12", "5"));
        }

        @Test
        public void simpleDivideTest() {
            assertEquals("2", math.divide("4", "2"));
        }

        @Test
        public void simpleMultiplyTest() {
            assertEquals("49", math.multiply("7", "7"));
        }




        @Test
        public void simpleSubtractionTest() {
            assertEquals("69", math.subtract("78", "9"));
        }

        @Test
        public void addIncludingSpacesTestCase() {
            assertEquals("17", math.add("      12", "                        5"));
        }

        @Test
        public void addIncludingMinusTestCase() {
            assertEquals("Error, negative number occurred", math.minus("-5", "3"));

        }

        @Test
        public void isDividedByZero() {
            assertEquals("Error,you can't divide by zero", math.divide("2", "0"));
        }

        @Test
        public void doesIncludeSpecialCharacters() {
            assertEquals("Error,special characters have been detected", math.areSymbolsIncluded("!@#@!#@!21312", "456"));
        }

        @After
        public void detach() {
            math = null;
        }
    }