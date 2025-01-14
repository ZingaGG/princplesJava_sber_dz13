package org.example.Repository;

import org.example.Model.Order;

public interface iOrderRepository {
    void saveToDatabase(Order order);
    void deleteFromDatabase(Order order);

}
