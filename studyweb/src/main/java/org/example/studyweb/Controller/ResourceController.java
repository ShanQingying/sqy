package org.example.studyweb.Controller;


import lombok.extern.slf4j.Slf4j;
import org.example.studyweb.pojo.Result;
import org.example.studyweb.pojo.Resource;
import org.example.studyweb.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/resource")
@RestController
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/show")
    public Result getResource() {
        log.info("查询资源");

        List<Resource> resources = resourceService.getResources();
        return Result.success(resources);
    }

    @PostMapping("/save")
    public Result addResource(@RequestBody Resource resource) {
        log.info("新增资源： {}",resource);

        resourceService.addResource(resource);
        return Result.success();

    }



}
