package com.succhiamileabitudini.succhiamileabitudini.repository;

import com.succhiamileabitudini.succhiamileabitudini.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
