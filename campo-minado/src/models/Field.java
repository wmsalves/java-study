package models;

import exception.ExplosionException;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private int line;
    private int column;

    private boolean open = false;
    private boolean mined = false;
    private boolean marked = false;

    private List<Field> neighbors = new ArrayList<>();
    Field(int line, int column) {
        this.line = line;
        this.column = column;
    }

    boolean addNeighbor(Field neighbor) {
        boolean differentLine = line != neighbor.line;
        boolean differentColumn = column != neighbor.column;
        boolean diagonal = differentLine && differentColumn;

        int deltaLine = Math.abs(line - neighbor.line);
        int deltaColumn = Math.abs(column - neighbor.column);
        int delta = deltaLine + deltaColumn;

        if(delta == 1 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        } else if(delta == 2 && !diagonal) {
            neighbors.add(neighbor);
            return true;
        } else {
            return false;
        }
    }
    void changeMarked(){
        if(!open){
            marked = !marked;
        }
    }
    boolean open(){
        if(!open && !marked){
            open = true;
            if(mined){
                throw new ExplosionException();
            }
            if(neighborsSafe()){
                neighbors.forEach(v -> v.open());
            }
            return true;
        } else {
            return false;
        }
    }

    boolean neighborsSafe(){
        return neighbors.stream().noneMatch(v -> v.mined);
    }

    void mine() {
        mined = true;
    }

    public boolean isMined() {
        return mined;
    }

    public boolean isMarked() {
        return marked;
    }

    void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return !isOpen();
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    boolean goalAchieved() {
        boolean uncovered = !mined && open;
        boolean secured = mined && marked;
        return uncovered || secured;
    }

    long minesOnNeighbours() {
        return neighbors.stream().filter(v -> v.mined).count();
    }

    void restart() {
        mined = false;
        open = false;
        marked = false;
    }

    public String toString() {
        if(marked){
            return "x";
        } else if(open && mined){
            return "*";
        } else if(open && minesOnNeighbours() > 0){
            return Long.toString(minesOnNeighbours());
        } else if(open){
            return "";
        } else {
            return "?";
        }
    }
}
