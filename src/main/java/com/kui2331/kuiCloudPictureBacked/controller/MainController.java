package com.kui2331.kuiCloudPictureBacked.controller;

import com.kui2331.kuiCloudPictureBacked.common.BaseResponse;
import com.kui2331.kuiCloudPictureBacked.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
