package com.mengyuan.booksystem.bo.vo.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shanmengyuan
 * @date 2025/1/9 9:28
 */
@Data
public class LoginRequest {

    @ApiModelProperty(value = "用户名", required = true)
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    private String password;

}
