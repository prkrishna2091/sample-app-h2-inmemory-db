package com.ramki.sampleapph2inmemorydb.repo;

import com.ramki.sampleapph2inmemorydb.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity,Long> {
}
