package Fabric_method;

import java.util.HashMap;
import java.util.Map;

public class Car {
private final String title;

private final static Map<String, Car> cache = new HashMap<>();

public Car(String title){
    this.title = title;
}

public static Car getInstance(String title){
    if(cache.containsKey(title)){
        return cache.get(title);
    }
    return  new Car(title);
}

}
