package my.designpattern.construct.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container extends UIController {

	private List<UIController> compositionList = new ArrayList<UIController>();
	
	@Override
	public UIController getComposition(UIController uiController) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void addComposition(UIController uiController) {
		// TODO Auto-generated method stub
		compositionList.add(uiController);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		for(Iterator<UIController> it = compositionList.iterator();it.hasNext();it.next().display());
	}

}
