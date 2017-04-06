package com.pytd.db.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.pytd.db.biz.ModuleMenuBiz;
import com.pytd.db.entity.ModuleMenu;

public class ModuleViewAction {
	
	private List<ModuleMenu> menuList;
	
	private ModuleMenu moduleMenu;
	public List<ModuleMenu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<ModuleMenu> menuList) {
		this.menuList = menuList;
	}

	public ModuleMenu getModuleMenu() {
		return moduleMenu;
	}

	public void setModuleMenu(ModuleMenu moduleMenu) {
		this.moduleMenu = moduleMenu;
	}

	public ModuleMenuBiz getModuleMenuBiz() {
		return moduleMenuBiz;
	}

	public void setModuleMenuBiz(ModuleMenuBiz moduleMenuBiz) {
		this.moduleMenuBiz = moduleMenuBiz;
	}

	private ModuleMenuBiz moduleMenuBiz;

	
	public String showFrontedModules(){
		
		List<ModuleMenu> list = moduleMenuBiz.getFrontedModuleMenu();
		for(int i = 0 ; i < list.size() ; i ++){
			System.out.println(list.get(i).getId());
		}
		System.out.println("###############");
		return Action.SUCCESS;
	}
	
	public void showBackendModules(){
		
	}
}
