package com.koshish.managementconstruction.service.IService;

import java.util.List;

public interface IGenericService<T> {
    public List<T> getAll();
    public T insert(T t);
    public T getById(int id);
    public int delete(int id);
}
