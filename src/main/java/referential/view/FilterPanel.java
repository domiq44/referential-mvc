package referential.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FilterPanel extends JPanel {
	private static final long serialVersionUID = 6723387802740844418L;

	private final JLabel jLabelKey;
	private final JTextField jTextFieldKey;
	private final JButton jButtonSearch;

	public FilterPanel() {
		jLabelKey = new JLabel("Key:");
		jTextFieldKey = new JTextField(12);
		jTextFieldKey.setToolTipText("Enter key");
		jButtonSearch = new JButton("Search");

		setLayout(new FlowLayout());
		add(jLabelKey);
		add(jTextFieldKey);
		add(jButtonSearch);
	}

	public JTextField getJTextFieldKey() {
		return jTextFieldKey;
	}

	public JButton getJButtonSearch() {
		return jButtonSearch;
	}

}
