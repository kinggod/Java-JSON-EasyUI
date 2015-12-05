package com.mxsm.easyui.datavo;

import java.util.List;

import com.mxsm.easyui.datamodel.Combobox;

/**
 * 返回前台的数据对象
 * @author mxsm
 *
 */

public class ComboboxData<T extends Combobox> {

	List<T> data; // 数据集

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public ComboboxData(List<T> data) {
		super();
		this.data = data;
	}

	public ComboboxData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * data is null or size is 0 return true else false
	 * @return
	 */
	public boolean dataListIsEmpty(){
		
		if(this.data == null || this.data.size() <= 0){
			return true;
		}
		
		return false;
	}
	
	public boolean dataListIsNull(){
		
		if(this.data == null){
			return true;
		}
		
		return false;
	}
	
}
