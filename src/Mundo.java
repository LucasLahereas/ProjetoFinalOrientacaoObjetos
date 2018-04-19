public class Mundo
{
    public Mundo()
    {
        reiniciaMundos();
    }

    public void reiniciaMundoQ1()
    {
        mundoQ1 = new int[][] //60x60 primeiro quadrante / 31 semaforos / 13 cruzamentos
                {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,0,0,0,10,10,10,10,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,11,11,11,11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12,12,12,12,12}
                ,{6,6,6,6,6,6,6,6,6,6,10,10,10,10,10,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,11,11,11,11,11,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,12,12,12,12,12}
                ,{2,2,2,2,0,0,2,2,2,2,10,10,10,10,10,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,11,11,11,11,11,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,12,12,12,12,12}
                ,{5,5,5,5,5,5,5,5,5,5,10,10,10,10,10,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,11,11,11,11,11,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,12,12,12,12,12}
                ,{0,0,0,0,0,0,0,0,0,0,10,10,10,10,10,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,11,11,11,11,11,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,12,12,12,12,12}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{0,0,0,0,0,0,0,0,0,0,13,13,13,13,13,0,0,0,0,0,0,0,0,0,14,14,14,14,14,0,0,0,0,0,0,15,15,15,15,15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,16,16,16,16}
                ,{6,6,6,6,6,6,6,6,6,6,13,13,13,13,13,6,6,6,6,6,6,6,6,6,14,14,14,14,14,6,6,6,6,6,6,15,15,15,15,15,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,16,16,16,16,16}
                ,{2,2,2,2,0,0,2,2,2,2,13,13,13,13,13,2,2,2,2,0,0,2,2,2,14,14,14,14,14,0,0,2,2,2,2,15,15,15,15,15,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,16,16,16,16,16}
                ,{5,5,5,5,5,5,5,5,5,5,13,13,13,13,13,5,5,5,5,5,5,5,5,5,14,14,14,14,14,5,5,5,5,5,5,15,15,15,15,15,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,16,16,16,16,16}
                ,{0,0,0,0,0,0,0,0,0,0,13,13,13,13,13,0,0,0,0,0,0,0,0,0,14,14,14,14,14,0,0,0,0,0,0,15,15,15,15,15,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,16,16,16,16}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,5,2,5,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,17,17,17,17,17,0,0,0,0,0,0,0,0,0,0,0,18,18,18,18,18,0,0,0,0,0,0,0,0,0,0,19,19,19,19,19}
                ,{6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,17,17,1,17,17,6,6,6,6,6,6,6,6,6,6,6,18,18,18,18,18,6,6,6,6,6,6,6,6,6,6,19,19,19,19,19}
                ,{0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,17,1,1,1,17,0,2,2,2,2,0,0,2,2,2,2,18,18,18,18,18,2,2,2,2,0,0,2,2,2,2,19,19,19,19,19}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,17,17,1,17,17,5,5,5,5,5,5,5,5,5,5,5,18,18,18,18,18,5,5,5,5,5,5,5,5,5,5,19,19,19,19,19}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,17,17,17,17,17,0,0,0,0,0,0,0,0,0,0,0,18,18,18,18,18,0,0,0,0,0,0,0,0,0,0,19,19,19,19,19}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,5,2,5,0,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,21,21,21,21,21,0,0,0,0,0,0,0,0,0,0,0,22,22,22,22,22,0,0,0,0,0,0,0,0,0,0,0,0,23,23,23,23,23,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,21,21,21,21,21,6,6,6,6,6,6,6,6,6,6,6,22,22,22,22,22,6,6,6,6,6,6,6,6,6,6,6,6,23,23,23,23,23,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6}
                ,{1,1,1,1,1,1,1,21,21,21,21,21,2,2,2,2,0,0,2,2,2,2,0,22,22,22,22,22,2,2,2,2,0,0,2,2,2,2,0,0,23,23,23,23,23,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2}
                ,{1,1,1,1,1,1,1,21,21,21,21,21,5,5,5,5,5,5,5,5,5,5,5,22,22,22,22,22,5,5,5,5,5,5,5,5,5,5,5,5,23,23,23,23,23,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{1,1,1,1,1,1,1,21,21,21,21,21,0,0,0,0,0,0,0,0,0,0,0,23,22,22,22,22,0,0,0,0,0,0,0,0,0,0,0,0,23,23,23,23,23,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,20,20,20,20,20,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{6,6,6,6,6,6,6,20,20,20,20,20,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{2,0,0,2,2,2,2,20,20,20,20,20,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{5,5,5,5,5,5,5,20,20,20,20,20,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,20,20,20,20,20,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

    }

    public void reiniciaMundoQ2()
    {
        mundoQ2 = new int[][] //60x60 quarto quadrante / 28 semaforos / 11 cruzamentos
                {{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,0,0,30,30,30,30,30,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,31,31,31,31,31,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{6,6,6,6,6,6,6,6,6,30,30,30,30,30,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,31,31,31,31,31,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{2,2,2,0,0,2,2,2,2,30,30,30,30,30,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,31,31,31,31,31,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{5,5,5,5,5,5,5,5,5,30,30,30,30,30,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,31,31,31,31,31,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,0,0,30,30,30,30,30,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,31,31,31,31,31,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,32,32,32,32,32,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,33,33,33,33,33,0,0,0,0,5,0,34,34,34,34,34,0,0,0,35,35,35,35,35,0,0,0}
                ,{1,1,1,1,1,1,1,1,1,32,32,32,32,32,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,33,33,33,33,33,6,6,6,6,6,6,34,34,34,34,34,6,6,6,35,35,35,35,35,6,6,6}
                ,{1,1,1,1,1,1,1,1,1,32,32,32,32,32,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,33,33,33,33,33,0,0,0,0,0,0,34,34,34,34,34,5,0,0,35,35,35,35,35,0,0,0}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,36,36,36,36,36,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,36,36,36,36,36,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,36,36,36,36,36,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,36,36,36,36,36,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,36,36,36,36,36,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{42,42,42,42,42,0,0,0,0,37,37,37,37,37,0,0,0,0,0,0,0,0,0,0,38,38,38,38,38,0,0,0,0,0,0,0,0,0,0,0,39,39,39,39,39,0,0,0,0,0,0,0,40,40,40,40,40,0,0,0}
                ,{42,42,42,42,42,6,6,6,6,37,37,37,37,37,6,6,6,6,6,6,6,6,6,6,38,38,38,38,38,6,6,6,6,6,6,6,6,6,6,6,39,39,39,39,39,6,6,6,6,6,6,6,40,40,40,40,40,6,6,6}
                ,{42,42,42,42,42,2,2,2,2,37,37,37,37,37,2,2,2,2,0,0,2,2,2,2,38,38,38,38,38,2,2,2,2,0,0,2,2,2,2,0,39,39,39,39,39,2,2,2,2,0,0,2,40,40,40,40,40,0,2,2}
                ,{42,42,42,42,42,5,5,5,5,37,37,37,37,37,5,5,5,5,5,5,5,5,5,5,38,38,38,38,38,5,5,5,5,5,5,5,5,5,5,5,39,39,39,39,39,5,5,5,5,5,5,5,40,40,40,40,40,5,5,5}
                ,{42,42,42,42,42,0,0,0,0,37,37,37,37,37,0,0,0,0,0,0,0,0,0,0,38,38,38,38,38,0,0,0,0,0,0,0,0,0,0,0,39,39,39,39,39,0,0,0,0,0,0,0,40,40,40,40,40,0,0,0}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,41,41,41,41,41,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,41,41,41,41,41,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,41,41,41,41,41,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,41,41,41,41,41,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,41,41,41,41,41,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};

    }

    public void reiniciaMundoQ3()
    {
        mundoQ3 = new int[][]//60x60 Quadrante 3 /17 semáforos/16 cruzamentos
                {{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,61,61,61,61,61,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,61,61,61,61,61,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,61,61,61,61,61,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,61,61,61,61,61,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,61,61,61,61,61,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,50,50,50,50,50,0,0,0,0,0,0,0,0,0,0,52,52,52,52,52,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,50,50,50,50,50,6,6,6,6,6,6,6,6,6,6,52,52,52,52,52,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,50,50,50,50,50,2,2,2,2,0,0,2,2,2,2,52,52,52,52,52,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,50,50,50,50,50,5,5,5,5,5,5,5,5,5,5,52,52,52,52,52,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,50,50,50,50,50,0,0,0,0,0,0,0,0,0,0,52,52,52,52,52,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,53,53,53,53,53,0,0,0,0,0,0,0,0,0,0,0,0,0,51,51,51,51,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,53,53,53,53,53,6,6,6,6,6,6,6,6,6,6,6,6,6,51,51,51,51,51,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,53,53,53,53,53,2,2,2,2,0,0,2,2,2,2,0,0,2,51,51,51,51,51,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,53,53,53,53,53,5,5,5,5,5,5,5,5,5,5,5,5,5,51,51,51,51,51,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,53,53,53,53,53,0,0,0,0,0,0,0,0,0,0,0,0,0,51,51,51,51,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,54,54,54,54,54,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,55,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{6,6,6,6,6,6,6,54,54,54,54,54,6,6,6,6,6,6,6,6,6,6,6,55,55,55,55,55,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{2,0,0,2,2,2,2,54,54,54,54,54,0,0,2,2,2,2,0,0,2,2,2,55,55,55,55,55,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{5,5,5,5,5,5,5,54,54,54,54,54,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,55,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,54,54,54,54,54,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,55,1,1,1,1,1,1,1,1,1,1,1,1,56,56,56,56,56,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,56,56,56,56,56,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,56,56,56,56,56,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,56,56,56,56,56,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,56,56,56,56,56,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,57,57,57,57,57,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{6,6,6,6,6,6,6,57,57,57,57,57,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{2,0,0,2,2,2,2,57,57,57,57,57,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{5,5,5,5,5,5,5,57,57,57,57,57,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,57,57,57,57,57,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,58,58,58,58,58,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,58,58,58,58,58,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,58,58,58,58,58,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,58,58,58,58,58,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,58,58,58,58,58,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,59,59,59,59,59,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,60,60,60,60,60,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,59,59,59,59,59,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,60,60,60,60,60,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,59,59,59,59,59,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,60,60,60,60,60,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,59,59,59,59,59,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,60,60,60,60,60,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,59,59,59,59,59,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,60,60,60,60,60,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    }

    public void reiniciaMundoQ4()
    {
        mundoQ4 = new int[][] // 60x60 quarto quadrante / 37 semaforos / 18 cruzamentos
                {{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,70,70,70,70,70,0,0,0,0,0,0,71,71,71,71,71,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,72,72,72,72,72,0,0,0,0,0,0,0,73,73,73,73,73,0,0,0}
                ,{0,0,0,69,69,69,69,69,1,70,70,70,70,70,6,6,6,6,6,6,71,71,71,71,71,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,72,72,72,72,72,6,6,6,6,6,6,6,73,73,73,73,73,6,6,6}
                ,{6,6,6,69,69,69,69,69,1,70,70,70,70,70,0,2,2,2,2,0,71,71,71,71,71,2,2,2,2,0,0,2,2,2,2,0,2,2,2,2,72,72,72,72,72,2,2,2,0,0,2,2,73,73,73,73,73,2,2,2}
                ,{2,2,2,69,69,69,69,69,1,70,70,70,70,70,5,5,5,5,5,5,71,71,71,71,71,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,72,72,72,72,72,5,5,5,5,5,5,5,73,73,73,73,73,5,5,5}
                ,{5,5,5,69,69,69,69,69,1,70,70,70,70,70,0,0,0,0,0,0,71,71,71,71,71,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,72,72,72,72,72,0,0,0,0,0,0,0,73,73,73,73,73,0,0,0}
                ,{0,0,0,69,69,69,69,69,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{0,0,0,74,74,74,74,74,0,0,0,0,75,75,75,75,75,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{6,6,6,74,74,74,74,74,6,6,6,6,75,75,75,75,75,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1}
                ,{2,2,2,74,74,74,74,74,2,2,2,2,75,75,75,75,75,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{5,5,5,74,74,74,74,74,5,5,5,5,75,75,75,75,75,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{0,0,0,74,74,74,74,74,0,0,0,0,75,75,75,75,75,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,0,8,2,7,0,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,76,76,76,76,76,0,0,0,77,77,77,77,77,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,78,78,78,78,78,0,0,0,0,0,79,79,79,79,79,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,76,76,76,76,76,6,6,6,77,77,77,77,77,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,78,78,78,78,78,6,6,6,6,6,79,79,79,79,79,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,76,76,76,76,76,2,2,2,77,77,77,77,77,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,78,78,78,78,78,0,2,2,2,2,79,79,79,79,79,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,76,76,76,76,76,5,5,5,77,77,77,77,77,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,78,78,78,78,78,5,5,5,5,5,79,79,79,79,79,1,1,1}
                ,{1,1,1,0,8,0,7,0,1,1,1,1,76,76,76,76,76,0,0,0,77,77,77,77,77,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,78,78,78,78,78,0,0,0,0,0,79,79,79,79,79,1,1,1}
                ,{1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,80,80,80,80,80,0,0,0,0,81,81,81,81,81,0,0,0,82,82,82,82,82,0,0,0,0,0,83,83,83,83,83,1,1,1,1,1,1,1,84,84,84,84,84,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{6,6,6,80,80,80,80,80,6,6,6,6,81,81,81,81,81,6,6,6,82,82,82,82,82,5,5,5,5,5,83,83,83,83,83,1,1,1,1,1,1,1,84,84,84,84,84,6,6,6,6,6,6,6,6,6,6,6,6,6}
                ,{2,2,2,80,80,80,80,80,2,2,2,2,81,81,81,81,81,2,2,2,82,82,82,82,82,2,2,0,2,2,83,83,83,83,83,1,1,1,1,1,1,1,84,84,84,84,84,2,2,2,2,0,0,2,2,2,2,0,0,2}
                ,{0,0,0,80,80,80,80,80,0,0,0,0,81,81,81,81,81,0,0,0,82,82,82,82,82,5,5,5,5,5,83,83,83,83,83,1,1,1,1,1,1,1,84,84,84,84,84,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,0,0,80,80,80,80,80,0,0,0,0,81,81,81,81,81,0,0,0,82,82,82,82,82,0,0,0,0,0,83,83,83,83,83,1,1,1,1,1,1,1,84,84,84,84,84,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,8,0,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,0,7,0,1,1,1,1,0,8,0,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,0,7,0,1,1,1,1,0,8,0,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,85,85,85,85,85,1,1,1,1,1,1,1,86,86,86,86,86,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,85,85,85,85,85,1,1,1,1,1,1,1,86,86,86,86,86,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,85,85,85,85,85,1,1,1,1,1,1,1,86,86,86,86,86,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,85,85,85,85,85,1,1,1,1,1,1,1,86,86,86,86,86,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,85,85,85,85,85,1,1,1,1,1,1,1,86,86,86,86,86,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,0,7,0,1,1,1,1,0,8,0,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,0,7,0,1,1,1,1,0,8,0,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,0,8,0,1,1,1,1,1,1,1,0,8,0,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,0,7,2,7,0,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,8,2,8,0,1,1,1,1,1,1,1,0,8,2,7,0,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    }

    public void reiniciaMundos()
    {
        reiniciaMundoQ1();
        reiniciaMundoQ2();
        reiniciaMundoQ3();
        reiniciaMundoQ4();
    }

    public void desenhaMundo(int[][] q1, int[][] q2)
    {
        for (int i = 0; i < 60; i++)
        {
            for (int j = 0; j < 60; j++)
            {
                desenhaLinha(q1, i, j);
            }

            for (int j = 0; j < 60; j++)
            {
                desenhaLinha(q2, i, j);
            }

            System.out.printf("\n");
        }
    }

    public void desenhaLinha(int[][] quadrante, int i, int j)
    {
        if(quadrante[i][j] == 1) //quarteirao - azul
        {
            System.out.printf("\33[7;34m  \33[0m");
        }

        else if(quadrante[i][j] == 0) //rua - preta
        {
            System.out.printf("\33[7;30m  \33[0m");
        }

        else if(quadrante[i][j] == 2) //faixa - branca
        {
            System.out.printf("\33[7;37m  \33[0m");
        }

        else if(quadrante[i][j] == 3) //semarofo - vermelho
        {
            System.out.printf("\33[7;31m  \33[0m");
        }

        else if(quadrante[i][j] == 4) //semaforo - verde
        {
            System.out.printf("\33[7;32m  \33[0m");
        }

        else if(quadrante[i][j] == 5) //caminho possivel para o carro para direita - preta
        {
            System.out.printf("\33[7;30m  \33[0m");
        }

        else if(quadrante[i][j] == 6) //caminho possivel para o carro para esquerda - preta
        {
            System.out.printf("\33[7;30m  \33[0m");
        }

        else if(quadrante[i][j] == 7) //caminho possivel para o carro para cima - preta
        {
            System.out.printf("\33[7;30m  \33[0m");
        }

        else if(quadrante[i][j] == 8) //caminho possivel para o carro para baixo - preta
        {
            System.out.printf("\33[7;30m  \33[0m");
        }

        else if(quadrante[i][j] == 9) //carros - ciano
        {
            System.out.printf("\33[7;36m  \33[0m");
        }

        else if(quadrante[i][j] >= 10 && quadrante[i][j] <= 99) //intersecções - preta
        {
            System.out.printf("\33[7;30m  \33[0m");
        }
    }

    public void voltaComeco()
    {
        for (int i = 0; i < 120; i++)
        {
            System.out.printf("\33[A");
        }
    }

    public void populaSemaforoQ1(Semaforo farol)
    {
        if(farol.getVerde() == true)
        {
            mundoQ1[farol.getY()][farol.getX()] = 4;
        }
        else
        {
            mundoQ1[farol.getY()][farol.getX()] = 3;
        }
    }

    public void populaSemaforoQ2(Semaforo farol)
    {
        if(farol.getVerde() == true)
        {
            mundoQ2[farol.getY()][farol.getX()] = 4;
        }
        else
        {
            mundoQ2[farol.getY()][farol.getX()] = 3;
        }
    }

    public void populaSemaforoQ3(Semaforo farol)
    {
        if(farol.getVerde() == true)
        {
            mundoQ3[farol.getY()][farol.getX()] = 4;
        }
        else
        {
            mundoQ3[farol.getY()][farol.getX()] = 3;
        }
    }

    public void populaSemaforoQ4(Semaforo farol)
    {
        if(farol.getVerde() == true)
        {
            mundoQ4[farol.getY()][farol.getX()] = 4;
        }
        else
        {
            mundoQ4[farol.getY()][farol.getX()] = 3;
        }
    }

    public void pausaMundo()
    {
        try
        {
            Thread.sleep(500000); //funcao para dar uma pequena pausa
        }
        catch (InterruptedException e) { }
    }

    public int getLocalizacao(int quadrante, int x, int y)
    {
        if(quadrante == 1)
        {
            return mundoQ1[x][y];
        }

        else if (quadrante == 2)
        {
            return mundoQ2[x][y];
        }

        else if (quadrante == 3)
        {
            return mundoQ3[x][y];
        }

        else
        {
            return mundoQ4[x][y];
        }
    }

    public int[][] getMundoQ1()
    {
        return mundoQ1;
    }

    public int[][] getMundoQ2()
    {
        return mundoQ2;
    }

    public int[][] getMundoQ3()
    {
        return mundoQ3;
    }

    public int[][] getMundoQ4()
    {
        return mundoQ4;
    }

    protected int mundoQ1[][], mundoQ2[][], mundoQ3[][], mundoQ4[][];
}
