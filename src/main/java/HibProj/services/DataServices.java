package HibProj.services;

import HibProj.model.Employee;

import java.util.List;

/**
 * Created by Пользователь on 16.11.2016.
 */
public interface DataServices {
    public boolean addEntity(Employee employee) throws Exception;
    public Employee getEntityById(long id) throws Exception;
    public List getEntityList() throws Exception;
    public boolean deleteEntity(long id) throws Exception;
}