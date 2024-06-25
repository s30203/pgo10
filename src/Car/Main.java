package Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("1", 2020));
        cars.add(new Car("2", 2010));
        cars.add(new Car("3", 2012));
        cars.add(new Car("4", 2024));
        cars.add(new Car("5", 2000));
        cars.add(new Car("6", 2010));
        cars.add(new Car("7", 2013));
        cars.add(new Car("8", 2015));
        cars.add(new Car("9", 2016));
        cars.add(new Car("10", 2020));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}