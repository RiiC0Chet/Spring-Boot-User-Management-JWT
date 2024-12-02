package com.hospicare.erp_management.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.hospicare.erp_management.entity.OurUser;
import com.hospicare.erp_management.entity.Role;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReqRes {

    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;

    private String username;
    private String email;
    private String password;
    private String city;
    private boolean enabled;

    private OurUser ourUser;
    private List<OurUser> ourUserList;
    private Set<Role> roles;
}
