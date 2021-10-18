package sets;

import java.lang.reflect.Field;

import annotations.Rule;
import annotations.ToString;
import fr.diginamic.testexceptions.ReflectionException;
import fr.diginamic.testexceptions.RuleException;

public class Pays {
	@ToString(separateur = "->", upperCase=true)
	private String nom;
	
	@ToString(separateur = "$/habs")	
	private int pib;

	@ToString(separateur = "habs")
	@Rule(min=0)
	private int nombreHabitant;	
	
	public Pays(String nom, int nombreHabitant, int pIB) throws RuleException, IllegalArgumentException, IllegalAccessException, ReflectionException {
		
		this.nom = nom;
		this.pib = pIB;
		this.nombreHabitant = nombreHabitant;
		Validator.validate(this);
	}
	
	public Pays() {}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNombreHabitant() {
		return nombreHabitant;
	}

	public void setNombreHabitant(int nombreHabitant) {
		this.nombreHabitant = nombreHabitant;
	}

	public int getPib() {
		return pib;
	}

	public void setPib(int pib) {
		this.pib = pib;
	}	
	
}
