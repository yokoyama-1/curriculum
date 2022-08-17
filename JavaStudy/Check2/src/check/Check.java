package check;
import constants.Constants;


public class Check {
	
	private String firstName;
	private String lastName;
	
    public Check(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Check check = new Check("横山", "祐汰");
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		
		
		printName(check.getFirstName(),check.getLastName());
		pet.introduce();
		robotPet.introduce();
		
		
		
    }
	private static void printName(String firstName,String lastName) {
		
		System.out.println("printNameメソッド→"+firstName+lastName);
		
	}
}