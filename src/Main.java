import java.util.ArrayList;

public class Main
{
    public static void main (String argv[])
    {
        ///criação do objeto mundo
        Mundo meuMundo = new Mundo();

        ///criação do objeto padrao de coordenadas de semaforos
        CoordenadasSemaforos coordenadas = new CoordenadasSemaforos();

        ///criação da lista que armazena os objetos semaforos do Q1
        ArrayList <Semaforo> semaforosQ1 = new ArrayList<>();

        ///adiciona os objetos semaforos com as coordenadas padrão na lista do Q1
        for (int i=0; i < coordenadas.getSizeQ1(); i++)
        {
            semaforosQ1.add(new Semaforo(coordenadas.getCoordenadasXQ1(i), coordenadas.getCoordenadasYQ1(i), coordenadas.getVerdeQ1(i)));
        }

        ///boleano que gerencia se os veiculos entrados pelo usuario chegaram ao destino final
        boolean cheguei = false;

        ///loop infinito de execução do programa
        while (true)
        {
            ///loop de execução enquanto os veiculos nao chegam ao destino
            while (!cheguei)
            {
                ///popula os semaforos do Q1 no mundo
                for (int i=0; i < semaforosQ1.size(); i++)
                {
                    meuMundo.populaSemaforoQ1(semaforosQ1.get(i));
                }

                ///desenha o mundo com os quadrantes 1 e 2
                meuMundo.desenhaMundo(meuMundo.getMundoQ1(), meuMundo.getMundoQ2());
                ///desenha o mundo com os quadrantes 3 e 4
                meuMundo.desenhaMundo(meuMundo.getMundoQ3(), meuMundo.getMundoQ4());
                ///pausa a execução do programa pelo tempo determinado
                meuMundo.pausaMundo();
            }
        }
    }
}
