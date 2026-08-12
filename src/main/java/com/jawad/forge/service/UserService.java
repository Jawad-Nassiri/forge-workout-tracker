package com.jawad.forge.service;

import com.jawad.forge.dto.UserRequestDTO;
import com.jawad.forge.dto.UserResponseDTO;
import com.jawad.forge.entity.User;
import com.jawad.forge.mapper.UserMapper;
import com.jawad.forge.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponseDTO createUser(UserRequestDTO dto) {
        User user = userMapper.toEntity(dto);
        User savedUser = userRepository.save(user);
        return userMapper.toResponse(savedUser);
    }

    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream().map(userMapper::toResponse).toList();
    }

    public UserResponseDTO getUserById(Integer id) {
        User user = userRepository.findById(id)
                .orElseThrow();
        return userMapper.toResponse(user);
    }

    public UserResponseDTO updateUser(Integer id, UserRequestDTO dto) {
        User user = userRepository.findById(id).orElseThrow();
        userMapper.updateEntity(user, dto);
        return userMapper.toResponse(userRepository.save(user));
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

}
