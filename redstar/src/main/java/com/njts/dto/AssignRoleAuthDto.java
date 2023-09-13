package com.njts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AssignRoleAuthDto {

    //接收请求参数roleId -- 角色id
    private Integer userId;

    //接收请求参数authIds -- 给角色分配的所有权限(菜单)的id
    private List<Integer> authIds;
}
