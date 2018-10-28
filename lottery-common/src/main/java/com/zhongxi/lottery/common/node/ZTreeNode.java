package com.zhongxi.lottery.common.node;

/**
 * 
 * jquery ztree 插件的节点
 * 
 * @author shenxh
 * @since 2018-05-04
 */
public class ZTreeNode {

	private Long id;	//节点id
	
	private Long parentId;//父节点id
	
	private String name;//节点名称
	
	private Boolean isOpen;//是否打开节点
	
	private Boolean checked;//是否被选中

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Boolean getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}
	
	public static ZTreeNode createParent(){
		ZTreeNode zTreeNode = new ZTreeNode();
		zTreeNode.setChecked(true);
		zTreeNode.setId(0L);
		zTreeNode.setName("顶级");
		zTreeNode.setIsOpen(true);
		zTreeNode.setParentId(0L);
		return zTreeNode;
	}
}
