/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livejournal.xtecuan.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author xtecuan
 */
@Stateless
@LocalBean
public class HelloWorld {

    @Resource(mappedName = "java:app/env/mainInterfaceweb")
    private String mainInterfaceweb;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public String getUrl() {
        System.out.println(mainInterfaceweb);
        return mainInterfaceweb;
    }
}
