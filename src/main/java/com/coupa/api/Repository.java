package com.coupa.api;

import java.util.List;
import java.util.Map;

public interface Repository<T> {

    T findById(long id);

    List<T> findAll(T prototype);

    List<T> findAll(T prototype, boolean exactMatch);

    List<T> findAll();

    List<T> findAll(int offset);

    List<T> findAll(int offset, int limit);

    List<T> findAll(Map<String, String> conditions, boolean exactMatch, int offset, Integer limit);

    T save(T resource);

}