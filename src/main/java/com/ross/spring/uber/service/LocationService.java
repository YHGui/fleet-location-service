package com.ross.spring.uber.service;

//domain layer model
//repository 无脑 和具体逻辑无关系
//service需要有逻辑
//解耦，先写interface再写implements
import com.ross.spring.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LocationService {
    //先定义接口，save
    List<Location> saveCarLocations(List<Location> carLocations);

    //deleteAll
    void deleteAll();

    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);

    Page<Location> findByVin(String vin, Pageable pageable);
}
