package com.ramki.sampleapph2inmemorydb.repo;

import com.ramki.sampleapph2inmemorydb.entity.UserActionEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserActionRepo extends CrudRepository<UserActionEntity, Long> {
}
