package com.github.maksimdenisov.menuplanner.controllers.api.admin;

import com.github.maksimdenisov.menuplanner.dto.admin.UserDTO;
import com.github.maksimdenisov.menuplanner.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminUserController {

    private final UserService userService;

    public AdminUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }
}
