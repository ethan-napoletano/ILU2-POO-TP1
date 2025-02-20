package villagegaulois;

import java.util.Iterator;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Marche marche;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
		this.marche = new Marche(nbEtalMax)
		
	}

	private static class Marche {
		private Etal[] etals;

		private Marche(int nbEtalMax) {
			this.etals = new Etal[nbEtalMax];
			for (int i = 0; i < etals.length; i++) {
				etals[i] = new Etal();

			}
		}

		private void utiliserEtal(int indiceEtal, Gaulois vendeur, String produit, int nbProduit) {
			if (indiceEtal < 0 || indiceEtal >= etals.length) {
				System.out.println("Mauvais indice");
				return;
			}
			if (etals[indiceEtal].isEtalOccupe()) {
				System.out.println("etal occup�");
				return;
			}
			etals[indiceEtal].occuperEtal(vendeur, produit, nbProduit);

			System.out.println(vendeur.getNom() + " s'est install� � l'�tal " + indiceEtal + " et vend " + nbProduit
					+ " " + produit + ".");

		}

		private int trouverEtalLibre() {
			for (int i = 0; i < etals.length; i++) {
				if (!etals[i].isEtalOccupe()) {
					return i;
				}

			}
			return -1;
		}

		private Etal[] trouverEtals(String produit) {
			int count = 0;
			for (int i = 0; i < etals.length; i++) {
				if (etals[i].contientProduit(produit)) {
					count++;
				}
			}
			if (count == 0) {
				return new Etal[0];
			}

			Etal[] etalsTrouves = new Etal[count];
			int j = 0;

			for (int i = 0; i < etals.length; i++) {
				if (etals[i].contientProduit(produit)) {
					etalsTrouves[j] = etals[i];
					j++;
				}
			}

			return etalsTrouves;
		}

		public Etal trouverVendeur(Gaulois gaulois) {

			for (int i = 0; i < etals.length; i++) {

				if (etals[i].getVendeur() != null && etals[i].getVendeur().equals(gaulois)) {
					return etals[i];
				}
			}

			return null;
		}
		
		private void afficheMarche(){
			int nbetatvide=0;
			for (int i = 0; i < etals.length; i++) {
				if (etals[i].isEtalOccupe()) {
					etals[i].afficherEtal();
				}
				else {
					nbetatvide++;
				}
				
			}
			System.out.println("il reste" + nbetatvide + "non utilise dans le march�");
			
		}
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}

	public Gaulois trouverHabitant(String nomGaulois) {
		if (nomGaulois.equals(chef.getNom())) {
			return chef;
		}
		for (int i = 0; i < nbVillageois; i++) {
			Gaulois gaulois = villageois[i];
			if (gaulois.getNom().equals(nomGaulois)) {
				return gaulois;
			}
		}
		return null;
	}

	public String afficherVillageois() {
		StringBuilder chaine = new StringBuilder();
		if (nbVillageois < 1) {
			chaine.append("Il n'y a encore aucun habitant au village du chef " + chef.getNom() + ".\n");
		} else {
			chaine.append("Au village du chef " + chef.getNom() + " vivent les légendaires gaulois :\n");
			for (int i = 0; i < nbVillageois; i++) {
				chaine.append("- " + villageois[i].getNom() + "\n");
			}
		}
		return chaine.toString();
	}

	public String installerVendeur(Gaulois vendeur, String produit, int nbProduit) {
		int indiceEtalLibre = marche.trouverEtalLibre();
		if (indiceEtalLibre != -1) {
			marche.utiliserEtal(indiceEtalLibre, vendeur, produit, nbProduit);
			return vendeur.getNom() + " s'est installé à l'étal " + indiceEtalLibre + " et vend " + nbProduit + " " + produit + ".";
		}
		return "Il n'y a plus d'étals disponibles pour " + vendeur.getNom() + ".";
	}

	public String rechercherVendeursProduit(String produit) {
		Etal[] etalsTrouves = marche.trouverEtals(produit);
		StringBuilder chaine = new StringBuilder();
		if (etalsTrouves.length == 0) {
			chaine.append("Personne ne vend ce produit au marché.\n");
		} else {
			chaine.append("Les vendeurs qui proposent des ").append(produit).append(" sont :\n");
			for (Etal etal : etalsTrouves) {
				chaine.append("- ").append(etal.getVendeur().getNom()).append("\n");
			}
		}
		return chaine.toString();
	}

	public Etal rechercherEtal(Gaulois vendeur) {
		return marche.trouverVendeur(vendeur);
	}

	public String partirVendeur(Gaulois vendeur) {
		Etal etal = rechercherEtal(vendeur);
		if (etal != null) {
			return etal.libererEtal();
		}
		return vendeur.getNom() + " n'a pas d'étal sur le marché.";
	}

	public String afficherMarche() {
		return marche.afficheMarche();
	}
}

}