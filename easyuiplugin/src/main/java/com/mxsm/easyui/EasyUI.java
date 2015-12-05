package com.mxsm.easyui;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.mxsm.easyui.datamodel.Combobox;
import com.mxsm.easyui.datamodel.DataGrid;
import com.mxsm.easyui.datavo.ComboboxData;

/**
 * 获取Easyui各种插件的JSON数据
 * @author mxsm
 *
 */

public class EasyUI {

	public static final  String DEFAULT_DATAGRID_JSON =  "{\"total:\"0,\"rows\":[]}";
	
	/**
	 * 获取ComboboxJSON格式String,如果data为null或者data 大小等于0 返回[] 否则返回对应的json数据
	 * @param data
	 * @return [] or json String
	 */
	public static String  getComboboxJSONString(List<? extends Combobox> data){
		
		if(data == null || data.size() <= 0){
			return "[]";
		}
		
		String _json;
		
		try {
			_json = JSONArray.toJSONString(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "[]";
		}
		
		return _json;
	}
	
	/**
	 * 获取ComboboxJSON格式String,如果data为null或者data 大小等于0 返回[] 否则返回对应的json数据
	 * @param data
	 * @return [] or json String
	 */
	public static String  getComboboxJSONString(ComboboxData<? extends Combobox> data){
		
		return getComboboxJSONString(data.getData());
	}
	
	
	public static String getGroupComboboxJSONString(List<? extends Combobox> data){
		
		if(data == null || data.size() <= 0){
			return "[]";
		}
		
		String _json;
		
		try {
			_json = JSONArray.toJSONString(data);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "[]";
		}
		
		return _json;
	}
	
   public static String getGroupComboboxJSONString(ComboboxData<? extends Combobox> data){
		
		return getGroupComboboxJSONString(data.getData());
	}
	
   public static <T> String getDataGridJSONString(DataGrid<T> data){
	
	   if(data == null){
		   return DEFAULT_DATAGRID_JSON;
	   }
	   
	   try {
		   return JSONObject.toJSONString(data);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return DEFAULT_DATAGRID_JSON;
	}
	   
	   
	  
   }
   
   
   
}
