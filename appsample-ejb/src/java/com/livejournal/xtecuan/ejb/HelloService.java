/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livejournal.xtecuan.ejb;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author xtecuan
 */
@Stateless
@WebService(serviceName = "HelloService")
public class HelloService {

    @EJB
    private HelloWorld ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getUrl")
    public String getUrl() {
        return ejbRef.getUrl();
    }
    
}
