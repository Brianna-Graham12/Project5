# Project5
package Project5; 

/** 
Represenst a single pointin the maze

each node must have a label used for BST ordering 
life points that hero can collect 

*/

public class MazeNode implements Comparable<MazeNode> {

  private String label;  

  // unique identifier 

  private int lifePoints; 

  // points gained at node 

  // Constructor with label and points 

  public MazeNode(String label, int lifePoints) {
    this.label = label; 
    this.lifePoints = lifePoints; 
    
  }
  
  // Returns label of node

  public String getLabel(){

    return label;
  }

// returns lifePoints 

  public int getLifePoints(){

    return lifePoints;
  }

  // Compare nnodes based on label alphabet ordering 

  @Override 
  public int compareTo(MazeNode other) {
    return this.label.compareTo(other.label);
  }

  // Returns String

  @Override
  public String toString() {

    return label + " " + lifePoints;
  }

  
}
