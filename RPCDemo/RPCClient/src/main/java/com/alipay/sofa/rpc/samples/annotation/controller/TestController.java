package com.alipay.sofa.rpc.samples.annotation.controller;

import com.alipay.sofa.rpc.samples.annotation.AnnotationService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaoyuan
 * @date 2024年05月28日 上午12:01
 */
@RestController
public class TestController {

    @SofaReference(interfaceType = AnnotationService.class, jvmFirst = false,uniqueId = "annotationServiceImpl", binding = @SofaReferenceBinding(bindingType = "bolt"))
    private AnnotationService annotationService;

    @GetMapping("/test")
    public String test() {
        return annotationService.sayAnnotation("test");
    }
}
