package com.g7go.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.g7go.dinterface.RemoteUserService;
import org.springframework.stereotype.Component;

/**
 * 注册dubbo服务
 *
 * @Author: Mr_li
 * @CreateDate: 2018-11-27$ 15:21$
 * @Version: 1.0
 */
@Component
@Service
public class RemoteUserServiceImpl implements RemoteUserService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}