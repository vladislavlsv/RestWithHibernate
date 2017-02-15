package HibProj.services;

import HibProj.dao.DataDao;
import HibProj.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Пользователь on 16.11.2016.
 */
public class DataServicesImpl implements DataServices {

    @Autowired
    DataDao dataDao;

    @Override
    public boolean addEntity(Employee employee) throws Exception {
        return dataDao.addEntity(employee);
    }

    @Override
    public Employee getEntityById(long id) throws Exception {
        return dataDao.getEntityById(id);
    }

    @Override
    public List getEntityList() throws Exception {
        return dataDao.getEntityList();
    }

    @Override
    public boolean deleteEntity(long id) throws Exception {
        return dataDao.deleteEntity(id);
    }

}
