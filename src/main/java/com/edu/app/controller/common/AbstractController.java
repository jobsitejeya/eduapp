package com.edu.app.controller.common;

import com.edu.app.util.IUserContext;
import com.edu.app.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Kumar Jeyaprakasam on 11-01-2015.
 */
public class AbstractController {

    @Autowired
    protected IUserContext userContext;
    public String getUsername(){
        return userContext.getUsername();
    }

    

}
