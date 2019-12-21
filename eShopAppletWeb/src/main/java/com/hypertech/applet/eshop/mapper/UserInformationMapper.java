package com.hypertech.applet.eshop.mapper;

import com.hypertech.applet.eshop.entity.UserInformation;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserInformationMapper {
    int deleteByPrimaryKey(String userId);

    int insert(UserInformation record);

    UserInformation selectByPrimaryKey(String userId);

    List<UserInformation> selectAll();

    int updateByPrimaryKey(UserInformation record);
}