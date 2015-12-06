package com.mxsm.easyui.datamodel;

import java.util.List;

/**
 * Easyui tree 数据
 * @author mxsm
 *
 */

public class Tree {

	public static final String TREE_NODE_CLOSED = "closed";
	
	public static final String TREE_NODE_OPEN = "open";
	
	private String id;
	
	private String text;
	
	private String state;
	
	private boolean checked;
	
	private List<Tree> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public List<Tree> getChildren() {
		return children;
	}

	public void setChildren(List<Tree> children) {
		this.children = children;
	}
	
}
