package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value="/board")
public class BoardController {
    // form
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form(ModelAndView modelAndView) {
        modelAndView.setViewName("board/form");
        return modelAndView;
    }


    // edit
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView edit(ModelAndView modelAndView) {
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }


    // save
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(ModelAndView modelAndView) {
        modelAndView.setViewName("board/list");
        return modelAndView;
    }
    
    // list
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBeanNewsList();
        
        modelAndView.addObject("boardList", boardList);

        modelAndView.setViewName("board/list");
        
        return modelAndView;
    }
    
    
    // view
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam String title, ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataListWithBoardBeanNewsView(title);
        modelAndView.addObject("boardBean", boardBean);
        
        return modelAndView;
    }

}
