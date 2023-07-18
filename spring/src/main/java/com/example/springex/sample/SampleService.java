package com.example.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
public class SampleService {

    @Autowired
    private SampleDAO sampleDAO;

}
