public class RectApp {
    public static void main (String[] args) {
        Rect r1 = new Rect(1,1, 10,10);
        r1.print();
    }
}
class Rect {
    int x, y;
    int w, h;
    Rect (int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    
        drag(2,3);
    }



    void print () {
        System.out.format("Retangulo de tamanho (%d,%d) na posicao (%d,%d). Area: %d\n",
            this.w, this.h, this.x, this.y, area());
    }

    int area () { 
        int area = x * y;
        return area;
    }
  
    void drag (int dx, int dy){
       
       this.x = x + dx;
       this.y = y + dy;
        

    }

}