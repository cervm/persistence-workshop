package model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rajmu on 17.03.28.
 */
public interface IDataAccessObject<T, U extends Serializable> {
    public List<T> getAll();

    public T getById(U id);

    public void create(T object);

    public void update(T object);

    public void delete(T object);
}
