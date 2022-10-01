package com.ProjectActivity.importerSite.Service.Implementation;

import com.ProjectActivity.importerSite.Dto.UserDto;
import com.ProjectActivity.importerSite.Repository.UserRepository;
import com.ProjectActivity.importerSite.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto getUser(String login, String password) {
        return new UserDto(userRepository.findByLoginAndPassword(login, password));
    }

    @Override
    public UserDto getUser(String login) {
        return new UserDto(userRepository.findByLogin(login));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto user = getUser(username);
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), null);
    }
}
