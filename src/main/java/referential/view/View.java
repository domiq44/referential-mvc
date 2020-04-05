package referential.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import referential.model.Model;

public class View extends JFrame {
	private static final long serialVersionUID = 7304169346584727417L;

	private final Model model;
	private final FilterPanel filterPanel;
	private final ResultPanel resultPanel;

	public View(Model model) {
		this.model = model;

		setTitle("Data List");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		filterPanel = new FilterPanel();
		add(filterPanel, BorderLayout.NORTH);

		resultPanel = new ResultPanel(model);
		add(resultPanel, BorderLayout.CENTER);

		setBounds(10, 10, 500, 500);
		setVisible(true);
	}

	public FilterPanel getFilterPanel() {
		return filterPanel;
	}

}
