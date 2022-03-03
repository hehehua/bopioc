package com.bzcst.bop.ioc.service.wo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bzcst.bop.ioc.service.wo.entity.po.WoWorkOrder;
import com.bzcst.bop.ioc.service.wo.mapper.WoWorkOrderMapper;
import com.bzcst.bop.ioc.service.wo.service.WoWorkOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务工单-工单表 服务实现类
 * </p>
 *
 * @author hechangwen
 * @since 2021-08-18
 */
@Service
public class WoWorkOrderServiceImpl extends ServiceImpl<WoWorkOrderMapper, WoWorkOrder> implements WoWorkOrderService {

}
