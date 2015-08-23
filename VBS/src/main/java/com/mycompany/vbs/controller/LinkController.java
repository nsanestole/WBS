/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Stole
 */
@Controller
public class LinkController {
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView index()
    {
        ModelAndView mav = new ModelAndView();
        return mav;
    }
}
