Ethan
ethan31_
Invisible

Dzeax Bitten — 01/03/2025 18:17
La réponse est vraiment très dur pour le coup c'est la seule question un peu impossible
Stichy — 01/03/2025 18:21
bah franchement si c'est juste une seule question impossible ça va 
Dori — 01/03/2025 18:27
+1
c juste ca sur quoi on est cook pr vous?
@ultrared  @Stichy
ou y'a dautres trucs?
ca fait la fiche ce soir ? @ultrared
Stichy — 01/03/2025 18:28
on a galéré vite fais
ultrared — 01/03/2025 18:28
Nn je voulais juste te faire stressé pour faire la fiche
Dzeax Bitten — 01/03/2025 18:28
En vrai si ça s'en tient à ce qu'on a fait en TD, ce devrait le faire
Dori — 01/03/2025 18:28
sale batard mdr
ct sur
ultrared — 01/03/2025 18:29
ouais mais faut faire la fihe
@Dori
Dori — 01/03/2025 18:29
ouais on commence dès que la game est fini
ultrared — 01/03/2025 18:31
dans 15 min je mange
Dori — 01/03/2025 18:32
ds tout les cas on la fait ce soir la fiche
ok?
flm de la faire demain
Stichy — 01/03/2025 18:32
moi jla fais
ultrared — 01/03/2025 18:33
vsy je mange je tappelle et on la thryhard
Dori — 01/03/2025 18:33
bah tfacon on va reprendre celle d'antoine et ajouter ce qu'il nous faut
trql
ultrared — 01/03/2025 18:33
oui
ultrared — 01/03/2025 22:53
@Dzeax Bitten est ce que tu a la correction des exercice de ton cc que ta envoyer en photo Antoine
Dzeax Bitten — 01/03/2025 22:54
Pas du dernier exo
ultrared — 01/03/2025 22:54
@Dzeax Bitten envoie ce que ta deja ca serais carre
@Stichy ca revise
Dzeax Bitten — 02/03/2025 07:11
Image
Bon en fait j'ai juste ça
ultrared — 02/03/2025 10:07
@Stichy ca revise
Stichy — 02/03/2025 21:33
@ultrared t chaud dans 10 min ?
Dzeax Bitten — 03/03/2025 12:30
Image
Image
Image
Vous avez réussi  ? @Dori @Ethan
J'ai fait les questions de cours j'ai au moins 4 points par contre le reste je suis dans la merde
Dori — 03/03/2025 12:58
Écoute ça a utilisé le chad mdrrr on va voir ce que ça donne
Dzeax Bitten — 03/03/2025 14:32
C'était tellement pas ce qu'on a eu en TD je suis atterré
Il nous a dit ouais ça va tomber sur le TAD Stack ou TAD Queue, bam, il nous met des listes ce chien
Stichy — 04/03/2025 22:43
Sa mère g oublié POO
Dori — 04/03/2025 22:43
prend en photos
les reponses
et comme ca tu peux les check
(si tu fais l'eval sur tel comme nous )
Dzeax Bitten — 04/03/2025 22:44
J'ai fini le TP1 de POO si vous voulez d'ailleurs
Dori — 04/03/2025 22:44
chaud
vu que ce fdp de isma est censé l'envoyer depuis 2 semaines mais qu'il le fait pas
mdrr
Dzeax Bitten — 04/03/2025 22:45
vous avez accès à mon github ?
 
package histoire;

import villagegaulois.Etal;
import personnages.Gaulois;

public class ScenarioCasDegrade {
    public static void main(String[] args) {
        
        try {
            Etal etal = new Etal();
            etal.libererEtal();
        } catch (Exception e) {
            System.err.println("Exception : " + e.getMessage());
        }

      
        try {
            Etal etal = new Etal();
            etal.acheterProduit(5, null);
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }

        
        try {
            Etal etal = new Etal();
            Gaulois asterix = new Gaulois("Astérix", 10);
            etal.acheterProduit(-2, asterix);
        } catch (Exception e) {
            System.err.println("Exception  " + e.getMessage());
        }

        
        try {
            Etal etal = new Etal();
            Gaulois obelix = new Gaulois("Obélix", 50);
            etal.acheterProduit(3, obelix);
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }

        System.out.println("Fin du test");
    }
}
Réduire
ScenarioCasDegrade.java
2 Ko
package histoire;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class Scenario {

public static void main(String[] args) {
Village village = new Village("le village des irréductibles", 10, 5);
Chef abraracourcix = new Chef("Abraracourcix", 10, village);
village.setChef(abraracourcix);
Druide druide = new Druide("Panoramix", 2, 5, 10);
Gaulois obelix = new Gaulois("Obélix", 25);
Gaulois asterix = new Gaulois("Astérix", 8);
Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
Gaulois bonemine = new Gaulois("Bonemine", 7);

village.ajouterHabitant(bonemine);
village.ajouterHabitant(assurancetourix);
village.ajouterHabitant(asterix);
village.ajouterHabitant(obelix);
village.ajouterHabitant(druide);
village.ajouterHabitant(abraracourcix);
village.afficherVillageois();

System.out.println(village.rechercherVendeursProduit("fleurs"));
System.out.println(village.installerVendeur(bonemine, "fleurs", 20));
System.out.println(village.rechercherVendeursProduit("fleurs"));
System.out.println(village.installerVendeur(assurancetourix, "lyres", 5));
System.out.println(village.installerVendeur(obelix, "menhirs", 2));
System.out.println(village.installerVendeur(druide, "fleurs", 10));

System.out.println(village.rechercherVendeursProduit("fleurs"));
Etal etalFleur = village.rechercherEtal(bonemine);
System.out.println(etalFleur.acheterProduit(10, abraracourcix));
System.out.println(etalFleur.acheterProduit(15, obelix));
System.out.println(etalFleur.acheterProduit(15, assurancetourix));
System.out.println(village.partirVendeur(bonemine));
System.out.println(village.afficherMarche());
}

}
Réduire
Scenario.java
2 Ko
 
package villagegaulois;

public class VillageSansChefException extends RuntimeException{


public VillageSansChefException(String message) {
super(message);
}



}
Réduire
VillageSansChefException.java
1 Ko
package villagegaulois;

import personnages.Gaulois;

public class Etal {
private Gaulois vendeur;
private String produit;
private int quantiteDebutMarche;
private int quantite;
private boolean etalOccupe = false;

public boolean isEtalOccupe() {
return etalOccupe;
}

public Gaulois getVendeur() {
return vendeur;
}

public void occuperEtal(Gaulois vendeur, String produit, int quantite) {
this.vendeur = vendeur;
this.produit = produit;
this.quantite = quantite;
quantiteDebutMarche = quantite;
etalOccupe = true;
}

public String libererEtal() {
if (!(isEtalOccupe())){
throw new IllegalStateException("Impossible de libérer un étal qui n'a jamais été occupé ! ");
}


etalOccupe = false;
StringBuilder chaine = new StringBuilder(
"Le vendeur " + vendeur.getNom() + " quitte son étal, ");
int produitVendu = quantiteDebutMarche - quantite;
if (produitVendu > 0) {
chaine.append(
"il a vendu " + produitVendu + " parmi " + produit + ".\n");
} else {
chaine.append("il n'a malheureusement rien vendu.\n");
}
return chaine.toString();
}

public String afficherEtal() {
if (etalOccupe) {
return "L'étal de " + vendeur.getNom() + " est garni de " + quantite
+ " " + produit + "\n";
}
return "L'étal est libre";
}

public String acheterProduit(int quantiteAcheter, Gaulois acheteur) {
if (acheteur == null) {
throw new NullPointerException("L'acheteur ne peut pas être null");
}
if (quantiteAcheter<1) {
throw new IllegalArgumentException("La quantité achetée doit être supérieur à 0.");
}


if(!(isEtalOccupe())) {
throw new IllegalStateException("Impossible d'acheter dans un étal vide.");
}



StringBuilder chaine = new StringBuilder();
chaine.append(acheteur.getNom() + " veut acheter " + quantiteAcheter
+ " " + produit + " à " + vendeur.getNom());
if (quantite == 0) {
chaine.append(", malheureusement il n'y en a plus !");
quantiteAcheter = 0;
}
if (quantiteAcheter > quantite) {
chaine.append(", comme il n'y en a plus que " + quantite + ", "
+ acheteur.getNom() + " vide l'étal de "
+ vendeur.getNom() + ".\n");
quantiteAcheter = quantite;
quantite = 0;
}
if (quantite != 0) {
quantite -= quantiteAcheter;
chaine.append(". " + acheteur.getNom()
+ ", est ravi de tout trouver sur l'étal de "
+ vendeur.getNom() + "\n");
}
return chaine.toString();


}

public boolean contientProduit(String produit) {
return produit.equals(this.produit);
}

}
Réduire
Etal.java
3 Ko
package villagegaulois;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
private String nom;
private Chef chef;
private Gaulois[] villageois;
private int nbVillageois = 0;
private Marche marche;

public Village(String nom, int nbVillageoisMaximum, int nbEtalMax) {
this.nom = nom;
villageois = new Gaulois[nbVillageoisMaximum];
this.marche = new Marche(nbEtalMax);
}

private static class Marche {
private Etal[] etals;
private int nbEtalMarche=0;



private Marche(int nbEtalMax) {
this.nbEtalMarche = nbEtalMax;
etals = new Etal[nbEtalMax];

for (int i = 0; i < nbEtalMax; i++) {
        etals[i] = new Etal();
    }

}
private void utiliserEtal(int indiceEtal, Gaulois vendeur, String produit, int nbProduit) {
if (indiceEtal < 0 || indiceEtal >= etals.length) {
System.out.println("Indice en dehors du tableau.");
return;
}

if (etals[indiceEtal].isEtalOccupe()) {
System.out.println("L'étal est déjà occupé");
}

etals[indiceEtal].occuperEtal(vendeur, produit, nbProduit);


System.out.println("Le gaulois " + vendeur.getNom() + " s'est installé à l'étal " + indiceEtal + " et vend " + nbProduit + produit);

}

private int trouverEtalLibre() {
for(int i=0;i<etals.length;i++) {
if (!(etals[i].isEtalOccupe())) {
return i;
}
}
return -1;
}

private Etal[] trouverEtals(String produit) {
int cpt = 0;
for(int i=0;i<etals.length;i++) {
if (etals[i] != null && etals[i].isEtalOccupe() && etals[i].contientProduit(produit)) {
cpt++;
}
}
Etal[] etaloccupe = new Etal[cpt];

if(cpt==0) {
return etaloccupe;
}

int cpt2=0;


for(int j=0;j<etals.length;j++) {
if(etals[j] != null && etals[j].isEtalOccupe() && etals[j].contientProduit(produit)) {
etaloccupe[cpt2]=etals[j];
cpt2++;

}
}

return etaloccupe;

}

private Etal trouverVendeur(Gaulois gaulois) {
for(int i=0;i<etals.length;i++) {
if(etals[i].getVendeur() == gaulois) {
return etals[i];
}
}
return null;
}


private String afficherMarche() {
StringBuilder chaine = new StringBuilder();
int nbEtalsvide = 0;
... (107lignes restantes)
Réduire
Village.java
6 Ko
﻿
package histoire;

import villagegaulois.Etal;
import personnages.Gaulois;

public class ScenarioCasDegrade {
    public static void main(String[] args) {
        
        try {
            Etal etal = new Etal();
            etal.libererEtal();
        } catch (Exception e) {
            System.err.println("Exception : " + e.getMessage());
        }

      
        try {
            Etal etal = new Etal();
            etal.acheterProduit(5, null);
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }

        
        try {
            Etal etal = new Etal();
            Gaulois asterix = new Gaulois("Astérix", 10);
            etal.acheterProduit(-2, asterix);
        } catch (Exception e) {
            System.err.println("Exception  " + e.getMessage());
        }

        
        try {
            Etal etal = new Etal();
            Gaulois obelix = new Gaulois("Obélix", 50);
            etal.acheterProduit(3, obelix);
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }

        System.out.println("Fin du test");
    }
}
