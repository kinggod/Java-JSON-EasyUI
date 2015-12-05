package com.mxsm.easyui.datamodel;

import java.io.Serializable;

/**
 * 加载最基本的EasyuiCombox数据
 * @author mxsm
 *
 */

public class Combobox implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1362003143514245092L;

	private String value; //easyui combobox getValue 方法获取的值
	
	private String text; //UI界面显示的值

	public Combobox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Combobox(String value, String text) {
		super();
		this.value = value;
		this.text = text;
	}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Combobox other = (Combobox) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
