package com.zaroyan;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zaroyan
 */
public class DuplicateFilter implements Filter{
    Set<Object> set = new HashSet<>(); // Хранит уже встреченные элементы

    @Override
    public Object apply(Object o) {
        // Если элемент уже встречался, возвращаем null
        if (!set.add(o)) {
            return null;
        } else {
            return o;
        }
    }
}
