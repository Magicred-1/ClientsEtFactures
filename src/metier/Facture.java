package metier;

import java.time.LocalDate;

public class Facture
{
	Client client;
	private int montantFacture;
	private LocalDate dateFacture;
	boolean reglementFacture;

	public Facture(Client client, int montant, boolean estReglee, LocalDate date)
	{
		this.client = client;
		montantFacture = montant;
		dateFacture = LocalDate.now();
		reglementFacture = false;
	}



	public Facture(int montant, Client client) {
		// TODO Auto-generated constructor stub
	}



	public Client getClient()
	{
		return client;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */

	public int getMontant()
	{
		return montantFacture;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai si la facture est reglée.
	 */

	public boolean estReglee()
	{
		return reglementFacture;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */

	public LocalDate getDate()
	{
		return dateFacture;
	}

	/**
	 * Supprime la facture
	 */

	public void delete()
	{
		
	}

	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */

	public Facture copie()
	{
		Facture.clone();
	}
}