//fix the code by figuring out what should be in the **** sections
public class EggBox{
	//vars
	private int eggs;
	private int boxSize;
	private int numBoxes;
	private int leftOverEggs;

	//set
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	public void setBoxSize(int boxSize){
		this.boxSize=boxSize;
	}
	//compute
	public void computeBoxes(){
		numBoxes=eggs/boxSize; //fixed variable boxSize for the operation
	}
	public void computeLeftover(){
		leftOverEggs= eggs % boxSize; //fixed the left over operator
	}
	//get
	public int getBoxes(){
		return numBoxes; //fixed the returning variable
	}
	public int getLeftover(){
		return leftOverEggs; //fixed the returning variable 
	}
}