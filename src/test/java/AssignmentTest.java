
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {

    @Test
    void testCalculateMovieNight() {
        double expected = 56.25; // (2 * 12.50) + (3 * 8.00) + 7.25
        assertEquals(expected,calculateMovieNight(), 0.01,
            "Movie night total should be $56.25");}

            double calculateMovieNight(){
                double ticketPriceAdult = 12.50; 
                double ticketPriceChild = 8.00; 
                double snackCost = 7.25; 

                int adultTickets = 2; 
                int childTickets = 3;

                return (adultTickets * ticketPriceAdult) + (childTickets * ticketPriceChild) + snackCost;}
            
    

    @Test
    void testCanRentCar() {
        assertTrue(Assignment.canRentCar(25), "Age 25 should be able to rent a car");
        assertTrue(Assignment.canRentCar(30), "Age 30 should be able to rent a car");
        assertFalse(Assignment.canRentCar(24), "Age 24 should not be able to rent a car");
        assertFalse(Assignment.canRentCar(18), "Age 18 should not be able to rent a car");}

        public static boolean canRentCar(int age) {
        return age >= 25;

       }
    

    @Test
    void testIsValidPasswordLength() {
        assertTrue(Assignment.isValidPasswordLength("password123"), 
            "Password of length 11 should be valid");
        assertTrue(Assignment.isValidPasswordLength("exactly8"), 
            "Password of length 8 should be valid");
        assertFalse(Assignment.isValidPasswordLength("short"), 
            "Password of length 5 should not be valid");}

            public static boolean isValidPasswordLengths(String password) { 
            return password.length() >= 8;
        
    }

    @Test
    void testNeedsOilChange() {
        assertTrue(Assignment.needsOilChange(65000, 59999), 
            "Should need oil change after 5001 miles");
        assertTrue(Assignment.needsOilChange(75000, 70000), 
            "Should need oil change after 5000 miles");
        assertFalse(Assignment.needsOilChange(64000, 59999), 
            "Should not need oil change after 4001 miles");}

            public static boolean needsOilChange(int currentMileage, int lastOilChangeMileage) {
                return (currentMileage - lastOilChangeMileage) >= 5000; 
            }

    @Test
    void testGetDivisibleByThreeMessage() {
        assertEquals("Divisible by 3", getDivisibleByThreeMessage(9),
            "9 should be divisible by 3");
        assertEquals("Divisible by 3", getDivisibleByThreeMessage(0),
            "0 should be divisible by 3");
        assertEquals("", getDivisibleByThreeMessage(7),
            "7 should not be divisible by 3");
        assertEquals("", getDivisibleByThreeMessage(-7),
            "Negative numbers not divisible by 3 should return empty string");
        assertEquals("Divisible by 3", getDivisibleByThreeMessage(-9),
            "Negative numbers divisible by 3 should return message");}

            public static String getDivisibleByThreeMessage(int number) {
                if (number % 3 == 0) {
                    return "Divisible by 3";
                } else {
                    return "";
                }
            }
        
    @Test
    void testGetLeapYearMessage() {
        assertEquals("Leap Year", Assignment.getLeapYearMessage(2024),
            "2024 should be a leap year");
        assertEquals("Not Leap Year", Assignment.getLeapYearMessage(2100),
            "2100 should not be a leap year (divisible by 100 but not 400)");
        assertEquals("Leap Year", Assignment.getLeapYearMessage(2000),
            "2000 should be a leap year (divisible by 400)");
        assertEquals("Not Leap Year", Assignment.getLeapYearMessage(2023),
            "2023 should not be a leap year");}

            public static String getLeapYearMessage(int year) {
                if (year % 400 == 0) {
                    return "Leap Year";
                } else if (year % 100 == 0) {
                    return "Not Leap Year";
                } else if (year % 4 == 0) {
                    return "Leap Year";
                } else {
                    return "Not Leap Year";
                }
            }

    @Test
    void testGetTicketPriceCategory() {
        assertEquals("Free", Assignment.getTicketPriceCategory(4),
            "Age 4 should be free");
        assertEquals("Child Price", Assignment.getTicketPriceCategory(5),
            "Age 5 should be child price");
        assertEquals("Child Price", Assignment.getTicketPriceCategory(12),
            "Age 12 should be child price");
        assertEquals("Student Price", Assignment.getTicketPriceCategory(13),
            "Age 13 should be student price");
        assertEquals("Student Price", Assignment.getTicketPriceCategory(21),
            "Age 21 should be student price");
        assertEquals("Adult Price", Assignment.getTicketPriceCategory(22),
            "Age 22 should be adult price");}



    public static String getTicketPriceCategory(int age) {
        if (age <= 4) {
            return "Free";
        } else if (age <= 12) {
            return "Child Price";
        } else if (age <= 21) {
            return "Student Price";
        } else {
            return "Adult Price";
        }
    }

}
