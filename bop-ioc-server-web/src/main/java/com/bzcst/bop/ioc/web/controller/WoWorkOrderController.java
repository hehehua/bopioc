package com.bzcst.bop.ioc.web.controller;


import com.bzcst.bop.ioc.service.wo.entity.po.WoWorkOrder;
import com.bzcst.bop.ioc.service.wo.service.WoWorkOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务工单-工单表 前端控制器
 * </p>
 *
 * @author hechangwen
 * @since 2021-08-18
 */
@RestController
@RequestMapping("/bop-ioc/bop-ioc-server-web")
@Api(tags = "测试")
public class WoWorkOrderController {
    @Resource
    WoWorkOrderService woWorkOrderService;

    @GetMapping(value = "select/{id}")
    @ApiOperation(value = "删除设备档案")
    public String delete(@ApiParam(value = "id",example = "1", required = true) @PathVariable Long id){
        List<WoWorkOrder> list = woWorkOrderService.list();
        return "sucessor";
    }
}
