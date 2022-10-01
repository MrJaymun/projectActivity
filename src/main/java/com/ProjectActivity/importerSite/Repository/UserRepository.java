package com.ProjectActivity.importerSite.Repository;

import com.ProjectActivity.importerSite.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLoginAndPassword(String login, String password);

    User findByLogin(String login);

}
