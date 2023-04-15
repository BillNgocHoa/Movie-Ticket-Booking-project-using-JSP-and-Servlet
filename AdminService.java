/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cn.techtutorial.ctb.admin.services;

import cn.techtutorial.ctb.admin.model.Admin;

/**
 *
 * @author nnbil
 */
public interface AdminService {
    public Admin logAdmin(String email, String password);
}
