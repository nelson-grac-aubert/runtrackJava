package jour02.job04;

import java.time.LocalDate;

public class VehicleHandler {

    public static class Vehicle { 

        String brand; 
        LocalDate buyDate; 
        float buyPrice;
        double currentPrice; 

        Vehicle(String brand, LocalDate buyDate, long buyPrice) {

            this.brand = brand;
            this.buyDate = buyDate; 
            this.buyPrice = buyPrice; 

            determineCurrentPrice(2026);

        }

        public String getBrand() {
            return this.brand;
        }
        public LocalDate getBuyDate() {
            return this.buyDate;
        }
        public float getBuyPrice() {
            return this.buyPrice;
        }

    public void show() { 
            System.out.println(String.format("Un véhicule de marque %s, acheté le %s pour %s euros", 
                               this.getBrand(), this.getBuyDate(), this.getBuyPrice()));
        }

    public double determineCurrentPrice(int currentYear) { 

        long ageOfTheVehicle = currentYear - this.getBuyDate().getYear();

        double newPrice = this.buyPrice * Math.pow(0.99, ageOfTheVehicle);
        if (newPrice < 0) {
            newPrice = 0;
        }

        this.currentPrice = newPrice;

        return this.currentPrice;

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

        public double determineCurrentPrice(int currentYear) { 
            
            // - 2% every year
            long ageOfTheVehicle = currentYear - this.getBuyDate().getYear();

            double newPrice = this.buyPrice * Math.pow(0.98, ageOfTheVehicle);

            // -5% every 10 000km 

            int amountOf10K = Math.round(this.distance / 10000); 

            newPrice = newPrice * Math.pow(0.95, amountOf10K);

            // -10% if Fiat or Peugeot

            if(this.getBrand() == "Peugeot" || this.getBrand() == "Fiat") {
                newPrice *= 0.9;
            }

            // +20% if Porsche or Ferrarri 

            if(this.getBrand() == "Porsche" || this.getBrand() == "Ferrari") {
                newPrice *= 1.2;
            }

            // If negative => 0 

            if (newPrice < 0) {
                newPrice = 0;
            }

            this.currentPrice = newPrice; 
            return newPrice;
        }

    }

    public static class Plane extends Vehicle { 

        String motorType; 
        int flightHours;

        Plane(String brand, LocalDate buyDate, long buyPrice, String motorType, int flightHours) { 
            super(brand, buyDate, buyPrice); 
            this.motorType = motorType; 
            this.flightHours = flightHours;
        }

        public void show() { 
            
            super.show(); 
            System.out.println(String.format("Plus précisément, un avion a moteur de type %s", this.motorType));

        }

        public double determineCurrentPrice(int currentYear) { 

            int amountOfSlices;

            if (this.motorType == "hélice") { 
                amountOfSlices = Math.round(this.flightHours / 100);
            }
            else { 
                amountOfSlices = Math.round(this.flightHours / 1000);
            }

            double newPrice = this.buyPrice * Math.pow(0.9, amountOfSlices);

            this.currentPrice = newPrice;
            return newPrice;
        }
    }
    
    public static void debugVehicle() { 

        Vehicle myVehicle = new Vehicle("TMAX", LocalDate.of(2024, 1, 16), 14000);
        myVehicle.show();
        System.out.println(myVehicle.currentPrice);

        Car myCar = new Car("Fiat", LocalDate.of(2000, 1,1), 25000, 500, (byte) 5, 500, 127000);
        myCar.show();
        System.out.println(myCar.currentPrice);

        Plane myPlane = new Plane("Airbus", LocalDate.of(1995, 2, 2), 2000000, "Reaction thermonucléaire sa mère", 260);
        myPlane.show();
        System.out.println(myPlane.currentPrice);

    }

    public static void main(String[] args) { 

        debugVehicle();

    }
}
