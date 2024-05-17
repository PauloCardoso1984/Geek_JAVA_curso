package classesAnonimas;

import java.util.function.Consumer;

public class ClassesAnonima implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
}