package com.edu.app.controller;

import com.edu.app.controller.common.AbstractController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Kumar Jeyaprakasam on 09-02-2015.
 */

@Controller
@RequestMapping(value = "/institute")
public class EduInstitutionController extends AbstractController {

    public final static Logger log = LoggerFactory.getLogger(EduInstitutionController.class);


    @RequestMapping(method = RequestMethod.GET)
    public String index() {
       return  "admin/institute";
    }
}
