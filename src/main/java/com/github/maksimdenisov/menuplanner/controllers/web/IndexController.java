package com.github.maksimdenisov.menuplanner.controllers.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;
import java.util.stream.Collectors;

@Controller("/")
public class IndexController {


    @GetMapping("")
    private String index() {
        return "forward:startPage.html";
    }

    @Deprecated
    @GetMapping("choose")
    private String indexChoose() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Set<String> roles = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority).collect(Collectors.toSet());
        if (roles.contains("ROLE_ADMIN")) {
            return "forward:admin/main.html";
        } else {
            return "forward:user/main.html";
        }
    }
}
