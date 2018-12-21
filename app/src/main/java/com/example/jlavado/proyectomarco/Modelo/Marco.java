package com.example.jlavado.proyectomarco.Modelo;

import java.util.ArrayList;

public class Marco {

    private int id;
    private String campo1;
    private String campo2;
    private String campo3;
    private String campo4;
    private String campo5;
    private String campo6;
    private String campo7;
    private String campo8;
    private String campo9;
    private String campo10;

    public Marco(int id, String campo1, String campo2, String campo3, String campo4, String campo5, String campo6, String campo7, String campo8, String campo9, String campo10) {
        this.id = id;
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;
        this.campo5 = campo5;
        this.campo6 = campo6;
        this.campo7 = campo7;
        this.campo8 = campo8;
        this.campo9 = campo9;
        this.campo10 = campo10;
    }

    public int getId() {
        return id;
    }

    public String getCampo1() {
        return campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public String getCampo4() {
        return campo4;
    }

    public String getCampo5() {
        return campo5;
    }

    public String getCampo6() {
        return campo6;
    }

    public String getCampo7() {
        return campo7;
    }

    public String getCampo8() {
        return campo8;
    }

    public String getCampo9() {
        return campo9;
    }

    public String getCampo10() {
        return campo10;
    }

//    public  String toString ()
//    { return  this.campo1+"-"+this.campo2+"-"+this.campo3+"-"+this.campo4+"-"+this.campo5+"-"+this.campo6+"-"+this.campo7;}
     public  String toString ()
     { return  this.campo1;}



    public static ArrayList<Marco> getMarcos(){
        ArrayList<Marco> marcos=new ArrayList<>();
        marcos.add(new Marco(1,"aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa","aaa"));
        marcos.add(new Marco(2,"bbb","bbb","bbb","bbb","bbb","bbb","bbb","bbb","bbb","bbb"));
        marcos.add(new Marco(3,"ccc","ccc","ccc","ccc","ccc","ccc","ccc","ccc","ccc","ccc"));
        marcos.add(new Marco(4,"ddd","ddd","ddd","ddd","ddd","ddd","ddd","ddd","ddd","ddd"));
        marcos.add(new Marco(5,"eee","eee","eee","eee","eee","eee","eee","eee","eee","eee"));
        marcos.add(new Marco(6,"fff","fff","fff","fff","fff","fff","fff","fff","fff","fff"));
        marcos.add(new Marco(7,"ggg","ggg","ggg","ggg","ggg","ggg","ggg","ggg","ggg","ggg"));
        marcos.add(new Marco(8,"hhh","hhh","hhh","hhh","hhh","hhh","hhh","hhh","hhh","hhh"));
        marcos.add(new Marco(9,"iii","iii","iii","iii","iii","iii","iii","iii","iii","iii"));
        marcos.add(new Marco(10,"jjj","jjj","jjj","jjj","jjj","jjj","jjj","jjj","jjj","jjj"));
        return marcos;
    }

}
