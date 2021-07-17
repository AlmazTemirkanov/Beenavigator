package com.example.controller;

import com.example.beelineDb.domain.MyBeeline;
import com.example.beelineDb.repo.MyBeelineRepo;
import com.example.mainDb.domain.Pull;
import com.example.mainDb.repo.PullRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PullController {

    @Autowired
    private PullRepo pullRepo;
    @Autowired
    private MyBeelineRepo myBeelineRepo;

    @GetMapping("/pull")
    public String filter_pull(@RequestParam (required = false) String filter_pull, Model model){

        Iterable <Pull> pull = pullRepo.findByNumber(filter_pull);
        Iterable <MyBeeline> myBeelines = myBeelineRepo.findByMsisdn(filter_pull);

        model.addAttribute("pull", pull);
        model.addAttribute("filter_pull", filter_pull);

        model.addAttribute("myBeelines", myBeelines);
        model.addAttribute("filter_mb", filter_pull);
        return "pull";
    }


}
