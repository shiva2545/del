/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.del;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import ru.sendto.dto.DtoExample;
import ru.sendto.ejb.interceptor.BundleResult;

import javax.ejb.LocalBean;

/**
 * 
 * @author Lev Nadeinsky
 * @date	2017-06-05
 */
@Stateless
@LocalBean
public class ExampleBean {
	
	@BundleResult
	public DtoExample test(@Observes DtoExample dto){
		return new DtoExample().setTest("response");
	}
}
