package com.dmdev.spring.database.repository;

import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.dmdev.spring.bpp.Auditing;
import com.dmdev.spring.bpp.InjectBean;
import com.dmdev.spring.bpp.Transaction;
import com.dmdev.spring.database.entity.Company;
import com.dmdev.spring.database.pool.ConnectionPool;

@Transaction
@Auditing
public class CompanyRepository implements CrudRepository<Integer, Company> {

    @Autowired
    private ConnectionPool connectionPool;

    @PostConstruct
    private void init() {
        System.out.println("init company repository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("find by id method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {

    }
}
