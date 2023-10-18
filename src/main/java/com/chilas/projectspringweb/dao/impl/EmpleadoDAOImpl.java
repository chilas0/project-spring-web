/**
 * 
 */
package com.chilas.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.chilas.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Anthony
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		return "Antony Abarca";
	}

}
