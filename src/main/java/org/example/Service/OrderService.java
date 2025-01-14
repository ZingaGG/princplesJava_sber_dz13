package org.example.Service;

import org.example.Model.Order;
import org.example.Repository.iOrderRepository;

public class OrderService {
    private final iOrderRepository orderRepository;

    public OrderService(iOrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void saveOrder(Order order) {
        orderRepository.saveToDatabase(order);
    }

    public void deleteOrder(Order order) {
        orderRepository.deleteFromDatabase(order);
    }
}
