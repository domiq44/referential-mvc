package referential.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import referential.model.DataTableModel;
import referential.model.Model;

public class ResultPanel extends JPanel implements Observer {
	private static final long serialVersionUID = 8960055646882567144L;

	private final Model model;
	private final DataTableModel tableModel;
	private final JTable jTable;
	private final JScrollPane jScrollPane;

	public ResultPanel(Model model) {
		this.model = model;
		this.model.addObserver(this);

		tableModel = new DataTableModel();
		jTable = new JTable(tableModel);
		jScrollPane = new JScrollPane(jTable);
		add(jScrollPane);
	}

	@Override
	public void update(Observable o, Object arg1) {
		tableModel.setDatas(model.getDatas());
	}
}
