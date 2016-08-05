package com.theironyard.charlotte;

/**
 * Created by guest on 8/4/16.
 */
public class Tree {
    String typeOfTree;
    int ageOfTree;
    boolean treePrunedRecently;

    public Tree(String typeOfTree, int ageOfTree, boolean treePrunedRecently) {
        this.typeOfTree = typeOfTree;
        this.ageOfTree = ageOfTree;
        this.treePrunedRecently = treePrunedRecently;
    }

    public String getTypeOfTree() {
        return typeOfTree;
    }

    public void setTypeOfTree(String typeOfTree) {
        this.typeOfTree = typeOfTree;
    }

    public int getAgeOfTree() {
        return ageOfTree;
    }

    public void setAgeOfTree(int ageOfTree) {
        this.ageOfTree = ageOfTree;
    }

    public boolean isTreePrunedRecently() {
        return treePrunedRecently;
    }

    public void setTreePrunedRecently(boolean treePrunedRecently) {
        this.treePrunedRecently = treePrunedRecently;
    }
}
