package com.wangzc.springboottemplate.model.po;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author wang_zc
 * @date 2018/7/10
 */
@NoArgsConstructor
@Getter
@Setter
public class User implements IPO {

    private Long id;

    private String username;

    private String password;
}
