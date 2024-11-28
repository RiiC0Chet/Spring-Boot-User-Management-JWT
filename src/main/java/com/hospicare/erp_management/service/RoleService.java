package com.hospicare.erp_management.service;

import com.hospicare.erp_management.dto.RoleDTO;
import com.hospicare.erp_management.entity.Role;
import com.hospicare.erp_management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;


    public RoleDTO createRole(RoleDTO roleDTO) {
        Role role = new Role();
        role.setName(roleDTO.getName());
        Role savedRole = roleRepository.save(role);
        return convertToDto(savedRole);
    }


    public RoleDTO updateRole(Long id, RoleDTO roleDTO) {
        Optional<Role> existingRole = roleRepository.findById(id);
        if (existingRole.isPresent()) {
            Role role = existingRole.get();
            role.setName(roleDTO.getName());
            Role updatedRole = roleRepository.save(role);
            return convertToDto(updatedRole);
        }
        return null; // You may want to throw an exception here
    }


    public void deleteRole(Long id) {
        roleRepository.deleteById(id);
    }


    public RoleDTO getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.map(this::convertToDto).orElse(null);
    }


    public List<RoleDTO> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roles.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    private RoleDTO convertToDto(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setName(role.getName());
        return roleDTO;
    }

    private Role convertToEntity(RoleDTO roleDTO) {
        Role role = new Role();
        role.setName(roleDTO.getName());
        return role;
    }
}