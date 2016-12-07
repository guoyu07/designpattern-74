package my.designpattern.construct.composite;

public class ClientTest {
	public static void main(String[] args) {
		UIController button,button1,inputText,container1,container2;
		
		button = new Button();
		button1 = new Button();
		inputText = new InputText();
		container1 = new Container();
		container2 = new Container();
		
		container1.addComposition(button);
		container1.addComposition(button1);
		container1.addComposition(inputText);
		container2.addComposition(container1);
		container2.addComposition(inputText);
		container2.addComposition(button1);
		container2.display();
	}
}
