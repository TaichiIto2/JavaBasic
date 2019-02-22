package practice14.common;

public abstract class DBCourse implements Course {
	public String getCouresName() {
		return "【Eラーニング】DB基礎";
	}
	String[] array = {"DB基礎", "SQL基礎", "正規化", "SQL応用"};

	public String[] getCOurseUnit() {
		return array;
	}

}
