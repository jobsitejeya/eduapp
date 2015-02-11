package com.edu.app.controller.menu;

import com.edu.app.controller.common.AbstractController;
import com.edu.app.form.EduMenu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kumar Jeyaprakasam on 11-01-2015.
 */

@Controller
@RequestMapping(value = "/menu")
public class EduMenuController extends AbstractController {


    @RequestMapping(method = RequestMethod.GET)
    public
    @ResponseBody
    List<EduMenu> listMenus() {
        // get menu for role and render it
        List<EduMenu> eduMenuList = new ArrayList<EduMenu>();
        EduMenu eduMenu = new EduMenu("/test", "Test Menu1", "testMenu");

        eduMenuList.add(eduMenu);

        return eduMenuList;
    }
}
