package com.example.demo.DTO;

import lombok.Builder;
import java.util.List;

@Builder
public record UserDTO(
        String username,
        List<RoleDTO> roles,
        String firstName,
        String lastName,
        String emailAddress) {}
