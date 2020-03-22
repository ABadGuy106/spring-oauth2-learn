package net.abadguy.model;

import lombok.Data;
import lombok.ToString;

/**
 * 用户信息
 */
@Data
@ToString
public class UserDTO {

    /**
     * 用户id
     */
    private String id;
    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String fullname;




}
