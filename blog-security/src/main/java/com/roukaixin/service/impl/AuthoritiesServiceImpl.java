package com.roukaixin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.roukaixin.mapper.AuthoritiesMapper;
import com.roukaixin.pojo.Authorities;
import com.roukaixin.service.AuthoritiesService;
import org.springframework.stereotype.Service;

/**
* @author pankx
* @description 针对表【sys_authorities(权限信息)】的数据库操作Service实现
* @createDate 2024-04-16 15:17:11
*/
@Service
public class AuthoritiesServiceImpl extends ServiceImpl<AuthoritiesMapper, Authorities>
    implements AuthoritiesService {

}




