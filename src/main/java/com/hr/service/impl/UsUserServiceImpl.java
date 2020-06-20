package com.hr.service.impl;

import com.hr.dao.UsUserMapper;
import com.hr.entity.UsUser;
import com.hr.service.UsUserService;
import org.springframework.stereotype.Service;

@Service
public class UsUserServiceImpl extends BaseServiceImpl<UsUserMapper,UsUser> implements UsUserService {
}
