package com.alipay.sofa.rpc.samples.annotation.controller;

import com.alipay.sofa.rpc.samples.annotation.AnnotationService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaoyuan
 * @date 2024年05月27日 下午12:21
 */
@RestController
public class TestContoller {
    @SofaReference(interfaceType = AnnotationService.class, jvmFirst = false)
    AnnotationService service;


    @GetMapping("/test")
    public String test() {
        return service.sayAnnotation("test");
    }


}
