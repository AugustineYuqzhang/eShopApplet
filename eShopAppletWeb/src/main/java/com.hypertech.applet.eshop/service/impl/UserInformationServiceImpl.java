package com.hypertech.applet.eshop.service.impl;

import com.hypertech.applet.eshop.dao.UserInformationDAO;
import com.hypertech.applet.eshop.service.IUserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInformationServiceImpl implements IUserInformationService {

    @Autowired
    UserInformationDAO userInformationDao;

    @Override
    public Object selectAll() {
        return userInformationDao.selectAll();
    }

}
