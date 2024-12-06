package ch06;

class _04_Eating extends _04_Humans {
	@Override
	public void Behavior() {
		System.out.println("음식을 먹습니다.");
	}
	
	public void dinner() {
		System.out.println("간식을 먹습니다.");
	}
}

class _04_Breathe extends _04_Humans {
	@Override
	public void Behavior() {
		System.out.println("코로 숨을 쉽니다.");
	}
	
	public void mouse() {
		System.out.println("입으로 숨을 쉽니다.");
	}
}

class _04_Drinking extends _04_Humans{
	@Override
	public void Behavior() {
		System.out.println("물을 마십니다.");
	}
	
	public void coke() {
		System.out.println("콜라를 마십니다.");
	}
}

class _04_Humans {
	
	public void Behavior() {
		System.out.println("행동을 취합니다.");
	}
}


public class _04_HumanMain2 {
	public static void main(String[] args) {
		
		HumanBehaviors(new _04_Drinking());
		HumanBehaviors(new _04_Eating());
		HumanBehaviors(new _04_Breathe());
		
	}
	
	public static void HumanBehaviors(_04_Humans human) {
		human.Behavior();
		if(human instanceof _04_Eating) {
			_04_Eating eats = (_04_Eating)human;
			eats.dinner();
		} else if(human instanceof _04_Breathe) {
			_04_Breathe brt = (_04_Breathe)human;
			brt.mouse();
		} else if(human instanceof _04_Drinking){
			_04_Drinking drk = (_04_Drinking)human;
			drk.coke();
		}
		System.out.println();
	}
}
/* 결과값
 * 물을 마십니다.
 * 콜라를 마십니다.
 * 
 * 음식을 먹습니다.
 * 간식을 먹습니다.
 * 
 * 코로 숨을 쉽니다.
 * 입으로 숨을 쉽니다.
 */
