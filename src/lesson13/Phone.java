package lesson13;

public class Phone {
    double price;
    String name;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Phone(double price, String name) {
        this.price = price;
        this.name = name;
    }
    public double getDiscount(double discount, SeasonPrice func) {
        return func.calcPrice(discount, price);
    }

    public double calcSeasonPrice(String season) {
        return switch (season) {
            case "winter" -> getDiscount(15.5, (discount, currPrice) -> currPrice - (currPrice * discount / 100));
            case "spring" -> getDiscount(80, (discount, currPrice) -> currPrice - discount);
            case "summer" -> getDiscount(20, (discount, currPrice) -> currPrice - (currPrice * discount / 100));
            case "autumn" -> getDiscount(280, (discount, currPrice) -> currPrice - discount);
            default -> price;
        };
    }
}

interface SeasonPrice {
    double calcPrice(double discount, double price);
}


