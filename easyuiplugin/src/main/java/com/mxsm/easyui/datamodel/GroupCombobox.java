package com.mxsm.easyui.datamodel;

/**
 * 分组Combobox
 * @author mxsm
 *
 */
public class GroupCombobox extends Combobox{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4595780139608848635L;

	private String group; //组名

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public GroupCombobox(String group) {
		super();
		this.group = group;
	}

	public GroupCombobox() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupCombobox(String value, String text, String group) {
		super(value, text);
		// TODO Auto-generated constructor stub
		this.group = group;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroupCombobox other = (GroupCombobox) obj;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		return true;
	}
	
}
