package ch06;

public class _04_HumanMain {
	public static void main(String[] args) {
		
		HumanBehavior(new _04_Drink());
		HumanBehavior(new _04_Eat());
		HumanBehavior(new _04_Breath());
		
	}
	
	public static void HumanBehavior(_04_Human human) {
		human.Behavior();
	}
}
/* 결과값
 * 음료수를 마십니다.
 * 음식을 먹습니다.
 * 숨을 쉽니다.
 */
