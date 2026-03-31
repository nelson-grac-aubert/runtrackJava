package jour02.job04;

import java.time.LocalDate;

public class VehicleHandler {

    public static class Vehicle { 

        String brand; 
        LocalDate buyDate; 
        long buyPrice;
        long currentPrice; 

        Vehicle(String brand, LocalDate buyDate, long buyPrice) {
            this.brand = brand;
            this.buyDate = buyDate; 
            this.buyPrice = buyPrice; 

        }

        public String getBrand() {
            return this.brand;
        }
        public LocalDate getBuyDate() {
            return this.buyDate;
        }
        public long getBuyPrice() {
            return this.buyPrice;
        }

    public void show() { 
            System.out.println(String.format("Un véhicule de marque %s, acheté le %s pour %s euros", 
                               this.getBrand(), this.getBuyDate(), this.getBuyPrice()));
        }
   
    }

    public static class Car extends Vehicle {

        long cc;
        byte doorCount;
        long horsePower; 
        long distance;

        Car(String brand, LocalDate buyDate, long buyPrice, long cc, byte doorCount, long horsePower, long distance) { 
            super(brand, buyDate, buyPrice);
            this.cc = cc;
            this.doorCount = doorCount;
            this.horsePower = horsePower; 
            this.distance = distance; 
        }
        
        public void show() { 
            
            super.show(); 
            System.out.println(String.format("Plus précisément, une voiture %s cylindrée, avec %s portes, de %s chevaux, avec %s kilomètres au compteur", 
            this.cc, this.doorCount, this.horsePower, this.distance));

        }

    }

    public static class Plane extends Vehicle { 

        String motorType; 

        Plane(String brand, LocalDate buyDate, long buyPrice, String motorType) { 
            super(brand, buyDate, buyPrice); 
            this.motorType = motorType; 
        }

        public void show() { 
            
            super.show(); 
            System.out.println(String.format("Plus précisément, un avion a moteur de type %s", this.motorType));

        }
    }
    
    public static void debugVehicle() { 

        Vehicle myVehicle = new Vehicle("TMAX", LocalDate.of(1996, 1, 16), 14000);
        myVehicle.show();

        Car myCar = new Car("Toyota", LocalDate.of(2000, 1,1), 25000, 500, (byte) 5, 500, 127000);
        myCar.show();

        Plane myPlane = new Plane("Airbus", LocalDate.of(1995, 2, 2), 2000000, "Reaction thermonucléaire sa mère");
        myPlane.show();

    }

    public static void main(String[] args) { 

        debugVehicle();

    }
}
