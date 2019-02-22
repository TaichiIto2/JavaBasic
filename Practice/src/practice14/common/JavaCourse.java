package practice14.common;

public abstract class JavaCourse implements Course {
	public String getCouresName() {
		return "【Eラーニング】Java";
	}
	String[] array = {"式と演算", "制御構文", "メソッド", "配列", "オブジェクト指向", "継承", "高度な継承"};
	public String[] getCourseUnit() {
		return array;
	}
}
