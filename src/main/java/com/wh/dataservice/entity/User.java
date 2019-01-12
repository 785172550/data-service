package com.wh.dataservice.entity;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {

    private long uid;
    private String userName;
    private String passWord;
    private String role;
}
