package utils;

import java.lang.reflect.Field;

import annotations.ToString;
import fr.diginamic.testexceptions.ReflectionException;

public class StringUtils {

	public static void afficherAttributs(Object obj) throws IllegalArgumentException,
	IllegalAccessException, ReflectionException {
		String value = "";
 
		if (obj == null)
			throw new ReflectionException("Object null");

		Class<?> classe = obj.getClass();

		Field[] fields = classe.getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);
			if (field.isAnnotationPresent(ToString.class)) {
				ToString annotation = field.getAnnotation(ToString.class);
				boolean uppercase = annotation.upperCase();
				String separateur = annotation.separateur();

				if (field.isAnnotationPresent(ToString.class)) {

					if (uppercase) {
						value += field.get(obj).toString().toUpperCase() + " ";
					}
					else {
						value += field.get(obj).toString() + " ";
					}
					if (!separateur.isEmpty()) {
						value += separateur + " ";
					}
				}
			}
		}
		System.out.println(value);
	}
}
