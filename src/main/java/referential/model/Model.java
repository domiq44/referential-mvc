package referential.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import referential.entity.Data;

public class Model extends Observable {

	private List<Data> datas;

	public Model() {
		datas = new ArrayList<>();
	}

	public List<Data> getDatas() {
		return datas;
	}

	public void setDatas(List<Data> datas) {
		this.datas = datas;
		setChanged();
		notifyObservers();
	}
}
