package com.mxsm.easyui;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ASMDeserializerFactory;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializerMap;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.util.FieldInfo;
import com.mxsm.easyui.datamodel.Combobox;
import com.mxsm.easyui.datamodel.GroupCombobox;
import com.mxsm.easyui.datavo.ComboboxData;

import junit.framework.TestCase;

public class EasyUITest extends TestCase {

	public void testGetComboboxJSONString() {
		
		System.out.println(EasyUI.getComboboxJSONString(new ComboboxData<Combobox>()));
		System.out.println(EasyUI.getComboboxJSONString(new ArrayList<Combobox>()));
		
		List<Combobox> list = new ArrayList<Combobox>();
		Combobox com = new Combobox("qqqq","11111");
		Combobox com2 = new Combobox("11111","11222111");
		Combobox com3 = new Combobox("q222qqq","11222111");
		
		list.add(com3);
		list.add(com2);
		list.add(com);
		
		System.out.println(EasyUI.getComboboxJSONString(list));
	}

	public void testGetGroupComboboxJSONString(){
		
		//System.out.println(EasyUI.getGroupComboboxJSONString());
		//System.out.println(EasyUI.getGroupComboboxJSONString(new ArrayList<GroupCombobox>()));
		Person p = new Person();
		p.setAddress("111111");
		p.setName("11111");
		
		SerializeConfig conf = new SerializeConfig();
		conf.setTypeKey("qqqqq");
		
		//JSONSerializerMap ma = new JSONSerializerMap();    
	}
	
}
