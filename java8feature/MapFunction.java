package java8feature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFunction {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("audy", "yellow", 10, 50000000));
        carList.add(new Car("Baleno", "red", 19, 600000));
        carList.add(new Car("Swift Dezire", "black", 12, 900000));
        carList.add(new Car("Enova", "White", 35, 1500000));
        carList.add(new Car("Alto800", "Gray", 100, 490000));
        carList.stream().filter(car -> car.qty>12).map(car -> car.model).forEach(System.out::println);
        System.out.println("printing car qty as well car model in map");
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap = carList.stream().collect(Collectors.toMap(car -> car.model,car -> car.qty));
        System.out.println(hashMap);
    }
}
