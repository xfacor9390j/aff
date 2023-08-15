package com.example.assignment;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TrainService {

    private final List<String> trainData = new ArrayList<>();

    public void addTrainData(String data) {
        trainData.add(data);
    }

    public List<String> getTrainData() {
        return trainData;
    }
}
