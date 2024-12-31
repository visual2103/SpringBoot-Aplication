package com.example.demo.mapper;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.model.Role;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class RoleMapper {

    public RoleDTO roleEntityToDto(Role role){
        return RoleDTO.builder()
                .role(role.getRole())
                .build();
    }

    public List<RoleDTO> roleListEntityToDto(List<Role> roles){
        return roles.stream()
                .map(role -> roleEntityToDto(role))
                .toList();
    }

    public Role roleDtoToEntity(RoleDTO roleDto){
        return Role.builder()
                .role(roleDto.role())
                .build();
    }

    public List<Role> roleListDtoToEntity(List<RoleDTO> roleDtos){
        return roleDtos.stream()
                .map(roleDto -> roleDtoToEntity(roleDto))
                .toList();
    }
}
