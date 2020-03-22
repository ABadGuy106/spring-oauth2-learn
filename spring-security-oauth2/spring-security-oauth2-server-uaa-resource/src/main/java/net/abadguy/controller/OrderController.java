package net.abadguy.controller;

import lombok.extern.slf4j.Slf4j;
import net.abadguy.model.UserDTO;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderController {

    @GetMapping("/r1")
    @PreAuthorize("hasAnyAuthority('System')")//拥有System权限可访问此url
    public String r1(){
//        UserDTO userDTO= (UserDTO) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        log.info("用户信息：{}",userDTO);
        return "访问资源1";
    }
}
