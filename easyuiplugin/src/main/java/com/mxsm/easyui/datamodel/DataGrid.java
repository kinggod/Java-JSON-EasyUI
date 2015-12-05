package com.mxsm.easyui.datamodel;

import java.io.Serializable;
import java.util.List;

/**
 * 表格数据
 * @author mxsm
 * @version 1.0
 * 
 */

public class DataGrid<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -265478630292846598L;

	private List<T> rows; // 数据
	
	private String total; //总条数

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public DataGrid(List<T> rows, String total) {
		super();
		this.rows = rows;
		this.total = total;
	}

	public DataGrid() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
