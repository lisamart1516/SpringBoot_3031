package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long>{
    Object findOne(long id);
}
