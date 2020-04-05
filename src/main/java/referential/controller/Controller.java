package referential.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import referential.dao.DataDao;
import referential.dao.impl.DataDaoImpl;
import referential.model.Model;
import referential.view.View;

public class Controller implements ActionListener {

	private final Model model;
	private final View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			final String key = view.getFilterPanel().getJTextFieldKey().getText();
			final DataDao dataDao = new DataDaoImpl();
			model.setDatas(dataDao.getDataByKey(key));
		} catch (final Exception e1) {
			JOptionPane.showMessageDialog(null, e1.getMessage());
		}
	}

}
