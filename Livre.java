
	      /* La classe par défaut */
/*
    	public class Livre{
    // Variables
    private String titre, auteur;
    private int nbPages
   // Constructeur
      public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
      }
    
    // Accesseur
    public String getAuteur() {
     return auteur;
    }

   // Modificateur
   void setNbPages(int n) {
    nbPages = nb;
   }
*/


       	public class Livre{
    // Variables
     private String titre, auteur;
    private int nbPages;//Erreur no1 -> ; omise
   // Constructeur
      public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
      }
    
    // Accesseur
    public String getAuteur() {
     return auteur;
    }

   // Modificateur
   void setNbPages(int n) {
    nbPages = n;//Erreur no2 -> n à la place de nb
   }
    
   public static void main(String[] args) {
   	  Livre l1 = new Livre("Sigmund Freud","Le moi et le Ça");
   	  Livre l2 = new Livre("Nietzshe","Par delà le bien et le mal");
   	  System.out.println("L'auteur du premier livre est "+ l1.auteur);//par attribut
      System.out.println("L'auteur du deuxième livre est "+ l2.getAuteur());//par méthode
   }
}
