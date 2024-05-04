package com.myt.demoems01.service.impl;

import com.myt.demoems01.entity.Emp;
import com.myt.demoems01.mapper.EmpDAO;
import com.myt.demoems01.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpDAO empDAO;

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }

    @Override
    public Emp findById(String id) {
        return empDAO.findById(id);
    }

    @Override
    public void delete(String id) {
        empDAO.delete(id);
    }

    @Override
    public void save(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDAO.save(emp);
    }

    @Override
    public List<Emp> findAll() {
        return empDAO.findAll();
    }
}