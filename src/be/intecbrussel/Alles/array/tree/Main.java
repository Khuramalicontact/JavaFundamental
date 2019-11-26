package be.intecbrussel.Alles.array.tree;

public class Main {


    public static void main(String[] args) {
      Tree tree = new Tree();


      for(int i = 0; i < 16;i++) {
            TreeElement e = new TreeElement();
            tree.addelement(e);
            System.out.println("Element added to tree");


        }
tree.showCounter();

    }


}




