package ru.skillfactory.qajava;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class PersonTest {
    @BeforeTest
    public void beforeTest() {
        System.out.println("Тест запущен!");
        currentTime();
    }

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
    @AfterTest
    public void afterTest () {
        System.out.println("Тест завершен!");
        currentTime();
    }

    public void currentTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyy/mm/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

}
