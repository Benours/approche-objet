package interfaces;

/**
 * Listes les methodes obligatoires que doit posséder un objet géométrique
 * @author benja
 *
 */

public interface ObjetGeometrique {

	/**
	 * Retourne le périmètre d'une forme géométrique
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
