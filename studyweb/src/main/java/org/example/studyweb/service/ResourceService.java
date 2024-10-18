package org.example.studyweb.service;

import org.example.studyweb.pojo.Resource;

import java.util.List;

public interface ResourceService {

    List<Resource> getResources();


    void addResource(Resource resource);
}
