package cn.iocoder.mall.managementweb.controller.datadict.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@ApiModel("数据字典更新 DTO")
@Data
public class DataDictUpdateDTO {

    @ApiModelProperty(value = "编号", required = true, example = "1024")
    @NotNull(message = "编号不能为空")
    private Integer id;
    @ApiModelProperty(value = "大类枚举值", required = true, example = "gender")
    @NotEmpty(message = "大类枚举值不能为空")
    private String enumValue;
    @ApiModelProperty(value = "小类数值", required = true, example = "1")
    @NotEmpty(message = "小类数值不能为空")
    private String value;
    @ApiModelProperty(value = "展示名", required = true, example = "男")
    @NotEmpty(message = "展示名不能为空")
    private String displayName;
    @ApiModelProperty(value = "排序值", required = true, example = "1")
    @NotNull(message = "排序值不能为空")
    private Integer sort;
    @ApiModelProperty(value = "备注", example = "性别 - 男（嗨）")
    private String memo;

}
