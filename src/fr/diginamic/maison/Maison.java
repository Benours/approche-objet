package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	private Piece[] pieces;

	public Maison() {
		this.pieces = new Piece[0];
	}

	public void ajouterPiece(Piece piece) {
		if (piece == null)
			System.err.println("Veuillez rentrer des données valides!\n -- ERREUR : piece null");
		else {
			pieces = Arrays.copyOf(pieces, pieces.length + 1);
			pieces[pieces.length - 1] = piece;
		}
	}

	public Piece[] getPieces() {
		return pieces;
	}
	
	public int superficiePieces(String type) {
		int total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) 
				total += pieces[i].getSuperficie();
		}
		return total;
	}
	
	public int nombrePiecesType(String type) {
		int total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i].getType() == type) 
				total ++;
		}
		return total;
	}

	public int superficieTotale() {
		int total = 0;
		for (int i = 0; i < pieces.length; i++)
			total += pieces[i].getSuperficie();
		return total;
	}

	public int superficieEtage(int etage) {
		int total = 0;
		for (int i = 0; i < pieces.length; i++) {
			if (etage == pieces[i].getEtage())
				total += pieces[i].getSuperficie();	
		}
		return total;
	}
}
