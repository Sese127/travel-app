package com.Travall.App.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User,Long> {

    public User findByEmail(String mail);
    public User findByName(String name);

}
