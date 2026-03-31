package jour02.job04;

import java.time.LocalDate;

public class VehicleHandler {

    public static class Vehicle { 

        String brand; 
        LocalDate buyDate; 
        float buyPrice;
        float currentPrice; 

        Vehicle(String brand, LocalDate buyDate, float buyPrice) {
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
        public float getBuyPrice() {
            return this.buyPrice;
        }

        public void show() { 
            System.out.println(String.format("Un véhicule de marque %s, acheté le %s pour %s euros", 
                               this.getBrand(), this.getBuyDate(), this.getBuyPrice()));
        }
   
    }
    
    public static void debugVehicle() { 

        Vehicle myVehicle = new Vehicle("TMAX", LocalDate.of(1996, 1, 16), 14000);
        myVehicle.show();

    }

    public static void main(String[] args) { 

        debugVehicle();

    }
}
