package tgs;

public class lapangan {
    int p,l;
    
    public lapangan (int p, int l){
        this.p=p;
        this.l=l;
    }
    int getkeliling() {
         return 2*(this.p+this.l);
    }
    
}