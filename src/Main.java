import java8.announcement.Announcement;
import java8.announcement.devices.Laptop;
import java8.announcement.devices.Phone;
import java8.announcement.home.Home;
import java8.announcement.transport.Airplane;
import java8.announcement.transport.Car;
import java8.announcement.transport.Helicopter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Iphone", "\uD83D\uDE0E", 5000, "Amazing phone", "14 PRO Max", 256);
        Phone phone2 = new Phone("Samsung", "\uD83E\uDD29", 3654278, "Great phone", "S21", 128);
        Phone[] phones = {phone1, phone2};

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D", 643546187, "Wonderful laptop", "Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16", 5000, "Productive laptop", "Windows");
        Laptop[] laptops = {laptop1, laptop2};

        Home home1 = new Home("Ihlas", "\uD83C\uDFE2", 5000, "Great Home", "Multi-storey", 10);
        Home home2 = new Home("Chaos", "\uD83C\uDFE0", 26149, "Amazing Home", "House", 25);
        Home[] homes = {home1, home2};

        Car car1 = new Car("Mercedes-Benz", "\uD83D\uDE98", 5000, "Wonderful Car", "Black", LocalDate.of(2010, 3, 6));
        Car car2 = new Car("BMW", "\uD83D\uDE99", 5000, "Fast Car", "Purple", LocalDate.of(2020, 8, 28));
        Car[] cars = {car1, car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire", "\uD83D\uDEE9", 81790, "Fast Airplane", "White", LocalDate.of(2015, 1, 14));
        Airplane airplane2 = new Airplane("Airbus A320", "✈️", 5000, "Large Airplane", "Blue", LocalDate.of(2004, 11, 16));
        Airplane[] airplanes = {airplane1, airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender", "\uD83D\uDE81", 5000, "Fast Helicopter", "Brown", LocalDate.of(2012, 12, 23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache", "\uD83D\uDE81", 5000, "Large Helicopter", "Red", LocalDate.of(1999, 7, 9));
        Helicopter[] helicopters = {helicopter1, helicopter2};

        Announcement[] announcements = {phone1,phone2,laptop1,laptop2,home1,home2,car1,car2,airplane1,airplane2,helicopter1,helicopter2};

            findByPrice(5000,announcements);
        }


    public static void findByPrice(double price, Phone[] phones,
                                   Laptop[] laptops, Home[] homes,
                                   Car[] cars, Helicopter[] helicopters,
                                   Airplane[] airplanes) {
        for (Phone phone : phones) {
            if (phone.getPrice() == price) {
                System.out.println(phone);
            }
        }
        for (Laptop laptop : laptops) {
            if (laptop.getPrice() == price) {
                System.out.println(laptop);
            }
        }
        for (Home home : homes) {
            if (home.getPrice() == price) {
                System.out.println(home);
            }
        }
        for (Car car : cars) {
            if (car.getPrice() == price) {
                System.out.println(car);
            }
        }
        for (Helicopter helicopter : helicopters) {
            if (helicopter.getPrice() == price) {
                System.out.println(helicopter);
            }
        }

        for (Airplane airplane : airplanes) {
            if (airplane.getPrice() == price) {
                System.out.println(airplane);
            }
        }
    }
  public static void findByPrice(double price,Announcement[]announcements){
      for (Announcement announcement : announcements) {
          if (announcement.getPrice()==price){
              System.out.println(announcement);
          }
      }
}


}