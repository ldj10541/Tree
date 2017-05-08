
public class Main {
  public static void main(String[] args) {
    //Creates a Tree called myTree
    Tree myTree = new Tree();
    
    //Tests importTxt method
    myTree.importTxt("example.txt");
    
    System.out.println("-----------------------");
    
    //Tests printFrequencyHist method
    System.out.println("Word Frequency Histogram of example.txt:");
    myTree.printFrequencyHist();
  }
}