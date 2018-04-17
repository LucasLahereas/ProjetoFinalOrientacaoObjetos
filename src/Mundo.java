public class Mundo
{
    public Mundo()
    {
        reiniciaMundo();
    }

    public void reiniciaMundo()
    {
        mundoQ1 = new int[][] //60x60 primeiro quadrante / 31 semaforos / y cruzamentos
                {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,5,0,5,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,0,5,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0,1,0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,1,1,1,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0}
                ,{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,0,1,0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,5,0,5,5,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,5,0,5,0,0,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{1,1,1,1,1,1,1,0,5,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,2,2,2,2,0,0,0}
                ,{1,1,1,1,1,1,1,0,5,0,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}
                ,{1,1,1,1,1,1,1,0,5,2,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                ,{1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{5,5,5,5,5,5,5,5,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{2,2,2,0,2,2,2,2,0,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,0,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{5,5,5,5,5,5,5,5,5,5,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
                ,{0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,5,2,5,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    }

    public void desenhaMundo()
    {
        for (int i = 0; i < 60; i++)
        {
            for (int j = 0; j < 60; j++)
            {
                if(mundoQ1[i][j] == 1) //quarteirao - azul
                {
                    System.out.printf("\33[7;34m \33[0m");
                }

                else if(mundoQ1[i][j] == 0) //rua - preta
                {
                    System.out.printf("\33[7;30m \33[0m");
                }

                else if(mundoQ1[i][j] == 2) //faixa - branca
                {
                    System.out.printf("\33[7;37m \33[0m");
                }

                else if(mundoQ1[i][j] == 3) //semarofo - vermelho
                {
                    System.out.printf("\33[7;31m \33[0m");
                }

                else if(mundoQ1[i][j] == 4) //semaforo - verde
                {
                    System.out.printf("\33[7;32m \33[0m");
                }

                else if(mundoQ1[i][j] == 5) //caminho possivel para o carro para direita - preta
                {
                    System.out.printf("\33[7;30m \33[0m");
                }

                else if(mundoQ1[i][j] == 6) //caminho possivel para o carro para esquerda - preta
                {
                    System.out.printf("\33[7;30m \33[0m");
                }

                else if(mundoQ1[i][j] == 7) //caminho possivel para o carro para cima - preta
                {
                    System.out.printf("\33[7;30m \33[0m");
                }

                else if(mundoQ1[i][j] == 8) //caminho possivel para o carro para baixo - preta
                {
                    System.out.printf("\33[7;30m \33[0m");
                }

                else if(mundoQ1[i][j] == 9) //carros - ciano
                {
                    System.out.printf("\33[7;36m \33[0m");
                }
            }

            System.out.printf("\n");
        }
    }

    public void voltaComeco()
    {
        for (int i = 0; i < 60; i++)
        {
            System.out.printf("\33[A");
        }
    }

    public void populaSemaforoQ1(Semaforo farol)
    {
        if(farol.getVerde() == true)
        {
            mundoQ1[farol.getX()][farol.getY()] = 4;
        }
        else
        {
            mundoQ1[farol.getX()][farol.getY()] = 3;
        }
    }

    public void pausaMundo()
    {
        try
        {
            Thread.sleep(500); //funcao para dar uma pequena pausa
        }
        catch (InterruptedException e) { }
    }

    protected int mundoQ1[][], mundoQ2[][], mundoQ3[][], mundoQ4[][];
}
