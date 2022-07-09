package exam13;

import java.util.HashSet;
import java.util.Objects;

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SutdaCard other = (SutdaCard) obj;
		return isKwang == other.isKwang && num == other.num;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(isKwang, num);
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}

public class Sample07 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true);
		SutdaCard c2 = new SutdaCard(3,true);
		SutdaCard c3 = new SutdaCard(1,true);
		HashSet set = new HashSet();
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
	}

}
