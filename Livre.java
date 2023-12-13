
       	public class Livre{
    // Variables
     private String titre, auteur;
    private int nbPages;
   // Constructeur
      public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
      }
      
         public Livre() {
           auteur = auteur;
          titre = titre;
          nbPages = nbPages;

        }

       public Livre(String unAuteur, String unTitre, int nbPages) {
        auteur = unAuteur;
        titre = unTitre;
        this.nbPages = nbPages;
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
        System.exit(0);//permet l'arrêt du programme
   }

     void setAuteur(String  unAuteur) {
      auteur = unAuteur;
   }

    void setTitre(String unTitre){
        titre = unTitre;
    }
    
    void afficheToi(){
        System.out.println(toString());
    }
    
    public String toString(){
       String description = "Description du livre : \n Auteur = "+auteur+"\n Titre = "+titre+"\n Nombres de pages = "+nbPages;
       return description;
    }
}
