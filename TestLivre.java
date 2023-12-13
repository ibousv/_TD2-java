public class TestLivre{
	public static void main(String[] args) {

		//Creation du premier livre avec le constructeur sans arguments
		Livre l1 = new Livre();
		 l1.setAuteur("Ibrahima Fall");
		  l1.setTitre("The Back-End Philosophy");
		   l1.setNbPages(300);

		//Creation du second livre avec comme arguments le nom et le titre de l'auteur
		Livre l2 = new Livre("Nietzshe","Par delà le bien et le mal");
		 l2.setNbPages(300);

		//Creation du troisième livre avec comme arguments le nom, le titre et le nombre de pages 
		Livre l3 = new Livre("Sigmund Freud","Le moi et le Ça",300);

		System.out.println(l1);//l'instruction nous permet d'afficher les info du livre
		
	}
}
