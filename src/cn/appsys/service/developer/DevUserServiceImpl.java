package cn.appsys.service.developer;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
class DevUserServiceImpl implements  DevUserService {
    @Resource
    private DevUserMapper mapper;

    @Override
    public DevUser login(String devCode, String passWord) {
        DevUser user=null;
        user=mapper.getLoginUser(devCode);
        if (user!=null){
            if (!user.getDevPassword().equals(passWord)){
                user=null;
            }
        }
        return user;
    }
}
