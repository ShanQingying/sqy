package org.example.studyweb.service.impl;


import org.example.studyweb.mapper.ResourceMapper;
import org.example.studyweb.pojo.Resource;
import org.example.studyweb.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    public List<Resource> getResources(){return resourceMapper.getAllResource();}

    @Override
    public void addResource(Resource resource) {
        resource.setTime(LocalDateTime.now());
        resourceMapper.insertResource(resource);
    }
}
