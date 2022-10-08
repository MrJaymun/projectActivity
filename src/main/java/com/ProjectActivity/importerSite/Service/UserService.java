package com.ProjectActivity.importerSite.Service;

import com.ProjectActivity.importerSite.Dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserDto getUser(String login, String password);

    UserDto getUser(String login);
}
