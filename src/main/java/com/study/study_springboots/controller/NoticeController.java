package com.study.study_springboots.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/notice")
public class NoticeController {
    // edit
    @RequestMapping(value = "/edit/{title}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable String title, ModelAndView modelAndView){
        DataInfors dataInfors = new DataInfors();
        HashMap<String, Object> hashMap = dataInfors.getDataByUid(title);
        modelAndView.addObject("hashMap", hashMap);

        modelAndView.setViewName("notice/edit");
        
        return modelAndView;
    }

    // save
    @RequestMapping(value = "/save", method = RequestMethod.POST)    
    public ModelAndView save(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        modelAndView.addObject("noticeParams", params);
        
        modelAndView.setViewName("notice/view");
        
        return modelAndView;
    }
    
    // list
    @RequestMapping( value = {"/", "/list"}, method = RequestMethod.GET)
    public ModelAndView list(ModelAndView modelAndView) {
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();

        modelAndView.addObject("boardList", boardList);
        modelAndView.setViewName("notice/list");
        
        return modelAndView;
    }

    // view
    @RequestMapping( value = "/view", method = RequestMethod.POST)  // /board_our
    public ModelAndView view(@RequestParam HashMap<String, String> params, ModelAndView modelAndView) {
        modelAndView.addObject("noticeParams", params);

        modelAndView.setViewName("notice/view");
        
        return modelAndView;
    }




}
