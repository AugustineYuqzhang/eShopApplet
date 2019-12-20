package com.hypertech.applet.eshop.dao;

import com.hypertech.applet.eshop.entity.UserInformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserInformationDAO {

    List<UserInformation> selectAll();
}
