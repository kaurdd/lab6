import javax.lang.model.util.ElementScanner6;

class Tree {
  private String treeName;
  private String treeType;
  private boolean leavesFall;
  private String leafColor;

  Tree() {
    treeName ="";
    treeType ="";
    leavesFall = false;
    leafColor = "";
  }

    Tree (String aTreeName, String aTreeType, boolean aleavesfall, String aleafColor) {
      treeName = aTreeName;
      treeType = aTreeType;
      leavesFall = aleavesfall;
      leafColor = aleafColor;
    }

    void setTreeName(String theTreeName){
      treeName = theTreeName;
    }
    void setTreeType(String theTreeType){
      treeType = theTreeType;
    }
    void setLeavesFall(boolean theLeavesFall){
      leavesFall = theLeavesFall;
    }
    void setLeafColor(String theLeafColor){
      leafColor = theLeafColor;
    }

    String getType(){
      return treeType;
    }
    String getTreeName(){
      return treeName;
    }
    boolean getLeavesFall(){
      return leavesFall;
    }
    String getLeafColor(){
      return leafColor;
    }
    
  void print(){
    String dummy = "";
    if (leavesFall == true)
      dummy = "does";
      else
      dummy = "does not";

      System.out.println("this is a " + treeName + "tree. It is a " + treeType + " and its leaves are currently " + leafColor + ". It " + dummy + " lose its leaves for the winter");
  }



  }
  