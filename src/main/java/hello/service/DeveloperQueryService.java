package hello.service;

import hello.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperQueryService {

    @Autowired
    DeveloperRepository developerRepository;



}
