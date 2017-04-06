package com.pytd.db.dao;

import java.util.List;

import com.pytd.db.entity.ModuleMenu;

public interface ModuleMenuDao {

	public List<ModuleMenu> getModuleMenuAll();
	
	public List<ModuleMenu> getFrontedModuleMenu();
	
	public List<ModuleMenu> getBackendModuleMenu();
	
	public List<ModuleMenu> getModuleMenuByViewable(Boolean viewable);
	
	public ModuleMenu getModuleMenuById(Long id);
	
	public List<ModuleMenu> getModuleMenuByFather(Long id);
	
	public List<ModuleMenu> getModuleMenuByFather(ModuleMenu fatherModuleMenu);
	
	public void updateModuleMenu(ModuleMenu moduleMenu);
	
	public void deleteModuleMenu(ModuleMenu moduleMenu);
	
	public void deleteModuleMenuById(Long id);
	
	public void deleteModuleMenuByFatherId(Long id);
	
	public void deleteModuleMenuByFather(ModuleMenu fatherModuleMenu);
	
	public void addModuleMenu(ModuleMenu moduleMenu);
	
}