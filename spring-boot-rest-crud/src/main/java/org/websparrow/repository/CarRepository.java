package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;
import org.websparrow.entity.AddCar;

public interface CarRepository extends CrudRepository<AddCar, Integer> {

}
