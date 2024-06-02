package com.zaroyan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zaroyan
 */
public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 2, 3, 4, 4, 4, 4, 5, 6, 6};
        Filter filter = new DuplicateFilter(); // Фильтр обрабатывающий дубликаты
        Object[] filteredNumbers = filter(numbers, filter);

        // Вывод отфильтрованного массива
        for (Object num : filteredNumbers) {
            System.out.println(num);
        }
    }
    public static Object[] filter(Object[] array, Filter filter) {
        List<Object> filteredList = new ArrayList<>();
        for (Object o : array) {
            Object result = filter.apply(o);
            if (result != null) {
                filteredList.add(result);
            }
        }
        return filteredList.toArray();
    }

}