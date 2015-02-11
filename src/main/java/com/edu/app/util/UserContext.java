package com.edu.app.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kumar Jeyaprakasam on 11-01-2015.
 * This method is to get user level details
 */

public class UserContext implements IUserContext {


    private static final Logger log = LoggerFactory.getLogger(UserContext.class);

    @Override
    public String getUsername() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return username;
    }

    @Override
    public String[] getRoles() {

        log.info("Getting Roles");
        List authorities = (List) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        String[] roles  = new String[authorities.size()];
        log.info("Roles size : {}", authorities.size());
        int count=0;
        for (Object authority :  authorities) {
            log.info("Role : {}", ((GrantedAuthority) authority).getAuthority());
            roles[count] = ((GrantedAuthority) authority).getAuthority().toString();
            count++;
        }

        for(String role :roles){
            log.info("Role obtained : {}", role);
        }

        log.info("Roles : {}", roles.length);
        return roles;
    }
}
