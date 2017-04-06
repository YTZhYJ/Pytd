package com.pytd.db.biz.impl;

import java.util.List;

import com.pytd.db.biz.ModuleMenuBiz;
import com.pytd.db.dao.ModuleMenuDao;
import com.pytd.db.entity.ModuleMenu;

public class ModuleMenuBizImpl implements ModuleMenuBiz {

	ModuleMenuDao moduleMenuDao; 
	
	public ModuleMenuDao getModuleMenuDao() {
		return moduleMenuDao;
	}

	public void setModuleMenuDao(ModuleMenuDao moduleMenuDao) {
		this.moduleMenuDao = moduleMenuDao;
	}

	@Override
	public List<ModuleMenu> getModuleMenuAll() {
		return moduleMenuDao.getModuleMenuAll();
	}

	@Override
	public List<ModuleMenu> getModuleMenuByViewable(Boolean viewable) {
		return moduleMenuDao.getModuleMenuByViewable(viewable);
	}

	@Override
	public ModuleMenu getModuleMenuById(Long id) {
		// TODO Auto-generated method stub
		return moduleMenuDao.getModuleMenuById(id);
	}

	@Override
	public List<ModuleMenu> getModuleMenuByFather(Long id) {
		// TODO Auto-generated method stub
		return moduleMenuDao.getModuleMenuByFather(id);
	}

	@Override
	public List<ModuleMenu> getModuleMenuByFather(ModuleMenu fatherModuleMenu) {
		// TODO Auto-generated method stub
		return moduleMenuDao.getModuleMenuByFather(fatherModuleMenu);
	}

	@Override
	public void updateModuleMenu(ModuleMenu moduleMenu) {
		// TODO Auto-generated method stub
		moduleMenuDao.updateModuleMenu(moduleMenu);
	}

	@Override
	public void deleteModuleMenu(ModuleMenu moduleMenu) {
		// TODO Auto-generated method stub
		moduleMenuDao.deleteModuleMenu(moduleMenu);
	}

	@Override
	public void deleteModuleMenuById(Long id) {
		// TODO Auto-generated method stub
		moduleMenuDao.deleteModuleMenuById(id);
	}

	@Override
	public void deleteModuleMenuByFatherId(Long id) {
		// TODO Auto-generated method stub
		moduleMenuDao.deleteModuleMenuByFatherId(id);
	}

	@Override
	public void deleteModuleMenuByFather(ModuleMenu fatherModuleMenu) {
		// TODO Auto-generated method stub
		moduleMenuDao.deleteModuleMenuByFather(fatherModuleMenu);
	}

	@Override
	public void addModuleMenu(ModuleMenu moduleMenu) {
		// TODO Auto-generated method stub
		moduleMenuDao.addModuleMenu(moduleMenu);
	}

	@Override
	public List<ModuleMenu> getFrontedModuleMenu() {
		// TODO Auto-generated method stub
		return moduleMenuDao.getFrontedModuleMenu();
	}

	@Override
	public List<ModuleMenu> getBackendModuleMenu() {
		// TODO Auto-generated method stub
		return moduleMenuDao.getBackendModuleMenu();
	}

}
