package cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> cars = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCars() {
        return cars;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            cars.add(car);
            return true;
        }
        return false;
    }

    public List<Car> getCarsForSell() {
        return cars;
    }

    public double sumCarPrice() {
        double sumPrice = 0;
        for (Car car : cars) {
            sumPrice += car.getPrice();
        }
        return sumPrice;
    }

    public int numberOfCarsCheaperThan(int price) {
        int sumCheaper = 0;
        for (Car car : cars) {
            if (car.getPrice() <= price) {
                sumCheaper++;
            }
        }
        return sumCheaper;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> brandList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals(brand)) {
                brandList.add(car);
            }
        }
        return brandList;
    }
}
