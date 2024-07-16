
public class Persons {
	private char type;
	private int house;
	private int dice_result;
	private String color;
	DoubleDice dice = new DoubleDice();
	
	
	
	public Persons(char t, int h, String c) {
		this.type = t;
		this.house = h;
		this.color = c;
	}
	
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public int getHouse() {
		return house;
	}
	public void setHouse(int house) {
		this.house = house;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int TrowDice(char type) {
		if(type == 'n') {
			dice = new DoubleDice();
		}
		else if(type == 'l') {
			dice = new LuckyDoubleDice();
		}
		else if(type == 'm') {
			dice = new MisfortuneDoubleDice();
		}
		else {
			return 0;
		}
		
		return dice.ThrowDices();
	}
	
	public int getDiceResult() {
		return dice_result;
	}
	public void rollDice() {
		this.dice_result = TrowDice(this.type);
	}
	
	public void walk() {
		this.house += this.dice_result;
	}

	
	
	
}
