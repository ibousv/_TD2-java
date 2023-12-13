
       	public class Livre{
    // Variables
     private String titre, auteur;
    private int nbPages;
   // Constructeur
      public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
      }
    
    // Accesseur
    public String getAuteur() {
     return auteur;
    }

    public String getTitre(){
        return titre;
    }
     
     public int getNbPages(){
        return nbPages;
     }

   // Modificateur
   void setNbPages(int n) {
     if (n>0) {
         nbPages = n;
     }
     else
        System.out.println("Erreur le nombre de page ne peut être négatif ou nul"); 
   }

     void setAuteur(String  unAuteur) {
      auteur = unAuteur;
   }

    void setTire(String unTitre){
        titre = unTitre;
    }
    

   public static void main(String[] args) {
   	  Livre l1 = new Livre("Sigmund Freud","Le moi et le Ça");
   	  Livre l2 = new Livre("Nietzshe","Par delà le bien et le mal");
      //Indication des nombres de pages avec les setteurs
      l1.setNbPages(128); l2.setNbPages(442);
       //Affichage des nombres de pages
   	  System.out.println("Le nombre de pages du premier livre est "+ l1.nbPages);//par attribut
      System.out.println("Le nombre de pages du deuxième livre est "+ l2.getNbPages());//par méthode
      //calcul du nombre de pages
      int somme = l1.getNbPages() + l2.getNbPages();

      System.out.println("Le nombre de pages de ces deux livres est "+ somme);//(l1.nbPages + l2.nbPages) est aussi possible

   }
}
