package com.alia.projectmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@ApiModel(value = "User Data Transfer Object")
public class UserDto {
//    @ApiModelProperty(required = true,value = "ID")
    private Long id;
//    @ApiModelProperty(required = true,value = "Name Surname")
    private String nameSurname;
//    @ApiModelProperty(required = true,value = "E-Mail")
    private String email;
}