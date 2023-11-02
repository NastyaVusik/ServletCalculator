package SOLID_5;

import SOLID_3.Order;

public interface Storage<T> {
    public boolean save(T t);
}
