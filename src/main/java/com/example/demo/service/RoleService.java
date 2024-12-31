package com.example.demo.service;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    private final RoleMapper roleMapper;

    public RoleDTO getRoleById(Integer id){
        return roleMapper.roleEntityToDto(roleRepository.findById(id).orElse(null));
    }

    public RoleDTO findByRole(String role){
        return roleMapper.roleEntityToDto(roleRepository.findByRole(role));
    }

    public List<RoleDTO> getAllRoles(){
        return roleMapper.roleListEntityToDto(roleRepository.findAll());
    }

    public RoleDTO createRole(Role role){
        return roleMapper.roleEntityToDto(roleRepository.save(role));
    }

    public RoleDTO updateRole(Role role){
        return roleMapper.roleEntityToDto(roleRepository.save(role));
    }

    public void deleteRole(Role role){
        roleRepository.delete(role);
    }

}
