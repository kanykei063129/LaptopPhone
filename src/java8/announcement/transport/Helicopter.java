package java8.announcement.transport;

import java.time.LocalDate;

public class Helicopter extends Airplane{
    public Helicopter(String name, String image, double price, String description, String colour, LocalDate yearOfIssue) {
        super(name, image, price, description, colour, yearOfIssue);
    }
    
}
