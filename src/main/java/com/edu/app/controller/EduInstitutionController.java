package com.edu.app.controller;

import com.edu.app.controller.common.AbstractController;
import com.edu.app.repositories.EduInstitutionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private EduInstitutionRepository institutionRepository;


    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        log.info("Entering index {}", institutionRepository.findAll());
        log.info("Username :{} ",userContext.getUsername());
       return  "admin/institute";
    }


}
