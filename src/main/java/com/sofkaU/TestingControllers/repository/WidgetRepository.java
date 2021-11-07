package com.sofkaU.TestingControllers.repository;

import com.sofkaU.TestingControllers.model.Widget;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WidgetRepository extends MongoRepository<Widget, Long> {
}
