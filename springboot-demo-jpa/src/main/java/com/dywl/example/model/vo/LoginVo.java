package com.dywl.example.model.vo;

import lombok.Data;

/**
 * TODO Add desc
 *
 * @author Harry
 * @email dishpzga@163.com
 * @date 2020/8/13
 */
@Data
public class LoginVo {
    private Long userId;
    private String userName;

    /**
     * 授权令牌
     */
    private String token;
}
