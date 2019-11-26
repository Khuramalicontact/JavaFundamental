package be.intecbrussel.Alles.array.tree;

public class Tree {
    private TreeElement[]  elements = new TreeElement[20];

    private Counter counter = new Counter();

    public void addelement(TreeElement element){


        for(int i = 0; i < elements.length; i++) {
            if(this.elements[i] == null){
                this.elements[i] = element;
                this.counter.increment();
                break;
            }

        }







}

public void showCounter(){
        this.counter.showCounter();


}

}
