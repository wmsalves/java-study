package exercicios.oo.heranca;

public class Jogador {

    public int vida = 150;
    public int x;
    public int y;

    protected Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean atacar(Jogador oponente){
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1){
            oponente.vida-=20;
            return true;
        } else if(deltaX == 1 && deltaY == 0){
            oponente.vida-=10;
            return true;
        } else {
            return true;
        }
    }
    public boolean andar(Direcao direcao){
        switch(direcao){
            case NORTH:
                y--;
                break;
            case EAST:
                x++;
                break;
            case SOUTH:
                y++;
            case WEST:
                x--;
                break;
        }
        return true;
    }
}
