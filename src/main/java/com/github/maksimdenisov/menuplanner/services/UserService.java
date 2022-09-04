package com.github.maksimdenisov.menuplanner.services;

import com.github.maksimdenisov.menuplanner.dao.UserRepository;
import com.github.maksimdenisov.menuplanner.dto.admin.UserDTO;
import com.github.maksimdenisov.menuplanner.model.security.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    UserRepository repository;
    ModelMapper mapper;

    public UserService(UserRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<UserDTO> getUsers() {
        return repository.getUsers().stream()
                .sorted(Comparator.comparing(User::getName))
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserDTO convertEntityToDto(User user){
        return mapper.map(user,UserDTO.class);
    }
}
