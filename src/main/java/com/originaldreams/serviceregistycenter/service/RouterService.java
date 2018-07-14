package com.originaldreams.serviceregistycenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.originaldreams.serviceregistycenter.entity.Router;
import com.originaldreams.serviceregistycenter.mapper.RouterMapper;
import java.util.List;

@Service
public class RouterService {
    @Autowired
    private RouterMapper routerMapper;


    public Router getById(Integer id){

        return routerMapper.getById(id);
    }

    public List<Router> getAll(){
        return routerMapper.getAll();
    }

    public Integer insert(Router router){
        return routerMapper.insert(router);
    }

    public Integer deleteById(Integer id){
        return routerMapper.deleteById(id);
    }

    public Integer update(Router router){
        return routerMapper.update(router);
    }


}
