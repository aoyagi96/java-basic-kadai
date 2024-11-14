package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車クラスをインスタンス化する
		Car_Chapter15 car = new Car_Chapter15();
		
		// ギアチェンジメソッドを実行
		car.gearChange(3);
		
		// 速度を表示するメソッドを実行
		car.run();
	}

}
