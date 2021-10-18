package sets;

import java.lang.reflect.Field;

import annotations.Rule;
import fr.diginamic.testexceptions.ReflectionException;
import fr.diginamic.testexceptions.RuleException;

public class Validator {
	
	public static void validate(Object obj) throws IllegalArgumentException,
	IllegalAccessException, ReflectionException, RuleException {
		
		if (obj == null)
			throw new ReflectionException("Object null");

		Class<?> classe = obj.getClass();
		Field[] fields = classe.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(Rule.class)) {				
				Rule annotation = field.getAnnotation(Rule.class);
				int min = annotation.min();
				if (min > Integer.parseInt(field.get(obj).toString()))
					throw new RuleException("nombreHabitant < 0");
			}
		}
	}

}
