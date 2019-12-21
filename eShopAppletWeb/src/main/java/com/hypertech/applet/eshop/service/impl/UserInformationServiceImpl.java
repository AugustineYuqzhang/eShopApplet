package com.hypertech.applet.eshop.service.impl;

import com.hypertech.applet.eshop.mapper.UserInformationMapper;
import com.hypertech.applet.eshop.service.IUserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInformationServiceImpl implements IUserInformationService {

    @Autowired
    UserInformationMapper userInformationDao;

    @Override
    public Object selectAll() {
        return userInformationDao.selectAll();
    }

}
