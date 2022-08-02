import java.util.Scanner;

public class not {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int mat,fzk,trk,kmy,mzk;
        double ort;

        System.out.print("Matematik notu : ");
        mat=inp.nextInt();

        System.out.print("Fizik notu : ");
        fzk=inp.nextInt();

        System.out.print("Turkce notu : ");
        trk=inp.nextInt();

        System.out.print("Kimya notu : ");
        kmy=inp.nextInt();

        System.out.print("Muzik notu : ");
        mzk=inp.nextInt();

        if(mat<0||mat>100)
        {
           mat=0;
        }
        if(fzk<0||fzk>100)
        {
            fzk=0;
        }
        if(trk<0||trk>100)
        {
            trk=0;
        }
        if(kmy<0||kmy>100)
        {
            kmy=0;
        }
        if(mzk<0||mzk>100)
        {
            mzk=0;
        }
        ort=(mat+fzk+trk+kmy+mzk)/5;

        if(ort>=55)
        {
            System.out.print("Tebrikler sinifi gectiniz..." +ort);
        }
        else
        {
            System.out.print("Sinifta kaldiniz :("+ort);
        }

    }
    }
