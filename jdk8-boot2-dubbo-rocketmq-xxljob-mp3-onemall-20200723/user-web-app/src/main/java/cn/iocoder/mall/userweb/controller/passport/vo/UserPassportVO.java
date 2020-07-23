package cn.iocoder.mall.userweb.controller.passport.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@ApiModel("用户通信证信息 VO")
@Data
@Accessors(chain = true)
public class UserPassportVO {

    @ApiModel("认证信息")
    @Data
    @Accessors(chain = true)
    public static class Authentication {

        @ApiModelProperty(value = "访问令牌", required = true, example = "001e8f49b20e47f7b3a2de774497cd50")
        private String accessToken;
        @ApiModelProperty(value = "刷新令牌", required = true, example = "001e8f49b20e47f7b3a2de774497cd50")
        private String refreshToken;
        @ApiModelProperty(value = "过期时间", required = true)
        private Date expiresTime;

    }

    @ApiModel("用户信息")
    @Data
    @Accessors(chain = true)
    public static class User {

        @ApiModelProperty(value = "用户编号", required = true, example = "1")
        private Integer id;
        @ApiModelProperty(value = "用户昵称", required = true, example = "小王")
        private String nickname;
        @ApiModelProperty(value = "用户头像", required = true, example = "http://www.iocoder.cn/image")
        private String avatar;

    }

    /**
     * 用户信息
     */
    private User user;
    /**
     * 认证信息
     */
    private Authentication authorization;

}
