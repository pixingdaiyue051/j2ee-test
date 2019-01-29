package com.teuqueno.mapper.dao.sys;

import org.apache.ibatis.annotations.Param;

import com.teuqueno.entity.sys.UmUserInfo;

import tk.mybatis.mapper.common.Mapper;

public interface UmUserInfoMapper extends Mapper<UmUserInfo> {

	UmUserInfo selectByNamePwd(@Param("userName") String userName, @Param("pwd") String pwd);
}