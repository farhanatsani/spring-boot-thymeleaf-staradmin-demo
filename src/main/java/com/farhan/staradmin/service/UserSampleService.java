package com.farhan.staradmin.service;

import com.farhan.staradmin.mapper.UserSampleMapper;
import com.farhan.staradmin.model.UserSample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserSampleService {

    private UserSampleMapper mapper;

    public ArrayList<UserSample> findUser() {
        return this.mapper.find();

    }

}
