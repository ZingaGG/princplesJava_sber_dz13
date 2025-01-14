package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class DataBase {

    private final List<Order> orders = new ArrayList<>();
}
