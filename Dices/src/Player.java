
public class Player {
	private char type;
	private int house;
	private int dice_result;
	DoubleDice ndice = new DoubleDice();
	LuckyDoubleDice ldice = new LuckyDoubleDice();
	MisfortuneDoubleDice mdice = new MisfortuneDoubleDice();
	
	public Player(char t, int h) {
		this.type = t;
		this.house = h;
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
	
	public int TrowDice(char type) {
		if(type == 'n') {
			return ndice.ThrowDices();
		}
		else if(type == 'l') {
			return ldice.ThrowDices();
		}
		else if(type == 'm') {
			return mdice.ThrowDices();
		}
		else {
			return 0;
		}
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
