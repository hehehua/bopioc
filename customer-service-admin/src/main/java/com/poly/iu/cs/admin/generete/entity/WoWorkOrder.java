package com.poly.iu.cs.admin.generete.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 服务工单-工单表
 * </p>
 *
 * @author hechangwen
 * @since 2021-08-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("wo_work_order")
@ApiModel(value="WoWorkOrder对象", description="服务工单-工单表")
public class WoWorkOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "租户ID")
    private Long tenantId;

    @ApiModelProperty(value = "物业项目ID")
    private Long projectId;

    @ApiModelProperty(value = "流程实例ID")
    private Long wfInstId;

    @ApiModelProperty(value = "工单配置ID")
    private Long configId;

    @ApiModelProperty(value = "经营房屋表ID")
    private Long spaceManageHouseId;

    @ApiModelProperty(value = "工单号")
    private String no;

    @ApiModelProperty(value = "联系人手机号")
    private String mobile;

    @ApiModelProperty(value = "数据来源")
    private String source;

    @ApiModelProperty(value = "当前候选人")
    private String candidate;

    @ApiModelProperty(value = "状态: ...")
    private Integer state;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "数据版本号")
    private Integer version;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "修改人")
    private String updateBy;

    @ApiModelProperty(value = "是否已经逻辑删除: 0-未删除, 非0-已删除")
    private Long deleteFlag;


}
