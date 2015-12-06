package com.mxsm.easyui.datamodel;

import java.io.Serializable;

/**
 * DataList
 * @author mxsm
 *
 */

public class DataList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3846926834509719691L;

	private String value;
	
	private String text;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "DataList [value=" + value + ", text=" + text + "]";
	}
	
}
