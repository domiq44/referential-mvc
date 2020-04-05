package referential.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import referential.entity.Data;

public class DataTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 6194989978711184280L;

	private final String[] tableColumnNames = { "No #", "KEY", "VALUE", "COMMENT" };
	private List<String[]> tableValues = new ArrayList<>();

	@Override
	public int getColumnCount() {
		return tableColumnNames.length;
	}

	@Override
	public int getRowCount() {
		return tableValues.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return tableValues.get(rowIndex)[columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		return tableColumnNames[column];
	}

	public void setDatas(List<Data> datas) {
		tableValues = new ArrayList<>();
		int indexCount = 1;
		for (final Data data : datas) {
			tableValues.add(new String[] {
					String.valueOf(indexCount++),
					data.getKey(),
					data.getValue(),
					data.getComment()

			});
		}
		fireTableChanged(null);
	}

}
