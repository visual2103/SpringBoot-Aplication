package com.example.demo.mapper;

import com.example.demo.DTO.UserDTO;
import com.example.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@RequiredArgsConstructor
@Component
public class UserMapper {

    private final RoleMapper roleMapper;

    public UserDTO userEntityToDto(User user){
        return UserDTO.builder()
                .username(user.getUsername())
                .roles(roleMapper.roleListEntityToDto(user.getRoles()))
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .emailAddress(user.getEmailAddress())
                .build();
    }

    public List<UserDTO> userListEntityToDto(List<User> users){
        return users.stream()
                .map(user -> userEntityToDto(user))
                .toList();
    }

    public User userDtoToEntity(UserDTO userDto, String password){
        return User.builder()
                .username(userDto.username())
                .password(password)
                .roles(roleMapper.roleListDtoToEntity(userDto.roles()))
                .firstName(userDto.firstName())
                .lastName(userDto.lastName())
                .emailAddress(userDto.emailAddress())
                .build();
    }

    public List<User> userListDtoToEntity(List<UserDTO> userDtos, String password){
        return userDtos.stream()
                .map(userDto -> userDtoToEntity(userDto, password))
                .toList();
    }
}
