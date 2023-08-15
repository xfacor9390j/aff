package com.example.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Rest {
    private  TrainService trainService;
    public Rest( TrainService trainService) {
        this.trainService=trainService;
    }
    //
    @GetMapping("/trians")
    public List<String> getTrains(){
        return trainService.getTrainData();
    }
}
