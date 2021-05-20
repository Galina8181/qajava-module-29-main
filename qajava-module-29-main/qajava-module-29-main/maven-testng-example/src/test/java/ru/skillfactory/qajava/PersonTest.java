package ru.skillfactory.qajava;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonTest {


    @DataProvider(name = "ageProvider")
    Object[][] dataProvider() {
        return new Object[][]{
                {10, false},
                {13, true},
                {19, true},
                {0, false},
                {21, false},
                {null, false},
                {-15, false}

        };
    }


    @Test(dataProvider = "ageProvider")
    public static void testIsTeenager(int age, boolean expected) {

        boolean result = Person.isTeenager(age);
        System.out.println("Age: " + age + " expected: " + expected + " result: " + result);
      assert expected;


    }
}