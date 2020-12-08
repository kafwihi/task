
package com.example.task.security.repository;

import  com.example.task.security.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

    Boolean existsByUsername(String username);
    UserInfo findByUsername(String username);


}
