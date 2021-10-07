package interfaces;

/**
 * Listes les methodes obligatoires que doit poss�der un objet g�om�trique
 * @author benja
 *
 */

public interface ObjetGeometrique {

	/**
	 * Retourne le p�rim�tre d'une forme g�om�trique
	 * @return double
	 */
	double perimetre();
	
	/**
	 * Retourne la surface
	 * @return double
	 */
	double surface();
	
	/**
	 * Retourne le type
	 * @return String
	 */
	String type();
}
